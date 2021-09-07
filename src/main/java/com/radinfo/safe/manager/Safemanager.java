package com.radinfo.safe.manager;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.radinfo.safe.domain.http.CertiListData;
import com.radinfo.safe.domain.http.ProposalBICIData;
import com.radinfo.safe.mapper.PolicyInputMapper;
import com.radinfo.safe.request.CertiListRequset;
import com.radinfo.safe.request.LoginRequest;
import okhttp3.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Component
public class Safemanager {
    private Logger logger= LoggerFactory.getLogger(this.getClass());
    public  static Safemanager Safemanager;
    @Autowired
    private PolicyInputMapper policyInputMapper;

    @Value("${radinfo.other.safe.url}")
    private  String safeUrl;

    @PostConstruct
    public void init(){
        Safemanager=this;
        Safemanager.logger=this.logger;
        Safemanager.policyInputMapper=this.policyInputMapper;
        Safemanager.safeUrl=this.safeUrl;
    }

    public static  synchronized  int SearchCopyCertiList(String carNumber){
        Safemanager.logger.info("App-safe SearchCopyCertiList .start：" + carNumber);
        CertiListRequset certiListRequset=new CertiListRequset();
        CertiListRequset.Querydata querydata=new CertiListRequset().new Querydata();
        CertiListRequset.Pager pager=new CertiListRequset().new Pager();
        querydata.setLicenseNo(carNumber);//车牌号
        certiListRequset.setQueryData(querydata);
        certiListRequset.setPager(pager);
        Safemanager.logger.info("App-safe SearchCopyCertiList .certiListRequset：" + JSON.toJSONString(certiListRequset));
        try {
            OkHttpClient client = new OkHttpClient().newBuilder()
                    .connectTimeout(10000, TimeUnit.SECONDS)
                    .readTimeout(20000, TimeUnit.SECONDS)
                    .build();
            MediaType mediaType = MediaType.parse("application/json");
            RequestBody body = RequestBody.create(mediaType, JSON.toJSONString(certiListRequset));
            Request request = new Request.Builder()
                    .url(Safemanager.safeUrl+"/carDomainApi/proposal/main/search/copy/certiList")
                    .method("POST", body)
                    .addHeader("AUTHOR-TOKEN", CacheManager.AUTHOR_TOKEN)
                    .addHeader("Content-Type", "application/json")
                    .build();
            Response response = client.newCall(request).execute();
            String jsonStr = response.body().string();
            Safemanager.logger.info("SyncDataToSafe Login：" + jsonStr);
            JSONObject jsonObject = JSONObject.parseObject(jsonStr.trim());
            jsonStr = jsonObject.getString("data");
            int responseCode=jsonObject.getInteger("status");
            if (responseCode==0){
                Safemanager.logger.info("App-safe SearchCopyCertiList.success:"+certiListRequset.getQueryData().getLicenseNo());
                jsonObject = JSONObject.parseObject(jsonStr.trim());
                jsonStr = jsonObject.getString("data");
                List<CertiListData> list=JSONObject.parseArray(jsonStr, CertiListData.class);
                Safemanager.logger.info("App-safe SearchCopyCertiList:"+JSON.toJSONString(list));
                for (CertiListData item:list){
                    checkProposal(item.getCertiNo());
                }
            }else {
                Safemanager.logger.info("App-safe SearchCopyCertiList.false:"+certiListRequset.getQueryData().getLicenseNo());
                return -1;
            }
        }catch (Exception e){
            Safemanager.logger.error("App-safe SearchCopyCertiList.error:"+e.getMessage());
            e.printStackTrace();
            return -1;
        }
        return 0;
    }

    //https://prd.urtrust.com.cn/carDomainApi/proposal/main/check/proposal/901032123101890086691
    public static String checkProposal(String certiNo){//是否将车辆加入501032113100660000760协议下？
        Safemanager.logger.info("checkProposal start:"+certiNo);
        String jsonStr="";
        try {
            OkHttpClient client = new OkHttpClient().newBuilder()
                    .build();
            MediaType mediaType = MediaType.parse("text/plain");
            RequestBody body = RequestBody.create(mediaType, "");
            Request request = new Request.Builder()
                    .url(Safemanager.safeUrl+"/carDomainApi/proposal/main/check/proposal/"+certiNo)
                    .method("POST", body)
                    .addHeader("AUTHOR-TOKEN", CacheManager.AUTHOR_TOKEN)
                    .build();
            Response response = client.newCall(request).execute();
            jsonStr = response.body().string();
            Safemanager.logger.info("checkProposal ：" + jsonStr);
//            JSONObject jsonObject = JSONObject.parseObject(jsonStr.trim());
//            jsonStr = jsonObject.getString("data");
            proposalBICI(certiNo);
        }catch (Exception e){
            Safemanager.logger.error("checkProposal error:"+e.getMessage());
            e.printStackTrace();
            return null;
        }
        return jsonStr;
    }
    // https://prd.urtrust.com.cn/carDomainApi/proposal/main/search/proposalBICI/901032123101890086691
    public  static  String proposalBICI(String certiNo){//加载保单详情数据
        Safemanager.logger.info("proposalBICI start:"+certiNo);
        String jsonStr="";
        try{
            OkHttpClient client = new OkHttpClient().newBuilder()
                    .build();
            MediaType mediaType = MediaType.parse("text/plain");
            RequestBody body = RequestBody.create(mediaType, "");
            Request request = new Request.Builder()
                    .url(Safemanager.safeUrl+"/carDomainApi/proposal/main/search/proposalBICI/"+certiNo)
                    .method("POST", body)
                    .addHeader("AUTHOR-TOKEN", CacheManager.AUTHOR_TOKEN)
                    .build();
            Response response = client.newCall(request).execute();
            jsonStr = response.body().string();
            Safemanager.logger.info("proposalBICI ：" + jsonStr);
            JSONObject jsonObject = JSONObject.parseObject(jsonStr.trim());
            jsonStr = jsonObject.getString("data");
            ProposalBICIData parseObject = (ProposalBICIData) JSONObject.parseObject(jsonStr, ProposalBICIData.class);

        }catch (Exception e){
            Safemanager.logger.error("proposalBICI error:"+e.getMessage());
            e.printStackTrace();
        }
        return jsonStr;
    }
    //https://prd.urtrust.com.cn/carDomainApi/thirdpart/modelCode/search/vehicleList
    public static String searchVehicleList(){//获取车辆信息列表
//    入参：    {
//            "prpMain":{
//            "selectedUndwrtProfit":"",
//                    "inputPricedProfit":"",
//                    "factorMultiplyPricedProfit":1,
//                    "standardPricedProfit":1,
//                    "processedPricedProfit":1,
//                    "realPricedProfit":1,
//                    "profitRemark":"车队单录入，自主定价系数默认为车队协议中录入的自主定价系数：1.0",
//                    "profitC03FeeRuleId":"",
//                    "profitC03FeeRuleNo":"",
//                    "undwrtProfitList":[
//
//        ],
//            "undwrtProfitC03Valid":true,
//                    "undwrtProfitC03ValidAndArrowFactorSerialNo":true,
//                    "guangBoCertiNo":"",
//                    "commissionFlag":"1",
//                    "useGbPricedProfitFlag":"",
//                    "prePayRefTime":"2021-09-06",
//                    "isDQZInOurCompany":"1",
//                    "isArmyVehicle":"0",
//                    "isInsuredDQZNow":"1",
//                    "renewalFlag":"2",
//                    "shortRate":100,
//                    "sumBenchmarkPremium":"9159.86",
//                    "totalDisCount":0.84,
//                    "disRateModifyPower":false,
//                    "disRateTop":0,
//                    "taxDisRateTop":0,
//                    "commissionMessageList":[
//
//        ],
//            "disRateModifyFlag":false,
//                    "shareHolderName":"2",
//                    "provisonalNo":"",
//                    "classCode":"01",
//                    "riskCode":"0103",
//                    "contractNo":"501032113100660000760",
//                    "policySort":"0",
//                    "printNo":"",
//                    "businessNature":"2102",
//                    "language":"C",
//                    "policyType":"99",
//                    "appliCode":"G31012021000102",
//                    "appliName":"上海众佳汽车服务有限公司",
//                    "appliAddress":"",
//                    "insuredCode":"G31012021000102",
//                    "insuredName":"上海众佳汽车服务有限公司",
//                    "insuredAddress":"",
//                    "operateDate":"2021-09-07",
//                    "startDate":"2021-09-08",
//                    "startHour":0,
//                    "endDate":"2022-09-07",
//                    "endHour":"24",
//                    "startDateCi":"",
//                    "startHourCi":"",
//                    "endDateCi":"",
//                    "endHourCi":"",
//                    "pureRate":"",
//                    "disRate":13.679245,
//                    "taxDisRate":14.5,
//                    "discount":0.16,
//                    "currency":"CNY",
//                    "sumValue":"",
//                    "sumAmount":"1586669.40",
//                    "sumDiscount":"1465.57",
//                    "sumPremium":"",
//                    "sumSubPrem":0,
//                    "sumQuantity":1,
//                    "judicalCode":"",
//                    "judicalScope":"中国(港澳台除外)司法管辖",
//                    "autoTransRenewFlag":"",
//                    "argueSolution":"1",
//                    "arbitBoardName":"",
//                    "payTimes":1,
//                    "endorseTimes":"",
//                    "claimTimes":"",
//                    "makeCom":"31006600",
//                    "operateSite":"",
//                    "comCode":"31018900",
//                    "handlerCode":"8002083",
//                    "handler1Code":"8002083",
//                    "approverCode":"AUTO",
//                    "underwriteCode":"AUTO",
//                    "underwriteName":"AUTO",
//                    "operatorCode":"8002083",
//                    "inputDate":"2021-09-06",
//                    "inputHour":17,
//                    "underwriteEndDate":"2021-09-07",
//                    "statisticsYM":"2021-09-10 00:00:00",
//                    "agentCode":"U31000000008",
//                    "coinsFlag":"0",
//                    "reinsFlag":"0",
//                    "allinsFlag":"0",
//                    "underwriteFlag":"1",
//                    "othFlag":"200000YY000000002000",
//                    "flag":"",
//                    "disRate1":0,
//                    "businessFlag":"0",
//                    "updaterCode":"8002083",
//                    "updateDate":"2021-09-06",
//                    "updateHour":"17",
//                    "signDate":"2021-09-07T08:18:26.787Z",
//                    "shareHolderFlag":"0",
//                    "agreementNo":"U31000000008-01",
//                    "inquiryNo":"",
//                    "payMode":"",
//                    "remark":"",
//                    "policyNo":"",
//                    "visaCode":"",
//                    "manualType":"",
//                    "nationFlag":"1",
//                    "startMinute":"",
//                    "endMinute":"",
//                    "jfeeFlag":"1",
//                    "precheckDate":"2021-09-06",
//                    "handlerName":"丁沛元",
//                    "handler1Name":"丁沛元",
//                    "payRefCode":"",
//                    "payRefName":"",
//                    "payRefTime":"",
//                    "printTime":"",
//                    "agriType":"0",
//                    "subBusinessNature":"",
//                    "agriNature":"",
//                    "serviceProviders":"",
//                    "serviceType":"",
//                    "services":"",
//                    "billingWay":"",
//                    "businessChannel":"210201",
//                    "businessAgentType":"21020101",
//                    "uniteAgentChannel":"0",
//                    "businessKind":"01",
//                    "invoiceMan":"",
//                    "cardCName":"",
//                    "formatPolicyCode":"",
//                    "jfeePayType":"01",
//                    "quotationNo":"",
//                    "additionalFlag":"",
//                    "agentOperateFlag":"",
//                    "printStatus":"",
//                    "ifRemote":"",
//                    "ifMedical":"",
//                    "operateTime":"16:18:26",
//                    "saveTime":"2021-09-06 17:00:05",
//                    "businatureNo":"YL213100000029",
//                    "teamCode":"T31018900001",
//                    "sysSource":"20",
//                    "ciArmyFlag":"110",
//                    "feeRuleNo":"51041311",
//                    "feeRuleId":"042055256",
//                    "quotationNum":"",
//                    "sumPremiumOrigin":0,
//                    "reportFlag":"0",
//                    "lastYearEndDate":"",
//                    "lastYearEndDateTemp":"",
//                    "lastYearEndDateDisabled":false,
//                    "businessType":"",
//                    "upperRuleId":"",
//                    "uniqueNo":"",
//                    "additionalCostRate":0.25,
//                    "afterTaxPremium":7258.76,
//                    "sumTax":435.53,
//                    "taxRate":6,
//                    "thirdBusinessFlag":"",
//                    "recordCode":"",
//                    "proposalNo":"",
//                    "epolicyFlag":"1",
//                    "riskFlagReadOnly":false,
//                    "localTaxFlag":"0",
//                    "quoteType":"",
//                    "relatedFlag":"",
//                    "eproposalFlag":"0",
//                    "autoTransRenewflag":"",
//                    "insertTime":"",
//                    "updateTime":"",
//                    "activationNo":"",
//                    "createdBy":"8002083",
//                    "createdDate":1630918808000,
//                    "updatedBy":"8002083",
//                    "updatedDate":1630994068000,
//                    "agentBusiness":"2",
//                    "combo":"",
//                    "comboName":"",
//                    "salesExpenseRate":"",
//                    "lsiCombo":"",
//                    "lsiComboName":"",
//                    "loanPeriod":"",
//                    "beneficiaryClause":"",
//                    "allPremium":"",
//                    "einsuranceCardFlag":""
//        },
//            "prpItemcar":{
//            "otherNature8":"0",
//                    "manufacturer":"",
//                    "carCheckReasonArray":[
//            "1"
//        ],
//            "ownerAddressArray":[
//
//        ],
//            "noLicenseFlagBoolean":false,
//                    "noLicenseFlag":"0",
//                    "carLossTypeFlagName":"正常车型",
//                    "hasSafetyMonitorBoolean":false,
//                    "hasTachographBoolean":false,
//                    "carFloatValue":"0",
//                    "riskCode":"0103",
//                    "itemNo":1,
//                    "insuredTypeCode":"",
//                    "carInsuredRelation":"3",
//                    "carOwner":"上海永达汽车租赁有限公司",
//                    "clauseType":"03",
//                    "agreeDriverFlag":"0",
//                    "newDeviceFlag":false,
//                    "carPolicyNo":"",
//                    "licenseNo":"沪LY2697",
//                    "licenseColorCode":"01",
//                    "carKindCode":"A0",
//                    "hkFlag":"0",
//                    "hkLicenseNo":"",
//                    "engineNo":"496621L",
//                    "vinNo":"LGBH52E02LY103752",
//                    "frameNo":"LGBH52E02LY103752",
//                    "runAreaCode":"04",
//                    "runAreaName":"",
//                    "runMiles":"",
//                    "enrollDate":"2020-09-14",
//                    "useYears":0,
//                    "modelCode":"XYD1156DFQ",
//                    "brandName":"东风日产DFL7160VBNH6轿车",
//                    "countryNature":"B",
//                    "countryCode":"",
//                    "useNatureCode":"9A",
//                    "businessClassCode":"",
//                    "seatCount":5,
//                    "tonCount":"",
//                    "exhaustScale":1.598,
//                    "colorCode":"",
//                    "safeDevice":"",
//                    "parkSite":"",
//                    "ownerAddress":"",
//                    "otherNature":"1002 100",
//                    "rateCode":"",
//                    "makeDate":"",
//                    "carUsage":"",
//                    "currency":"CNY",
//                    "purchasePrice":98600,
//                    "actualValue":86669.4,
//                    "invoiceNo":"",
//                    "carLoanFlag":"",
//                    "insurerCode":"",
//                    "lastInsurer":"",
//                    "carCheckStatus":"2",
//                    "carChecker":"",
//                    "carCheckTime":"2021-03-23",
//                    "specialTreat":"",
//                    "relievingAreaCode":"",
//                    "addonCount":0,
//                    "carDealerCode":"",
//                    "carDealerName":"",
//                    "remark":"",
//                    "flag":"",
//                    "carCheckReason":"1",
//                    "sviolatedTimes":"",
//                    "lviolatedTimes":"",
//                    "licenseKindCode":"02",
//                    "registModelCode":"东风日产DFL7160VBNH6轿车",
//                    "secondhandCarFlag":"1",
//                    "secondhandCarPrice":"",
//                    "runAreadesc":"",
//                    "visaCode":"",
//                    "originCarPrice":98600,
//                    "carLossTypeFlag":"0",
//                    "searchSequenceNo":"",
//                    "vehicleStyleDesc":"轿车,CVT XE 经典舒适版 国Ⅵ",
//                    "extendChar1":"东风日产",
//                    "extendChar2":"DFL7160VBNH6",
//                    "extendchar3":"XYD1156DFQ",
//                    "carKindJG":"K02",
//                    "transferDate":"",
//                    "chgOwnerFlag":"0",
//                    "loanVehicleFlag":"0",
//                    "loanYear":"1",
//                    "loanLastTNo":"",
//                    "certiNo":"",
//                    "firstNoClaimYear":"",
//                    "carActualReferValue":"86669.40",
//                    "mortgageCarFlag":"0",
//                    "firstBeneficiary":"",
//                    "fuelType":"0",
//                    "aliasName":"",
//                    "certificateDate":"",
//                    "modelCodeJY":"XYD1156DFQ",
//                    "otherCarCheckReason":"",
//                    "realUseMonths":11,
//                    "realUseYears":0,
//                    "carTypeCode":"03",
//                    "customerCheckStatus":"",
//                    "modelCodeHY":"BDFJXZUC0052",
//                    "modelNameHY":"东风日产DFL7160VBNH6 经典舒适版",
//                    "basicrateCode":"",
//                    "noticeType":"DFL7160VBNH6",
//                    "carName":"东风日产DFL7160VBNH6轿车",
//                    "productType":"0101",
//                    "tradeName":"东风汽车有限公司",
//                    "brand":"日产",
//                    "deptName":"轩逸",
//                    "appointAreaCode":"-",
//                    "hasSafetyMonitor":"N",
//                    "expectedLoss":"",
//                    "carSeriesGrade":"C",
//                    "uncertainFloat":"",
//                    "hasTachograph":"N",
//                    "certificateDatefp":"2021-03-23",
//                    "factorSerialNo":"",
//                    "proposalNo":"901032123101890086691",
//                    "riskFactors":"0",
//                    "wholeWeight":"1230",
//                    "brandsFlag":"00",
//                    "rentType":"02",
//                    "saleCompany":"",
//                    "saleAreaCode":"",
//                    "sale4SFlag":"",
//                    "carPower":"",
//                    "clauseSort":"010103",
//                    "carRiskId":"",
//                    "carGradeId":"",
//                    "vehicleCheckCode":"",
//                    "policyNo":"",
//                    "runAreaDesc":"",
//                    "drivingBehavior":{
//                "certiNo":null,
//                        "certiType":null,
//                        "drivingScore":null,
//                        "drivingRating":null,
//                        "riskCode":null,
//                        "carOwner":null,
//                        "vin":null,
//                        "areaCode":null,
//                        "evaluationDate":null,
//                        "validStatus":null,
//                        "createdBy":null,
//                        "createdDate":null,
//                        "updatedBy":null,
//                        "updatedDate":null
//            },
//            "customerLabelList":[
//
//        ]
//        },
//            "isPurePremiumQuery":false,
//                "hideLoading":false
//        }
        return "";


    }

    public static  synchronized  int login(LoginRequest loginRequest){
        Safemanager.logger.info(" App-safe login .start：" + loginRequest.getUserCode());
        try {
            OkHttpClient client = new OkHttpClient().newBuilder()
                    .build();
            MediaType mediaType = MediaType.parse("application/json");
            RequestBody body = RequestBody.create(mediaType, JSON.toJSONString(loginRequest));
            Request request = new Request.Builder()
                    .url( Safemanager.safeUrl+"/carDomainApi/authorize/login")
                    .method("POST", body)
                    .addHeader("Content-Type", "application/json")
//                    .addHeader("Cookie", "SESSION=9627e1c0-c30c-4ed9-9f86-cb352c5df917")
                    .build();
            Response response = client.newCall(request).execute();
            String jsonStr = response.body().string();
            Safemanager.logger.info("App-safe Login：" + jsonStr);
            JSONObject jsonObject = JSONObject.parseObject(jsonStr.trim());
//            jsonStr = jsonObject.getString("data");
            int responseCode=jsonObject.getInteger("status");
            if (responseCode==0){
                Safemanager.logger.info("App-safe Login.success:"+loginRequest.getUserCode());
            }else {
                Safemanager.logger.info("App-safe Login.false:"+loginRequest.getUserCode());
                return -1;
            }
        }catch (Exception e){
            Safemanager.logger.error("App-safe Login.error:"+e.getMessage());
            e.printStackTrace();
            return -1;
        }
        return 0;
    }
}

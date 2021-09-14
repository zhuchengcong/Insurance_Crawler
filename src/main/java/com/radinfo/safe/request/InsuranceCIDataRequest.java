package com.radinfo.safe.request;

import com.radinfo.safe.domain.http.*;

import java.io.Serializable;
import java.util.List;

public class InsuranceCIDataRequest  implements Serializable {
    private static final long serialVersionUID = -359815175722348753L;


    private String inputDateTime;
    private String inputEditType;
    private PrpAgent prpAgent;
    private PrpCarshiptax prpCarshiptax;
    private PrpExpense prpExpense;
    private PrpHandler prpHandler;
    private PrpItemcar prpItemcar;
    private PrpCarOrigin prpCarOrigin;
    private PrpItemcarExt prpItemcarExt;
    private PrpMain prpMain;
    private PrpRenewal prpRenewal;
    private PrpCundwrtProfit prpCundwrtProfit;
    private PrpItemkindCopy prpItemkindCopy;
    private InterfQuery interfQuery;
    private CiInsureProvisonal ciInsureProvisonal;
    private CiInsureDemand ciInsureDemand;
    private CiInsureDemandSub ciInsureDemandSub;
    private PrpAddtionalImg prpAddtionalImg;
    private List<String> ciInsureDemandPayList;
    private List<CiInsureDemandLossList> ciInsureDemandLossList;
    private List<String> ciInsureDuplicatedList;
    private List<String> ciInsureDemandScoreList;
    private List<CiVehiclePriceList> ciVehiclePriceList;
    private List<PrpMainsubList> prpMainsubList;
    private List<String> prpCoinsList;
    private List<String> prpCoinsdetailList;
    private List<PrpEngageList> prpEngageList;
    private List<PrpFeeList> prpFeeList;
    private List<String> prpCardeviceList;
    private List<String> prpCarDetectItemList;
    private List<String> prpCardriverList;
    private List<PrpPlanList> prpPlanList;
    private List<PrpProfitList> prpProfitList;
    private List<PrpProfitdetailList> prpProfitdetailList;
    private List<String> prpProfitdetailExtraList;
    private List<String> prpProfitMainList;
    private List<PrpItemkindList> prpItemkindList;
    private List<PrpLimitList> prpLimitList;
    private List<PrpInsuredList> prpInsuredList;
    private List<String> prpInsuredNatureList;
    private OtherData otherData;
    private FxqMain fxqMain;
    private List<String> fxqShareHolderList;
    private FxqCustomerVo fxqCustomerVo;
    private LargeTradeVo largeTradeVo;
    private SusTradeVo susTradeVo;
    private List<String> customerIdentifiedList;
    private PrpBrandMain prpBrandMain;
    private List<String> prpItemkindBrandList;
    private List<String> prpItemkindBrandMainList;
    private List<String> prpItemkindBrandSubList;
    private PrpTmainBind prpTmainBind;
    private List<String> prpTmainBindList;
    private PrpLsiMain prpLsiMain;
    private List<String> prpItemkindLsiList;
    private List<String> prpItemkindLsiMainList;
    private List<String> prpItemkindLsiSubList;
    private List<String> prpEngageLsiList;
    private String drivingBehavior;
    private List<String> customerLabelList;
    private List<String> clauseContextResolveList;
    private List<String> prpClauseHelperList;
    private String ciLastPolicy;
    private LargeSus largeSus;
    private InitData initData;
    private boolean ignoreAgentCheck;
    private List<String> prpPhoneHolderList;
    private boolean autoRelated;
    private PrpOcrRecord prpOcrRecord;
    private PrpCalculatePremiumAssist prpCalculatePremiumAssist;
    private PrpMainBindJY prpMainBindJY;
    private DasData dasData;
    private PrpCarRiskEvaluation prpCarRiskEvaluation;
    private PrpCarGrade prpCarGrade;
    private PrpPersonGrade prpPersonGrade;
    private PrpTBoxAuthorizationData prpTBoxAuthorizationData;
    private PriceResult priceResult;


    public String getInputDateTime() {
        return inputDateTime;
    }

    public void setInputDateTime(String inputDateTime) {
        this.inputDateTime = inputDateTime;
    }

    public String getInputEditType() {
        return inputEditType;
    }

    public void setInputEditType(String inputEditType) {
        this.inputEditType = inputEditType;
    }

    public PrpAgent getPrpAgent() {
        return prpAgent;
    }

    public void setPrpAgent(PrpAgent prpAgent) {
        this.prpAgent = prpAgent;
    }

    public PrpCarshiptax getPrpCarshiptax() {
        return prpCarshiptax;
    }

    public void setPrpCarshiptax(PrpCarshiptax prpCarshiptax) {
        this.prpCarshiptax = prpCarshiptax;
    }

    public PrpExpense getPrpExpense() {
        return prpExpense;
    }

    public void setPrpExpense(PrpExpense prpExpense) {
        this.prpExpense = prpExpense;
    }

    public PrpHandler getPrpHandler() {
        return prpHandler;
    }

    public void setPrpHandler(PrpHandler prpHandler) {
        this.prpHandler = prpHandler;
    }

    public PrpItemcar getPrpItemcar() {
        return prpItemcar;
    }

    public void setPrpItemcar(PrpItemcar prpItemcar) {
        this.prpItemcar = prpItemcar;
    }

    public PrpCarOrigin getPrpCarOrigin() {
        return prpCarOrigin;
    }

    public void setPrpCarOrigin(PrpCarOrigin prpCarOrigin) {
        this.prpCarOrigin = prpCarOrigin;
    }

    public PrpItemcarExt getPrpItemcarExt() {
        return prpItemcarExt;
    }

    public void setPrpItemcarExt(PrpItemcarExt prpItemcarExt) {
        this.prpItemcarExt = prpItemcarExt;
    }

    public PrpMain getPrpMain() {
        return prpMain;
    }

    public void setPrpMain(PrpMain prpMain) {
        this.prpMain = prpMain;
    }

    public PrpRenewal getPrpRenewal() {
        return prpRenewal;
    }

    public void setPrpRenewal(PrpRenewal prpRenewal) {
        this.prpRenewal = prpRenewal;
    }

    public PrpCundwrtProfit getPrpCundwrtProfit() {
        return prpCundwrtProfit;
    }

    public void setPrpCundwrtProfit(PrpCundwrtProfit prpCundwrtProfit) {
        this.prpCundwrtProfit = prpCundwrtProfit;
    }

    public PrpItemkindCopy getPrpItemkindCopy() {
        return prpItemkindCopy;
    }

    public void setPrpItemkindCopy(PrpItemkindCopy prpItemkindCopy) {
        this.prpItemkindCopy = prpItemkindCopy;
    }

    public InterfQuery getInterfQuery() {
        return interfQuery;
    }

    public void setInterfQuery(InterfQuery interfQuery) {
        this.interfQuery = interfQuery;
    }

    public CiInsureProvisonal getCiInsureProvisonal() {
        return ciInsureProvisonal;
    }

    public void setCiInsureProvisonal(CiInsureProvisonal ciInsureProvisonal) {
        this.ciInsureProvisonal = ciInsureProvisonal;
    }

    public CiInsureDemand getCiInsureDemand() {
        return ciInsureDemand;
    }

    public void setCiInsureDemand(CiInsureDemand ciInsureDemand) {
        this.ciInsureDemand = ciInsureDemand;
    }

    public CiInsureDemandSub getCiInsureDemandSub() {
        return ciInsureDemandSub;
    }

    public void setCiInsureDemandSub(CiInsureDemandSub ciInsureDemandSub) {
        this.ciInsureDemandSub = ciInsureDemandSub;
    }

    public PrpAddtionalImg getPrpAddtionalImg() {
        return prpAddtionalImg;
    }

    public void setPrpAddtionalImg(PrpAddtionalImg prpAddtionalImg) {
        this.prpAddtionalImg = prpAddtionalImg;
    }

    public List<String> getCiInsureDemandPayList() {
        return ciInsureDemandPayList;
    }

    public void setCiInsureDemandPayList(List<String> ciInsureDemandPayList) {
        this.ciInsureDemandPayList = ciInsureDemandPayList;
    }

    public List<CiInsureDemandLossList> getCiInsureDemandLossList() {
        return ciInsureDemandLossList;
    }

    public void setCiInsureDemandLossList(List<CiInsureDemandLossList> ciInsureDemandLossList) {
        this.ciInsureDemandLossList = ciInsureDemandLossList;
    }

    public List<String> getCiInsureDuplicatedList() {
        return ciInsureDuplicatedList;
    }

    public void setCiInsureDuplicatedList(List<String> ciInsureDuplicatedList) {
        this.ciInsureDuplicatedList = ciInsureDuplicatedList;
    }

    public List<String> getCiInsureDemandScoreList() {
        return ciInsureDemandScoreList;
    }

    public void setCiInsureDemandScoreList(List<String> ciInsureDemandScoreList) {
        this.ciInsureDemandScoreList = ciInsureDemandScoreList;
    }

    public List<CiVehiclePriceList> getCiVehiclePriceList() {
        return ciVehiclePriceList;
    }

    public void setCiVehiclePriceList(List<CiVehiclePriceList> ciVehiclePriceList) {
        this.ciVehiclePriceList = ciVehiclePriceList;
    }

    public List<PrpMainsubList> getPrpMainsubList() {
        return prpMainsubList;
    }

    public void setPrpMainsubList(List<PrpMainsubList> prpMainsubList) {
        this.prpMainsubList = prpMainsubList;
    }

    public List<String> getPrpCoinsList() {
        return prpCoinsList;
    }

    public void setPrpCoinsList(List<String> prpCoinsList) {
        this.prpCoinsList = prpCoinsList;
    }

    public List<String> getPrpCoinsdetailList() {
        return prpCoinsdetailList;
    }

    public void setPrpCoinsdetailList(List<String> prpCoinsdetailList) {
        this.prpCoinsdetailList = prpCoinsdetailList;
    }

    public List<PrpEngageList> getPrpEngageList() {
        return prpEngageList;
    }

    public void setPrpEngageList(List<PrpEngageList> prpEngageList) {
        this.prpEngageList = prpEngageList;
    }

    public List<PrpFeeList> getPrpFeeList() {
        return prpFeeList;
    }

    public void setPrpFeeList(List<PrpFeeList> prpFeeList) {
        this.prpFeeList = prpFeeList;
    }

    public List<String> getPrpCardeviceList() {
        return prpCardeviceList;
    }

    public void setPrpCardeviceList(List<String> prpCardeviceList) {
        this.prpCardeviceList = prpCardeviceList;
    }

    public List<String> getPrpCarDetectItemList() {
        return prpCarDetectItemList;
    }

    public void setPrpCarDetectItemList(List<String> prpCarDetectItemList) {
        this.prpCarDetectItemList = prpCarDetectItemList;
    }

    public List<String> getPrpCardriverList() {
        return prpCardriverList;
    }

    public void setPrpCardriverList(List<String> prpCardriverList) {
        this.prpCardriverList = prpCardriverList;
    }

    public List<PrpPlanList> getPrpPlanList() {
        return prpPlanList;
    }

    public void setPrpPlanList(List<PrpPlanList> prpPlanList) {
        this.prpPlanList = prpPlanList;
    }

    public List<PrpProfitList> getPrpProfitList() {
        return prpProfitList;
    }

    public void setPrpProfitList(List<PrpProfitList> prpProfitList) {
        this.prpProfitList = prpProfitList;
    }

    public List<PrpProfitdetailList> getPrpProfitdetailList() {
        return prpProfitdetailList;
    }

    public void setPrpProfitdetailList(List<PrpProfitdetailList> prpProfitdetailList) {
        this.prpProfitdetailList = prpProfitdetailList;
    }

    public List<String> getPrpProfitdetailExtraList() {
        return prpProfitdetailExtraList;
    }

    public void setPrpProfitdetailExtraList(List<String> prpProfitdetailExtraList) {
        this.prpProfitdetailExtraList = prpProfitdetailExtraList;
    }

    public List<String> getPrpProfitMainList() {
        return prpProfitMainList;
    }

    public void setPrpProfitMainList(List<String> prpProfitMainList) {
        this.prpProfitMainList = prpProfitMainList;
    }

    public List<PrpItemkindList> getPrpItemkindList() {
        return prpItemkindList;
    }

    public void setPrpItemkindList(List<PrpItemkindList> prpItemkindList) {
        this.prpItemkindList = prpItemkindList;
    }

    public List<PrpLimitList> getPrpLimitList() {
        return prpLimitList;
    }

    public void setPrpLimitList(List<PrpLimitList> prpLimitList) {
        this.prpLimitList = prpLimitList;
    }

    public List<PrpInsuredList> getPrpInsuredList() {
        return prpInsuredList;
    }

    public void setPrpInsuredList(List<PrpInsuredList> prpInsuredList) {
        this.prpInsuredList = prpInsuredList;
    }

    public List<String> getPrpInsuredNatureList() {
        return prpInsuredNatureList;
    }

    public void setPrpInsuredNatureList(List<String> prpInsuredNatureList) {
        this.prpInsuredNatureList = prpInsuredNatureList;
    }

    public OtherData getOtherData() {
        return otherData;
    }

    public void setOtherData(OtherData otherData) {
        this.otherData = otherData;
    }

    public FxqMain getFxqMain() {
        return fxqMain;
    }

    public void setFxqMain(FxqMain fxqMain) {
        this.fxqMain = fxqMain;
    }

    public List<String> getFxqShareHolderList() {
        return fxqShareHolderList;
    }

    public void setFxqShareHolderList(List<String> fxqShareHolderList) {
        this.fxqShareHolderList = fxqShareHolderList;
    }

    public FxqCustomerVo getFxqCustomerVo() {
        return fxqCustomerVo;
    }

    public void setFxqCustomerVo(FxqCustomerVo fxqCustomerVo) {
        this.fxqCustomerVo = fxqCustomerVo;
    }

    public LargeTradeVo getLargeTradeVo() {
        return largeTradeVo;
    }

    public void setLargeTradeVo(LargeTradeVo largeTradeVo) {
        this.largeTradeVo = largeTradeVo;
    }

    public SusTradeVo getSusTradeVo() {
        return susTradeVo;
    }

    public void setSusTradeVo(SusTradeVo susTradeVo) {
        this.susTradeVo = susTradeVo;
    }

    public List<String> getCustomerIdentifiedList() {
        return customerIdentifiedList;
    }

    public void setCustomerIdentifiedList(List<String> customerIdentifiedList) {
        this.customerIdentifiedList = customerIdentifiedList;
    }

    public PrpBrandMain getPrpBrandMain() {
        return prpBrandMain;
    }

    public void setPrpBrandMain(PrpBrandMain prpBrandMain) {
        this.prpBrandMain = prpBrandMain;
    }

    public List<String> getPrpItemkindBrandList() {
        return prpItemkindBrandList;
    }

    public void setPrpItemkindBrandList(List<String> prpItemkindBrandList) {
        this.prpItemkindBrandList = prpItemkindBrandList;
    }

    public List<String> getPrpItemkindBrandMainList() {
        return prpItemkindBrandMainList;
    }

    public void setPrpItemkindBrandMainList(List<String> prpItemkindBrandMainList) {
        this.prpItemkindBrandMainList = prpItemkindBrandMainList;
    }

    public List<String> getPrpItemkindBrandSubList() {
        return prpItemkindBrandSubList;
    }

    public void setPrpItemkindBrandSubList(List<String> prpItemkindBrandSubList) {
        this.prpItemkindBrandSubList = prpItemkindBrandSubList;
    }

    public PrpTmainBind getPrpTmainBind() {
        return prpTmainBind;
    }

    public void setPrpTmainBind(PrpTmainBind prpTmainBind) {
        this.prpTmainBind = prpTmainBind;
    }

    public List<String> getPrpTmainBindList() {
        return prpTmainBindList;
    }

    public void setPrpTmainBindList(List<String> prpTmainBindList) {
        this.prpTmainBindList = prpTmainBindList;
    }

    public PrpLsiMain getPrpLsiMain() {
        return prpLsiMain;
    }

    public void setPrpLsiMain(PrpLsiMain prpLsiMain) {
        this.prpLsiMain = prpLsiMain;
    }

    public List<String> getPrpItemkindLsiList() {
        return prpItemkindLsiList;
    }

    public void setPrpItemkindLsiList(List<String> prpItemkindLsiList) {
        this.prpItemkindLsiList = prpItemkindLsiList;
    }

    public List<String> getPrpItemkindLsiMainList() {
        return prpItemkindLsiMainList;
    }

    public void setPrpItemkindLsiMainList(List<String> prpItemkindLsiMainList) {
        this.prpItemkindLsiMainList = prpItemkindLsiMainList;
    }

    public List<String> getPrpItemkindLsiSubList() {
        return prpItemkindLsiSubList;
    }

    public void setPrpItemkindLsiSubList(List<String> prpItemkindLsiSubList) {
        this.prpItemkindLsiSubList = prpItemkindLsiSubList;
    }

    public List<String> getPrpEngageLsiList() {
        return prpEngageLsiList;
    }

    public void setPrpEngageLsiList(List<String> prpEngageLsiList) {
        this.prpEngageLsiList = prpEngageLsiList;
    }

    public String getDrivingBehavior() {
        return drivingBehavior;
    }

    public void setDrivingBehavior(String drivingBehavior) {
        this.drivingBehavior = drivingBehavior;
    }

    public List<String> getCustomerLabelList() {
        return customerLabelList;
    }

    public void setCustomerLabelList(List<String> customerLabelList) {
        this.customerLabelList = customerLabelList;
    }

    public List<String> getClauseContextResolveList() {
        return clauseContextResolveList;
    }

    public void setClauseContextResolveList(List<String> clauseContextResolveList) {
        this.clauseContextResolveList = clauseContextResolveList;
    }

    public List<String> getPrpClauseHelperList() {
        return prpClauseHelperList;
    }

    public void setPrpClauseHelperList(List<String> prpClauseHelperList) {
        this.prpClauseHelperList = prpClauseHelperList;
    }

    public String getCiLastPolicy() {
        return ciLastPolicy;
    }

    public void setCiLastPolicy(String ciLastPolicy) {
        this.ciLastPolicy = ciLastPolicy;
    }

    public LargeSus getLargeSus() {
        return largeSus;
    }

    public void setLargeSus(LargeSus largeSus) {
        this.largeSus = largeSus;
    }

    public InitData getInitData() {
        return initData;
    }

    public void setInitData(InitData initData) {
        this.initData = initData;
    }

    public boolean isIgnoreAgentCheck() {
        return ignoreAgentCheck;
    }

    public void setIgnoreAgentCheck(boolean ignoreAgentCheck) {
        this.ignoreAgentCheck = ignoreAgentCheck;
    }

    public List<String> getPrpPhoneHolderList() {
        return prpPhoneHolderList;
    }

    public void setPrpPhoneHolderList(List<String> prpPhoneHolderList) {
        this.prpPhoneHolderList = prpPhoneHolderList;
    }

    public boolean isAutoRelated() {
        return autoRelated;
    }

    public void setAutoRelated(boolean autoRelated) {
        this.autoRelated = autoRelated;
    }

    public PrpOcrRecord getPrpOcrRecord() {
        return prpOcrRecord;
    }

    public void setPrpOcrRecord(PrpOcrRecord prpOcrRecord) {
        this.prpOcrRecord = prpOcrRecord;
    }

    public PrpCalculatePremiumAssist getPrpCalculatePremiumAssist() {
        return prpCalculatePremiumAssist;
    }

    public void setPrpCalculatePremiumAssist(PrpCalculatePremiumAssist prpCalculatePremiumAssist) {
        this.prpCalculatePremiumAssist = prpCalculatePremiumAssist;
    }

    public PrpMainBindJY getPrpMainBindJY() {
        return prpMainBindJY;
    }

    public void setPrpMainBindJY(PrpMainBindJY prpMainBindJY) {
        this.prpMainBindJY = prpMainBindJY;
    }

    public DasData getDasData() {
        return dasData;
    }

    public void setDasData(DasData dasData) {
        this.dasData = dasData;
    }

    public PrpCarRiskEvaluation getPrpCarRiskEvaluation() {
        return prpCarRiskEvaluation;
    }

    public void setPrpCarRiskEvaluation(PrpCarRiskEvaluation prpCarRiskEvaluation) {
        this.prpCarRiskEvaluation = prpCarRiskEvaluation;
    }

    public PrpCarGrade getPrpCarGrade() {
        return prpCarGrade;
    }

    public void setPrpCarGrade(PrpCarGrade prpCarGrade) {
        this.prpCarGrade = prpCarGrade;
    }

    public PrpPersonGrade getPrpPersonGrade() {
        return prpPersonGrade;
    }

    public void setPrpPersonGrade(PrpPersonGrade prpPersonGrade) {
        this.prpPersonGrade = prpPersonGrade;
    }

    public PrpTBoxAuthorizationData getPrpTBoxAuthorizationData() {
        return prpTBoxAuthorizationData;
    }

    public void setPrpTBoxAuthorizationData(PrpTBoxAuthorizationData prpTBoxAuthorizationData) {
        this.prpTBoxAuthorizationData = prpTBoxAuthorizationData;
    }

    public PriceResult getPriceResult() {
        return priceResult;
    }

    public void setPriceResult(PriceResult priceResult) {
        this.priceResult = priceResult;
    }
}

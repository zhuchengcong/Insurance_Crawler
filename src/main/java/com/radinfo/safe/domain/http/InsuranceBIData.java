package com.radinfo.safe.domain.http;


import java.io.Serializable;
import java.util.List;

public class InsuranceBIData implements Serializable {

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
    private List<CiInsureDuplicatedList> ciInsureDuplicatedList;
    private List<CiInsureDemandScoreList> ciInsureDemandScoreList;
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
    private List<PrpProfitdetailExtraList> prpProfitdetailExtraList;
    private List<PrpProfitMainList> prpProfitMainList;
    private List<PrpItemkindList> prpItemkindList;
    private List<String> prpLimitList;
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
    public void setInputDateTime(String inputDateTime) {
        this.inputDateTime = inputDateTime;
    }
    public String getInputDateTime() {
        return inputDateTime;
    }

    public void setInputEditType(String inputEditType) {
        this.inputEditType = inputEditType;
    }
    public String getInputEditType() {
        return inputEditType;
    }

    public void setPrpAgent(PrpAgent prpAgent) {
        this.prpAgent = prpAgent;
    }
    public PrpAgent getPrpAgent() {
        return prpAgent;
    }

    public void setPrpCarshiptax(PrpCarshiptax prpCarshiptax) {
        this.prpCarshiptax = prpCarshiptax;
    }
    public PrpCarshiptax getPrpCarshiptax() {
        return prpCarshiptax;
    }

    public void setPrpExpense(PrpExpense prpExpense) {
        this.prpExpense = prpExpense;
    }
    public PrpExpense getPrpExpense() {
        return prpExpense;
    }

    public void setPrpHandler(PrpHandler prpHandler) {
        this.prpHandler = prpHandler;
    }
    public PrpHandler getPrpHandler() {
        return prpHandler;
    }

    public void setPrpItemcar(PrpItemcar prpItemcar) {
        this.prpItemcar = prpItemcar;
    }
    public PrpItemcar getPrpItemcar() {
        return prpItemcar;
    }

    public void setPrpCarOrigin(PrpCarOrigin prpCarOrigin) {
        this.prpCarOrigin = prpCarOrigin;
    }
    public PrpCarOrigin getPrpCarOrigin() {
        return prpCarOrigin;
    }

    public void setPrpItemcarExt(PrpItemcarExt prpItemcarExt) {
        this.prpItemcarExt = prpItemcarExt;
    }
    public PrpItemcarExt getPrpItemcarExt() {
        return prpItemcarExt;
    }

    public void setPrpMain(PrpMain prpMain) {
        this.prpMain = prpMain;
    }
    public PrpMain getPrpMain() {
        return prpMain;
    }

    public void setPrpRenewal(PrpRenewal prpRenewal) {
        this.prpRenewal = prpRenewal;
    }
    public PrpRenewal getPrpRenewal() {
        return prpRenewal;
    }

    public void setPrpCundwrtProfit(PrpCundwrtProfit prpCundwrtProfit) {
        this.prpCundwrtProfit = prpCundwrtProfit;
    }
    public PrpCundwrtProfit getPrpCundwrtProfit() {
        return prpCundwrtProfit;
    }

    public void setPrpItemkindCopy(PrpItemkindCopy prpItemkindCopy) {
        this.prpItemkindCopy = prpItemkindCopy;
    }
    public PrpItemkindCopy getPrpItemkindCopy() {
        return prpItemkindCopy;
    }

    public void setInterfQuery(InterfQuery interfQuery) {
        this.interfQuery = interfQuery;
    }
    public InterfQuery getInterfQuery() {
        return interfQuery;
    }

    public void setCiInsureProvisonal(CiInsureProvisonal ciInsureProvisonal) {
        this.ciInsureProvisonal = ciInsureProvisonal;
    }
    public CiInsureProvisonal getCiInsureProvisonal() {
        return ciInsureProvisonal;
    }

    public void setCiInsureDemand(CiInsureDemand ciInsureDemand) {
        this.ciInsureDemand = ciInsureDemand;
    }
    public CiInsureDemand getCiInsureDemand() {
        return ciInsureDemand;
    }

    public void setCiInsureDemandSub(CiInsureDemandSub ciInsureDemandSub) {
        this.ciInsureDemandSub = ciInsureDemandSub;
    }
    public CiInsureDemandSub getCiInsureDemandSub() {
        return ciInsureDemandSub;
    }

    public void setPrpAddtionalImg(PrpAddtionalImg prpAddtionalImg) {
        this.prpAddtionalImg = prpAddtionalImg;
    }
    public PrpAddtionalImg getPrpAddtionalImg() {
        return prpAddtionalImg;
    }

    public void setCiInsureDemandPayList(List<String> ciInsureDemandPayList) {
        this.ciInsureDemandPayList = ciInsureDemandPayList;
    }
    public List<String> getCiInsureDemandPayList() {
        return ciInsureDemandPayList;
    }

    public void setCiInsureDemandLossList(List<CiInsureDemandLossList> ciInsureDemandLossList) {
        this.ciInsureDemandLossList = ciInsureDemandLossList;
    }
    public List<CiInsureDemandLossList> getCiInsureDemandLossList() {
        return ciInsureDemandLossList;
    }

    public void setCiInsureDuplicatedList(List<CiInsureDuplicatedList> ciInsureDuplicatedList) {
        this.ciInsureDuplicatedList = ciInsureDuplicatedList;
    }
    public List<CiInsureDuplicatedList> getCiInsureDuplicatedList() {
        return ciInsureDuplicatedList;
    }

    public void setCiInsureDemandScoreList(List<CiInsureDemandScoreList> ciInsureDemandScoreList) {
        this.ciInsureDemandScoreList = ciInsureDemandScoreList;
    }
    public List<CiInsureDemandScoreList> getCiInsureDemandScoreList() {
        return ciInsureDemandScoreList;
    }

    public void setCiVehiclePriceList(List<CiVehiclePriceList> ciVehiclePriceList) {
        this.ciVehiclePriceList = ciVehiclePriceList;
    }
    public List<CiVehiclePriceList> getCiVehiclePriceList() {
        return ciVehiclePriceList;
    }

    public void setPrpMainsubList(List<PrpMainsubList> prpMainsubList) {
        this.prpMainsubList = prpMainsubList;
    }
    public List<PrpMainsubList> getPrpMainsubList() {
        return prpMainsubList;
    }

    public void setPrpCoinsList(List<String> prpCoinsList) {
        this.prpCoinsList = prpCoinsList;
    }
    public List<String> getPrpCoinsList() {
        return prpCoinsList;
    }

    public void setPrpCoinsdetailList(List<String> prpCoinsdetailList) {
        this.prpCoinsdetailList = prpCoinsdetailList;
    }
    public List<String> getPrpCoinsdetailList() {
        return prpCoinsdetailList;
    }

    public void setPrpEngageList(List<PrpEngageList> prpEngageList) {
        this.prpEngageList = prpEngageList;
    }
    public List<PrpEngageList> getPrpEngageList() {
        return prpEngageList;
    }

    public void setPrpFeeList(List<PrpFeeList> prpFeeList) {
        this.prpFeeList = prpFeeList;
    }
    public List<PrpFeeList> getPrpFeeList() {
        return prpFeeList;
    }

    public void setPrpCardeviceList(List<String> prpCardeviceList) {
        this.prpCardeviceList = prpCardeviceList;
    }
    public List<String> getPrpCardeviceList() {
        return prpCardeviceList;
    }

    public void setPrpCarDetectItemList(List<String> prpCarDetectItemList) {
        this.prpCarDetectItemList = prpCarDetectItemList;
    }
    public List<String> getPrpCarDetectItemList() {
        return prpCarDetectItemList;
    }

    public void setPrpCardriverList(List<String> prpCardriverList) {
        this.prpCardriverList = prpCardriverList;
    }
    public List<String> getPrpCardriverList() {
        return prpCardriverList;
    }

    public void setPrpPlanList(List<PrpPlanList> prpPlanList) {
        this.prpPlanList = prpPlanList;
    }
    public List<PrpPlanList> getPrpPlanList() {
        return prpPlanList;
    }

    public void setPrpProfitList(List<PrpProfitList> prpProfitList) {
        this.prpProfitList = prpProfitList;
    }
    public List<PrpProfitList> getPrpProfitList() {
        return prpProfitList;
    }

    public void setPrpProfitdetailList(List<PrpProfitdetailList> prpProfitdetailList) {
        this.prpProfitdetailList = prpProfitdetailList;
    }
    public List<PrpProfitdetailList> getPrpProfitdetailList() {
        return prpProfitdetailList;
    }

    public void setPrpProfitdetailExtraList(List<PrpProfitdetailExtraList> prpProfitdetailExtraList) {
        this.prpProfitdetailExtraList = prpProfitdetailExtraList;
    }
    public List<PrpProfitdetailExtraList> getPrpProfitdetailExtraList() {
        return prpProfitdetailExtraList;
    }

    public void setPrpProfitMainList(List<PrpProfitMainList> prpProfitMainList) {
        this.prpProfitMainList = prpProfitMainList;
    }
    public List<PrpProfitMainList> getPrpProfitMainList() {
        return prpProfitMainList;
    }

    public void setPrpItemkindList(List<PrpItemkindList> prpItemkindList) {
        this.prpItemkindList = prpItemkindList;
    }
    public List<PrpItemkindList> getPrpItemkindList() {
        return prpItemkindList;
    }

    public void setPrpLimitList(List<String> prpLimitList) {
        this.prpLimitList = prpLimitList;
    }
    public List<String> getPrpLimitList() {
        return prpLimitList;
    }

    public void setPrpInsuredList(List<PrpInsuredList> prpInsuredList) {
        this.prpInsuredList = prpInsuredList;
    }
    public List<PrpInsuredList> getPrpInsuredList() {
        return prpInsuredList;
    }

    public void setPrpInsuredNatureList(List<String> prpInsuredNatureList) {
        this.prpInsuredNatureList = prpInsuredNatureList;
    }
    public List<String> getPrpInsuredNatureList() {
        return prpInsuredNatureList;
    }

    public void setOtherData(OtherData otherData) {
        this.otherData = otherData;
    }
    public OtherData getOtherData() {
        return otherData;
    }

    public void setFxqMain(FxqMain fxqMain) {
        this.fxqMain = fxqMain;
    }
    public FxqMain getFxqMain() {
        return fxqMain;
    }

    public void setFxqShareHolderList(List<String> fxqShareHolderList) {
        this.fxqShareHolderList = fxqShareHolderList;
    }
    public List<String> getFxqShareHolderList() {
        return fxqShareHolderList;
    }

    public void setFxqCustomerVo(FxqCustomerVo fxqCustomerVo) {
        this.fxqCustomerVo = fxqCustomerVo;
    }
    public FxqCustomerVo getFxqCustomerVo() {
        return fxqCustomerVo;
    }

    public void setLargeTradeVo(LargeTradeVo largeTradeVo) {
        this.largeTradeVo = largeTradeVo;
    }
    public LargeTradeVo getLargeTradeVo() {
        return largeTradeVo;
    }

    public void setSusTradeVo(SusTradeVo susTradeVo) {
        this.susTradeVo = susTradeVo;
    }
    public SusTradeVo getSusTradeVo() {
        return susTradeVo;
    }

    public void setCustomerIdentifiedList(List<String> customerIdentifiedList) {
        this.customerIdentifiedList = customerIdentifiedList;
    }
    public List<String> getCustomerIdentifiedList() {
        return customerIdentifiedList;
    }

    public void setPrpBrandMain(PrpBrandMain prpBrandMain) {
        this.prpBrandMain = prpBrandMain;
    }
    public PrpBrandMain getPrpBrandMain() {
        return prpBrandMain;
    }

    public void setPrpItemkindBrandList(List<String> prpItemkindBrandList) {
        this.prpItemkindBrandList = prpItemkindBrandList;
    }
    public List<String> getPrpItemkindBrandList() {
        return prpItemkindBrandList;
    }

    public void setPrpItemkindBrandMainList(List<String> prpItemkindBrandMainList) {
        this.prpItemkindBrandMainList = prpItemkindBrandMainList;
    }
    public List<String> getPrpItemkindBrandMainList() {
        return prpItemkindBrandMainList;
    }

    public void setPrpItemkindBrandSubList(List<String> prpItemkindBrandSubList) {
        this.prpItemkindBrandSubList = prpItemkindBrandSubList;
    }
    public List<String> getPrpItemkindBrandSubList() {
        return prpItemkindBrandSubList;
    }

    public void setPrpTmainBind(PrpTmainBind prpTmainBind) {
        this.prpTmainBind = prpTmainBind;
    }
    public PrpTmainBind getPrpTmainBind() {
        return prpTmainBind;
    }

    public void setPrpTmainBindList(List<String> prpTmainBindList) {
        this.prpTmainBindList = prpTmainBindList;
    }
    public List<String> getPrpTmainBindList() {
        return prpTmainBindList;
    }

    public void setPrpLsiMain(PrpLsiMain prpLsiMain) {
        this.prpLsiMain = prpLsiMain;
    }
    public PrpLsiMain getPrpLsiMain() {
        return prpLsiMain;
    }

    public void setPrpItemkindLsiList(List<String> prpItemkindLsiList) {
        this.prpItemkindLsiList = prpItemkindLsiList;
    }
    public List<String> getPrpItemkindLsiList() {
        return prpItemkindLsiList;
    }

    public void setPrpItemkindLsiMainList(List<String> prpItemkindLsiMainList) {
        this.prpItemkindLsiMainList = prpItemkindLsiMainList;
    }
    public List<String> getPrpItemkindLsiMainList() {
        return prpItemkindLsiMainList;
    }

    public void setPrpItemkindLsiSubList(List<String> prpItemkindLsiSubList) {
        this.prpItemkindLsiSubList = prpItemkindLsiSubList;
    }
    public List<String> getPrpItemkindLsiSubList() {
        return prpItemkindLsiSubList;
    }

    public void setPrpEngageLsiList(List<String> prpEngageLsiList) {
        this.prpEngageLsiList = prpEngageLsiList;
    }
    public List<String> getPrpEngageLsiList() {
        return prpEngageLsiList;
    }

    public void setDrivingBehavior(String drivingBehavior) {
        this.drivingBehavior = drivingBehavior;
    }
    public String getDrivingBehavior() {
        return drivingBehavior;
    }

    public void setCustomerLabelList(List<String> customerLabelList) {
        this.customerLabelList = customerLabelList;
    }
    public List<String> getCustomerLabelList() {
        return customerLabelList;
    }

    public void setClauseContextResolveList(List<String> clauseContextResolveList) {
        this.clauseContextResolveList = clauseContextResolveList;
    }
    public List<String> getClauseContextResolveList() {
        return clauseContextResolveList;
    }

    public void setPrpClauseHelperList(List<String> prpClauseHelperList) {
        this.prpClauseHelperList = prpClauseHelperList;
    }
    public List<String> getPrpClauseHelperList() {
        return prpClauseHelperList;
    }

    public void setCiLastPolicy(String ciLastPolicy) {
        this.ciLastPolicy = ciLastPolicy;
    }
    public String getCiLastPolicy() {
        return ciLastPolicy;
    }

    public void setLargeSus(LargeSus largeSus) {
        this.largeSus = largeSus;
    }
    public LargeSus getLargeSus() {
        return largeSus;
    }

    public void setInitData(InitData initData) {
        this.initData = initData;
    }
    public InitData getInitData() {
        return initData;
    }

    public void setIgnoreAgentCheck(boolean ignoreAgentCheck) {
        this.ignoreAgentCheck = ignoreAgentCheck;
    }
    public boolean getIgnoreAgentCheck() {
        return ignoreAgentCheck;
    }

    public void setPrpPhoneHolderList(List<String> prpPhoneHolderList) {
        this.prpPhoneHolderList = prpPhoneHolderList;
    }
    public List<String> getPrpPhoneHolderList() {
        return prpPhoneHolderList;
    }

    public void setAutoRelated(boolean autoRelated) {
        this.autoRelated = autoRelated;
    }
    public boolean getAutoRelated() {
        return autoRelated;
    }

    public void setPrpOcrRecord(PrpOcrRecord prpOcrRecord) {
        this.prpOcrRecord = prpOcrRecord;
    }
    public PrpOcrRecord getPrpOcrRecord() {
        return prpOcrRecord;
    }

    public void setPrpCalculatePremiumAssist(PrpCalculatePremiumAssist prpCalculatePremiumAssist) {
        this.prpCalculatePremiumAssist = prpCalculatePremiumAssist;
    }
    public PrpCalculatePremiumAssist getPrpCalculatePremiumAssist() {
        return prpCalculatePremiumAssist;
    }

    public void setPrpMainBindJY(PrpMainBindJY prpMainBindJY) {
        this.prpMainBindJY = prpMainBindJY;
    }
    public PrpMainBindJY getPrpMainBindJY() {
        return prpMainBindJY;
    }

    public void setDasData(DasData dasData) {
        this.dasData = dasData;
    }
    public DasData getDasData() {
        return dasData;
    }

    public void setPrpCarRiskEvaluation(PrpCarRiskEvaluation prpCarRiskEvaluation) {
        this.prpCarRiskEvaluation = prpCarRiskEvaluation;
    }
    public PrpCarRiskEvaluation getPrpCarRiskEvaluation() {
        return prpCarRiskEvaluation;
    }

    public void setPrpCarGrade(PrpCarGrade prpCarGrade) {
        this.prpCarGrade = prpCarGrade;
    }
    public PrpCarGrade getPrpCarGrade() {
        return prpCarGrade;
    }

    public void setPrpPersonGrade(PrpPersonGrade prpPersonGrade) {
        this.prpPersonGrade = prpPersonGrade;
    }
    public PrpPersonGrade getPrpPersonGrade() {
        return prpPersonGrade;
    }

    public void setPrpTBoxAuthorizationData(PrpTBoxAuthorizationData prpTBoxAuthorizationData) {
        this.prpTBoxAuthorizationData = prpTBoxAuthorizationData;
    }
    public PrpTBoxAuthorizationData getPrpTBoxAuthorizationData() {
        return prpTBoxAuthorizationData;
    }

    public void setPriceResult(PriceResult priceResult) {
        this.priceResult = priceResult;
    }
    public PriceResult getPriceResult() {
        return priceResult;
    }

}

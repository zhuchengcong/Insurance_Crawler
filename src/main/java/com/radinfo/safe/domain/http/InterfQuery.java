package com.radinfo.safe.domain.http;


import java.io.Serializable;
import java.util.List;


public class InterfQuery implements Serializable {

    private static final long serialVersionUID = 7172087791751316722L;
    private String querySequenceNo;
    private String requestType;
    private String responseCode;
    private String errorCode;
    private String pmQueryNo;
    private String question;
    private String checkPic;
    private String answer;
    private String messageTip;
    private String reqXml;
    private String resXml;
    private String prpCcommlog;
    private String prpCcommlogProfitC03;
    private String ciInsureDemand;
    private String ciInsureDemandLog;
    private String ciInsureDemandSub;
    private List<String> ciInsureDemandPayList;
    private List<String> ciInsureDemandLossList;
    private List<String> reInsuredItems;
    private List<String> ciInsureDemandScoreList;
    private String ciLastPolicy;
    private String quoteType;
    private String ciinsureRiskItem;
    private List<String> cipureRiskPremiumList;
    private String ciinsureTaxtype;
    private String ciinsureValid;
    private String ciinsureProvisonal;
    private List<String> ciinsureAnnualTaxTypeList;
    private List<String> ciinsureDuplicatedList;
    private String ciinsureCommission;
    private List<String> cicarModelList;
    private List<String> ciinsureTaxRateTypeList;
    private List<String> ciinsureDerateTypeList;
    public void setQuerySequenceNo(String querySequenceNo) {
        this.querySequenceNo = querySequenceNo;
    }
    public String getQuerySequenceNo() {
        return querySequenceNo;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }
    public String getRequestType() {
        return requestType;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }
    public String getResponseCode() {
        return responseCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
    public String getErrorCode() {
        return errorCode;
    }

    public void setPmQueryNo(String pmQueryNo) {
        this.pmQueryNo = pmQueryNo;
    }
    public String getPmQueryNo() {
        return pmQueryNo;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
    public String getQuestion() {
        return question;
    }

    public void setCheckPic(String checkPic) {
        this.checkPic = checkPic;
    }
    public String getCheckPic() {
        return checkPic;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
    public String getAnswer() {
        return answer;
    }

    public void setMessageTip(String messageTip) {
        this.messageTip = messageTip;
    }
    public String getMessageTip() {
        return messageTip;
    }

    public void setReqXml(String reqXml) {
        this.reqXml = reqXml;
    }
    public String getReqXml() {
        return reqXml;
    }

    public void setResXml(String resXml) {
        this.resXml = resXml;
    }
    public String getResXml() {
        return resXml;
    }

    public void setPrpCcommlog(String prpCcommlog) {
        this.prpCcommlog = prpCcommlog;
    }
    public String getPrpCcommlog() {
        return prpCcommlog;
    }

    public void setPrpCcommlogProfitC03(String prpCcommlogProfitC03) {
        this.prpCcommlogProfitC03 = prpCcommlogProfitC03;
    }
    public String getPrpCcommlogProfitC03() {
        return prpCcommlogProfitC03;
    }

    public void setCiInsureDemand(String ciInsureDemand) {
        this.ciInsureDemand = ciInsureDemand;
    }
    public String getCiInsureDemand() {
        return ciInsureDemand;
    }

    public void setCiInsureDemandLog(String ciInsureDemandLog) {
        this.ciInsureDemandLog = ciInsureDemandLog;
    }
    public String getCiInsureDemandLog() {
        return ciInsureDemandLog;
    }

    public void setCiInsureDemandSub(String ciInsureDemandSub) {
        this.ciInsureDemandSub = ciInsureDemandSub;
    }
    public String getCiInsureDemandSub() {
        return ciInsureDemandSub;
    }

    public void setCiInsureDemandPayList(List<String> ciInsureDemandPayList) {
        this.ciInsureDemandPayList = ciInsureDemandPayList;
    }
    public List<String> getCiInsureDemandPayList() {
        return ciInsureDemandPayList;
    }

    public void setCiInsureDemandLossList(List<String> ciInsureDemandLossList) {
        this.ciInsureDemandLossList = ciInsureDemandLossList;
    }
    public List<String> getCiInsureDemandLossList() {
        return ciInsureDemandLossList;
    }

    public void setReInsuredItems(List<String> reInsuredItems) {
        this.reInsuredItems = reInsuredItems;
    }
    public List<String> getReInsuredItems() {
        return reInsuredItems;
    }

    public void setCiInsureDemandScoreList(List<String> ciInsureDemandScoreList) {
        this.ciInsureDemandScoreList = ciInsureDemandScoreList;
    }
    public List<String> getCiInsureDemandScoreList() {
        return ciInsureDemandScoreList;
    }

    public void setCiLastPolicy(String ciLastPolicy) {
        this.ciLastPolicy = ciLastPolicy;
    }
    public String getCiLastPolicy() {
        return ciLastPolicy;
    }

    public void setQuoteType(String quoteType) {
        this.quoteType = quoteType;
    }
    public String getQuoteType() {
        return quoteType;
    }

    public void setCiinsureRiskItem(String ciinsureRiskItem) {
        this.ciinsureRiskItem = ciinsureRiskItem;
    }
    public String getCiinsureRiskItem() {
        return ciinsureRiskItem;
    }

    public void setCipureRiskPremiumList(List<String> cipureRiskPremiumList) {
        this.cipureRiskPremiumList = cipureRiskPremiumList;
    }
    public List<String> getCipureRiskPremiumList() {
        return cipureRiskPremiumList;
    }

    public void setCiinsureTaxtype(String ciinsureTaxtype) {
        this.ciinsureTaxtype = ciinsureTaxtype;
    }
    public String getCiinsureTaxtype() {
        return ciinsureTaxtype;
    }

    public void setCiinsureValid(String ciinsureValid) {
        this.ciinsureValid = ciinsureValid;
    }
    public String getCiinsureValid() {
        return ciinsureValid;
    }

    public void setCiinsureProvisonal(String ciinsureProvisonal) {
        this.ciinsureProvisonal = ciinsureProvisonal;
    }
    public String getCiinsureProvisonal() {
        return ciinsureProvisonal;
    }

    public void setCiinsureAnnualTaxTypeList(List<String> ciinsureAnnualTaxTypeList) {
        this.ciinsureAnnualTaxTypeList = ciinsureAnnualTaxTypeList;
    }
    public List<String> getCiinsureAnnualTaxTypeList() {
        return ciinsureAnnualTaxTypeList;
    }

    public void setCiinsureDuplicatedList(List<String> ciinsureDuplicatedList) {
        this.ciinsureDuplicatedList = ciinsureDuplicatedList;
    }
    public List<String> getCiinsureDuplicatedList() {
        return ciinsureDuplicatedList;
    }

    public void setCiinsureCommission(String ciinsureCommission) {
        this.ciinsureCommission = ciinsureCommission;
    }
    public String getCiinsureCommission() {
        return ciinsureCommission;
    }

    public void setCicarModelList(List<String> cicarModelList) {
        this.cicarModelList = cicarModelList;
    }
    public List<String> getCicarModelList() {
        return cicarModelList;
    }

    public void setCiinsureTaxRateTypeList(List<String> ciinsureTaxRateTypeList) {
        this.ciinsureTaxRateTypeList = ciinsureTaxRateTypeList;
    }
    public List<String> getCiinsureTaxRateTypeList() {
        return ciinsureTaxRateTypeList;
    }

    public void setCiinsureDerateTypeList(List<String> ciinsureDerateTypeList) {
        this.ciinsureDerateTypeList = ciinsureDerateTypeList;
    }
    public List<String> getCiinsureDerateTypeList() {
        return ciinsureDerateTypeList;
    }

}
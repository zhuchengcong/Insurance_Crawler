package com.radinfo.safe.domain.http;

import java.io.Serializable;

public class ProposalBICIData implements Serializable {
    private static final long serialVersionUID = 7766950770215782000L;
    private String bizType;
    private InsuranceBIData insuranceBIData;
    private InsuranceCIData insuranceCIData;
    private String insuranceDASData;
    private String otherData;
    private String biciFlag;
    private String demandNoBI;
    private String answerBI;
    private String demandNoCI;
    private String answerCI;
    private String caculateVersion;
    private boolean caculateBI;
    private boolean caculateCI;
    public void setBizType(String bizType) {
        this.bizType = bizType;
    }
    public String getBizType() {
        return bizType;
    }

    public void setInsuranceBIData(InsuranceBIData insuranceBIData) {
        this.insuranceBIData = insuranceBIData;
    }
    public InsuranceBIData getInsuranceBIData() {
        return insuranceBIData;
    }

    public void setInsuranceCIData(InsuranceCIData insuranceCIData) {
        this.insuranceCIData = insuranceCIData;
    }
    public InsuranceCIData getInsuranceCIData() {
        return insuranceCIData;
    }

    public void setInsuranceDASData(String insuranceDASData) {
        this.insuranceDASData = insuranceDASData;
    }
    public String getInsuranceDASData() {
        return insuranceDASData;
    }

    public void setOtherData(String otherData) {
        this.otherData = otherData;
    }
    public String getOtherData() {
        return otherData;
    }

    public void setBiciFlag(String biciFlag) {
        this.biciFlag = biciFlag;
    }
    public String getBiciFlag() {
        return biciFlag;
    }

    public void setDemandNoBI(String demandNoBI) {
        this.demandNoBI = demandNoBI;
    }
    public String getDemandNoBI() {
        return demandNoBI;
    }

    public void setAnswerBI(String answerBI) {
        this.answerBI = answerBI;
    }
    public String getAnswerBI() {
        return answerBI;
    }

    public void setDemandNoCI(String demandNoCI) {
        this.demandNoCI = demandNoCI;
    }
    public String getDemandNoCI() {
        return demandNoCI;
    }

    public void setAnswerCI(String answerCI) {
        this.answerCI = answerCI;
    }
    public String getAnswerCI() {
        return answerCI;
    }

    public void setCaculateVersion(String caculateVersion) {
        this.caculateVersion = caculateVersion;
    }
    public String getCaculateVersion() {
        return caculateVersion;
    }

    public void setCaculateBI(boolean caculateBI) {
        this.caculateBI = caculateBI;
    }
    public boolean getCaculateBI() {
        return caculateBI;
    }

    public void setCaculateCI(boolean caculateCI) {
        this.caculateCI = caculateCI;
    }
    public boolean getCaculateCI() {
        return caculateCI;
    }

}

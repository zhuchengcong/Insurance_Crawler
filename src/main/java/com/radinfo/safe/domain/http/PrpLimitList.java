package com.radinfo.safe.domain.http;


import java.io.Serializable;

public class PrpLimitList implements Serializable {

    private static final long serialVersionUID = 64290189151893468L;
    private String riskCode;
    private String limitGrade;
    private int limitNo;
    private String limitType;
    private String currency;
    private long limitFee;
    private String calculateFlag;
    private String limitFlag;
    private String flag;
    private String proposalNo;
    public void setRiskCode(String riskCode) {
        this.riskCode = riskCode;
    }
    public String getRiskCode() {
        return riskCode;
    }

    public void setLimitGrade(String limitGrade) {
        this.limitGrade = limitGrade;
    }
    public String getLimitGrade() {
        return limitGrade;
    }

    public void setLimitNo(int limitNo) {
        this.limitNo = limitNo;
    }
    public int getLimitNo() {
        return limitNo;
    }

    public void setLimitType(String limitType) {
        this.limitType = limitType;
    }
    public String getLimitType() {
        return limitType;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public String getCurrency() {
        return currency;
    }

    public void setLimitFee(long limitFee) {
        this.limitFee = limitFee;
    }
    public long getLimitFee() {
        return limitFee;
    }

    public void setCalculateFlag(String calculateFlag) {
        this.calculateFlag = calculateFlag;
    }
    public String getCalculateFlag() {
        return calculateFlag;
    }

    public void setLimitFlag(String limitFlag) {
        this.limitFlag = limitFlag;
    }
    public String getLimitFlag() {
        return limitFlag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
    public String getFlag() {
        return flag;
    }

    public void setProposalNo(String proposalNo) {
        this.proposalNo = proposalNo;
    }
    public String getProposalNo() {
        return proposalNo;
    }

}

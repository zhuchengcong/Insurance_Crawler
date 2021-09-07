package com.radinfo.safe.domain.http;


import java.io.Serializable;

public class PrpExpense  implements Serializable {

    private static final long serialVersionUID = 3360277398098765987L;
    private String riskCode;
    private String manageFeeRate;
    private String maxManageFeeRate;
    private String flag;
    private int salvationRate;
    private double salvationFee;
    private String currency;
    private String proposalNo;
    public void setRiskCode(String riskCode) {
        this.riskCode = riskCode;
    }
    public String getRiskCode() {
        return riskCode;
    }

    public void setManageFeeRate(String manageFeeRate) {
        this.manageFeeRate = manageFeeRate;
    }
    public String getManageFeeRate() {
        return manageFeeRate;
    }

    public void setMaxManageFeeRate(String maxManageFeeRate) {
        this.maxManageFeeRate = maxManageFeeRate;
    }
    public String getMaxManageFeeRate() {
        return maxManageFeeRate;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
    public String getFlag() {
        return flag;
    }

    public void setSalvationRate(int salvationRate) {
        this.salvationRate = salvationRate;
    }
    public int getSalvationRate() {
        return salvationRate;
    }

    public void setSalvationFee(double salvationFee) {
        this.salvationFee = salvationFee;
    }
    public double getSalvationFee() {
        return salvationFee;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public String getCurrency() {
        return currency;
    }

    public void setProposalNo(String proposalNo) {
        this.proposalNo = proposalNo;
    }
    public String getProposalNo() {
        return proposalNo;
    }

}

package com.radinfo.safe.domain.http;


import java.io.Serializable;
import java.util.Date;


public class PrpProfitMainList implements Serializable {

    private static final long serialVersionUID = 1040034209168894384L;
    private String riskCode;
    private String profitCode;
    private String profitName;
    private String conditionCode;
    private String currency;
    private double discount;
    private int totalProfit;
    private String flag;
    private String createdBy;
    private Date createdDate;
    private String updatedBy;
    private long updatedDate;
    private String proposalNo;
    public void setRiskCode(String riskCode) {
        this.riskCode = riskCode;
    }
    public String getRiskCode() {
        return riskCode;
    }

    public void setProfitCode(String profitCode) {
        this.profitCode = profitCode;
    }
    public String getProfitCode() {
        return profitCode;
    }

    public void setProfitName(String profitName) {
        this.profitName = profitName;
    }
    public String getProfitName() {
        return profitName;
    }

    public void setConditionCode(String conditionCode) {
        this.conditionCode = conditionCode;
    }
    public String getConditionCode() {
        return conditionCode;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public String getCurrency() {
        return currency;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
    public double getDiscount() {
        return discount;
    }

    public void setTotalProfit(int totalProfit) {
        this.totalProfit = totalProfit;
    }
    public int getTotalProfit() {
        return totalProfit;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
    public String getFlag() {
        return flag;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    public Date getCreatedDate() {
        return createdDate;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedDate(long updatedDate) {
        this.updatedDate = updatedDate;
    }
    public long getUpdatedDate() {
        return updatedDate;
    }

    public void setProposalNo(String proposalNo) {
        this.proposalNo = proposalNo;
    }
    public String getProposalNo() {
        return proposalNo;
    }

}

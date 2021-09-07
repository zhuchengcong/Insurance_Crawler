package com.radinfo.safe.domain.http;


import java.io.Serializable;

public class PrpProfitList implements Serializable {

    private static final long serialVersionUID = -1585099372214554028L;
    private String riskCode;
    private String profitType;
    private int itemKindNo;
    private String kindCode;
    private String currency;
    private double discount;
    private double totalProfit;
    private String minusFlag;
    private String handlerCode;
    private String approverCode;
    private String operatorCode;
    private long inputDate;
    private String flag;
    private String proposalNo;
    public void setRiskCode(String riskCode) {
        this.riskCode = riskCode;
    }
    public String getRiskCode() {
        return riskCode;
    }

    public void setProfitType(String profitType) {
        this.profitType = profitType;
    }
    public String getProfitType() {
        return profitType;
    }

    public void setItemKindNo(int itemKindNo) {
        this.itemKindNo = itemKindNo;
    }
    public int getItemKindNo() {
        return itemKindNo;
    }

    public void setKindCode(String kindCode) {
        this.kindCode = kindCode;
    }
    public String getKindCode() {
        return kindCode;
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

    public void setTotalProfit(double totalProfit) {
        this.totalProfit = totalProfit;
    }
    public double getTotalProfit() {
        return totalProfit;
    }

    public void setMinusFlag(String minusFlag) {
        this.minusFlag = minusFlag;
    }
    public String getMinusFlag() {
        return minusFlag;
    }

    public void setHandlerCode(String handlerCode) {
        this.handlerCode = handlerCode;
    }
    public String getHandlerCode() {
        return handlerCode;
    }

    public void setApproverCode(String approverCode) {
        this.approverCode = approverCode;
    }
    public String getApproverCode() {
        return approverCode;
    }

    public void setOperatorCode(String operatorCode) {
        this.operatorCode = operatorCode;
    }
    public String getOperatorCode() {
        return operatorCode;
    }

    public void setInputDate(long inputDate) {
        this.inputDate = inputDate;
    }
    public long getInputDate() {
        return inputDate;
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

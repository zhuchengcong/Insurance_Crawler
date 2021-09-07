package com.radinfo.safe.domain.http;

import java.io.Serializable;

public class PrpAgent implements Serializable {

    private static final long serialVersionUID = -2783434597368195413L;
    private String agentCode;
    private String agentName;
    private String commissionType;
    private String currency;
    private int commissionPercent;
    private double commissionAmount;
    private String remark;
    private String flag;
    private String seller;
    private String sellerCode;
    private String vocationalCode;
    private String businatureNo;
    private String businatureName;
    private String feeRuleNo;
    private String feeRuleId;
    private String icCardNo;
    private double afterTaxPremium;
    private int commsionTaxRate;
    private String certificateNo;
    private String proposalNo;
    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode;
    }
    public String getAgentCode() {
        return agentCode;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }
    public String getAgentName() {
        return agentName;
    }

    public void setCommissionType(String commissionType) {
        this.commissionType = commissionType;
    }
    public String getCommissionType() {
        return commissionType;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public String getCurrency() {
        return currency;
    }

    public void setCommissionPercent(int commissionPercent) {
        this.commissionPercent = commissionPercent;
    }
    public int getCommissionPercent() {
        return commissionPercent;
    }

    public void setCommissionAmount(double commissionAmount) {
        this.commissionAmount = commissionAmount;
    }
    public double getCommissionAmount() {
        return commissionAmount;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    public String getRemark() {
        return remark;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
    public String getFlag() {
        return flag;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }
    public String getSeller() {
        return seller;
    }

    public void setSellerCode(String sellerCode) {
        this.sellerCode = sellerCode;
    }
    public String getSellerCode() {
        return sellerCode;
    }

    public void setVocationalCode(String vocationalCode) {
        this.vocationalCode = vocationalCode;
    }
    public String getVocationalCode() {
        return vocationalCode;
    }

    public void setBusinatureNo(String businatureNo) {
        this.businatureNo = businatureNo;
    }
    public String getBusinatureNo() {
        return businatureNo;
    }

    public void setBusinatureName(String businatureName) {
        this.businatureName = businatureName;
    }
    public String getBusinatureName() {
        return businatureName;
    }

    public void setFeeRuleNo(String feeRuleNo) {
        this.feeRuleNo = feeRuleNo;
    }
    public String getFeeRuleNo() {
        return feeRuleNo;
    }

    public void setFeeRuleId(String feeRuleId) {
        this.feeRuleId = feeRuleId;
    }
    public String getFeeRuleId() {
        return feeRuleId;
    }

    public void setIcCardNo(String icCardNo) {
        this.icCardNo = icCardNo;
    }
    public String getIcCardNo() {
        return icCardNo;
    }

    public void setAfterTaxPremium(double afterTaxPremium) {
        this.afterTaxPremium = afterTaxPremium;
    }
    public double getAfterTaxPremium() {
        return afterTaxPremium;
    }

    public void setCommsionTaxRate(int commsionTaxRate) {
        this.commsionTaxRate = commsionTaxRate;
    }
    public int getCommsionTaxRate() {
        return commsionTaxRate;
    }

    public void setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo;
    }
    public String getCertificateNo() {
        return certificateNo;
    }

    public void setProposalNo(String proposalNo) {
        this.proposalNo = proposalNo;
    }
    public String getProposalNo() {
        return proposalNo;
    }

}

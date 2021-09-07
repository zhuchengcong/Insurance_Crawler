package com.radinfo.safe.domain.http;


import java.io.Serializable;

public class PrpCalculatePremiumAssist implements Serializable {

    private static final long serialVersionUID = -7188808178659390343L;
    private String businessNo;
    private String channelAdjustValueInfo;
    private String autonomyAdjustValueInfo;
    private String claimAdjustValueInfo;
    private String peccancyAdjustValueInfo;
    private String premiumDesc;
    private String createdBy;
    private String createdDate;
    private String updatedBy;
    private String updatedDate;
    public void setBusinessNo(String businessNo) {
        this.businessNo = businessNo;
    }
    public String getBusinessNo() {
        return businessNo;
    }

    public void setChannelAdjustValueInfo(String channelAdjustValueInfo) {
        this.channelAdjustValueInfo = channelAdjustValueInfo;
    }
    public String getChannelAdjustValueInfo() {
        return channelAdjustValueInfo;
    }

    public void setAutonomyAdjustValueInfo(String autonomyAdjustValueInfo) {
        this.autonomyAdjustValueInfo = autonomyAdjustValueInfo;
    }
    public String getAutonomyAdjustValueInfo() {
        return autonomyAdjustValueInfo;
    }

    public void setClaimAdjustValueInfo(String claimAdjustValueInfo) {
        this.claimAdjustValueInfo = claimAdjustValueInfo;
    }
    public String getClaimAdjustValueInfo() {
        return claimAdjustValueInfo;
    }

    public void setPeccancyAdjustValueInfo(String peccancyAdjustValueInfo) {
        this.peccancyAdjustValueInfo = peccancyAdjustValueInfo;
    }
    public String getPeccancyAdjustValueInfo() {
        return peccancyAdjustValueInfo;
    }

    public void setPremiumDesc(String premiumDesc) {
        this.premiumDesc = premiumDesc;
    }
    public String getPremiumDesc() {
        return premiumDesc;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }
    public String getCreatedDate() {
        return createdDate;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }
    public String getUpdatedDate() {
        return updatedDate;
    }

}
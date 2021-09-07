package com.radinfo.safe.domain.http;


import java.io.Serializable;

public class PrpTBoxAuthorizationData implements Serializable {

    private static final long serialVersionUID = -8192467439915990270L;
    private String proposalNo;
    private String licenseNo;
    private String engineNo;
    private String vinNo;
    private String modelCode;
    private String agreeFlag;
    private String createdBy;
    private String createdDate;
    private String updatedBy;
    private String updatedDate;
    public void setProposalNo(String proposalNo) {
        this.proposalNo = proposalNo;
    }
    public String getProposalNo() {
        return proposalNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }
    public String getLicenseNo() {
        return licenseNo;
    }

    public void setEngineNo(String engineNo) {
        this.engineNo = engineNo;
    }
    public String getEngineNo() {
        return engineNo;
    }

    public void setVinNo(String vinNo) {
        this.vinNo = vinNo;
    }
    public String getVinNo() {
        return vinNo;
    }

    public void setModelCode(String modelCode) {
        this.modelCode = modelCode;
    }
    public String getModelCode() {
        return modelCode;
    }

    public void setAgreeFlag(String agreeFlag) {
        this.agreeFlag = agreeFlag;
    }
    public String getAgreeFlag() {
        return agreeFlag;
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
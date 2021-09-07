package com.radinfo.safe.domain.http;


import java.io.Serializable;

public class PrpCarGrade implements Serializable {

    private static final long serialVersionUID = 4282773129464565091L;
    private String id;
    private String licenseNo;
    private String vinNo;
    private String engineNo;
    private String tonCount;
    private String carType;
    private String status;
    private String message;
    private String priTranche;
    private String priScore;
    private String sysSource;
    private String requestMark;
    private String responseMark;
    private String createdBy;
    private String createdDate;
    private String updatedBy;
    private String updatedDate;
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }
    public String getLicenseNo() {
        return licenseNo;
    }

    public void setVinNo(String vinNo) {
        this.vinNo = vinNo;
    }
    public String getVinNo() {
        return vinNo;
    }

    public void setEngineNo(String engineNo) {
        this.engineNo = engineNo;
    }
    public String getEngineNo() {
        return engineNo;
    }

    public void setTonCount(String tonCount) {
        this.tonCount = tonCount;
    }
    public String getTonCount() {
        return tonCount;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }
    public String getCarType() {
        return carType;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getStatus() {
        return status;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }

    public void setPriTranche(String priTranche) {
        this.priTranche = priTranche;
    }
    public String getPriTranche() {
        return priTranche;
    }

    public void setPriScore(String priScore) {
        this.priScore = priScore;
    }
    public String getPriScore() {
        return priScore;
    }

    public void setSysSource(String sysSource) {
        this.sysSource = sysSource;
    }
    public String getSysSource() {
        return sysSource;
    }

    public void setRequestMark(String requestMark) {
        this.requestMark = requestMark;
    }
    public String getRequestMark() {
        return requestMark;
    }

    public void setResponseMark(String responseMark) {
        this.responseMark = responseMark;
    }
    public String getResponseMark() {
        return responseMark;
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
package com.radinfo.safe.domain.http;


import java.io.Serializable;

public class DrivingBehavior  implements Serializable {

    private static final long serialVersionUID = 8469287779978806203L;
    private String certiNo;
    private String certiType;
    private String drivingScore;
    private String drivingRating;
    private String riskCode;
    private String carOwner;
    private String vin;
    private String areaCode;
    private String evaluationDate;
    private String validStatus;
    private String createdBy;
    private String createdDate;
    private String updatedBy;
    private String updatedDate;
    public void setCertiNo(String certiNo) {
        this.certiNo = certiNo;
    }
    public String getCertiNo() {
        return certiNo;
    }

    public void setCertiType(String certiType) {
        this.certiType = certiType;
    }
    public String getCertiType() {
        return certiType;
    }

    public void setDrivingScore(String drivingScore) {
        this.drivingScore = drivingScore;
    }
    public String getDrivingScore() {
        return drivingScore;
    }

    public void setDrivingRating(String drivingRating) {
        this.drivingRating = drivingRating;
    }
    public String getDrivingRating() {
        return drivingRating;
    }

    public void setRiskCode(String riskCode) {
        this.riskCode = riskCode;
    }
    public String getRiskCode() {
        return riskCode;
    }

    public void setCarOwner(String carOwner) {
        this.carOwner = carOwner;
    }
    public String getCarOwner() {
        return carOwner;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }
    public String getVin() {
        return vin;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }
    public String getAreaCode() {
        return areaCode;
    }

    public void setEvaluationDate(String evaluationDate) {
        this.evaluationDate = evaluationDate;
    }
    public String getEvaluationDate() {
        return evaluationDate;
    }

    public void setValidStatus(String validStatus) {
        this.validStatus = validStatus;
    }
    public String getValidStatus() {
        return validStatus;
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
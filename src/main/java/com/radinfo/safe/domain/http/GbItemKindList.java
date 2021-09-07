package com.radinfo.safe.domain.http;


import java.io.Serializable;

public class GbItemKindList implements Serializable {

    private static final long serialVersionUID = 8789680177213365212L;
    private String certiNo;
    private String cvrgCde;
    private String cvrgNme;
    private double costPrem;
    private String createdBy;
    private long createdDate;
    private String updatedBy;
    private long updatedDate;
    public void setCertiNo(String certiNo) {
        this.certiNo = certiNo;
    }
    public String getCertiNo() {
        return certiNo;
    }

    public void setCvrgCde(String cvrgCde) {
        this.cvrgCde = cvrgCde;
    }
    public String getCvrgCde() {
        return cvrgCde;
    }

    public void setCvrgNme(String cvrgNme) {
        this.cvrgNme = cvrgNme;
    }
    public String getCvrgNme() {
        return cvrgNme;
    }

    public void setCostPrem(double costPrem) {
        this.costPrem = costPrem;
    }
    public double getCostPrem() {
        return costPrem;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedDate(long createdDate) {
        this.createdDate = createdDate;
    }
    public long getCreatedDate() {
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

}

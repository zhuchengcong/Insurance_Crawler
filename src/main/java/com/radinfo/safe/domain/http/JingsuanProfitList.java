package com.radinfo.safe.domain.http;


import java.io.Serializable;

public class JingsuanProfitList implements Serializable {

    private static final long serialVersionUID = -7945566684632859566L;
    private String certiNo;
    private String type;
    private String optionCde;
    private String optionNme;
    private double value;
    private String optionFlag;
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

    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

    public void setOptionCde(String optionCde) {
        this.optionCde = optionCde;
    }
    public String getOptionCde() {
        return optionCde;
    }

    public void setOptionNme(String optionNme) {
        this.optionNme = optionNme;
    }
    public String getOptionNme() {
        return optionNme;
    }

    public void setValue(double value) {
        this.value = value;
    }
    public double getValue() {
        return value;
    }

    public void setOptionFlag(String optionFlag) {
        this.optionFlag = optionFlag;
    }
    public String getOptionFlag() {
        return optionFlag;
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
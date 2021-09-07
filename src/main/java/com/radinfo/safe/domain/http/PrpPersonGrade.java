package com.radinfo.safe.domain.http;


import java.io.Serializable;

public class PrpPersonGrade implements Serializable {

    private static final long serialVersionUID = -6310820449167481880L;
    private String certiNo;
    private String insuredCode;
    private String insuredName;
    private String idType;
    private String idNumber;
    private String mobile;
    private String personGrade;
    private String extend1;
    private String extend2;
    private String extend3;
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

    public void setInsuredCode(String insuredCode) {
        this.insuredCode = insuredCode;
    }
    public String getInsuredCode() {
        return insuredCode;
    }

    public void setInsuredName(String insuredName) {
        this.insuredName = insuredName;
    }
    public String getInsuredName() {
        return insuredName;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }
    public String getIdType() {
        return idType;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
    public String getIdNumber() {
        return idNumber;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getMobile() {
        return mobile;
    }

    public void setPersonGrade(String personGrade) {
        this.personGrade = personGrade;
    }
    public String getPersonGrade() {
        return personGrade;
    }

    public void setExtend1(String extend1) {
        this.extend1 = extend1;
    }
    public String getExtend1() {
        return extend1;
    }

    public void setExtend2(String extend2) {
        this.extend2 = extend2;
    }
    public String getExtend2() {
        return extend2;
    }

    public void setExtend3(String extend3) {
        this.extend3 = extend3;
    }
    public String getExtend3() {
        return extend3;
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
package com.radinfo.safe.domain.http;


import java.io.Serializable;

public class PrpMainBindJY implements Serializable {

    private static final long serialVersionUID = 7779721507611361688L;
    private String businessNo;
    private String policyNo;
    private String jyBusinessNo;
    private String jyPolicyNo;
    private String comCode;
    private String bindType;
    private String remark;
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

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }
    public String getPolicyNo() {
        return policyNo;
    }

    public void setJyBusinessNo(String jyBusinessNo) {
        this.jyBusinessNo = jyBusinessNo;
    }
    public String getJyBusinessNo() {
        return jyBusinessNo;
    }

    public void setJyPolicyNo(String jyPolicyNo) {
        this.jyPolicyNo = jyPolicyNo;
    }
    public String getJyPolicyNo() {
        return jyPolicyNo;
    }

    public void setComCode(String comCode) {
        this.comCode = comCode;
    }
    public String getComCode() {
        return comCode;
    }

    public void setBindType(String bindType) {
        this.bindType = bindType;
    }
    public String getBindType() {
        return bindType;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    public String getRemark() {
        return remark;
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

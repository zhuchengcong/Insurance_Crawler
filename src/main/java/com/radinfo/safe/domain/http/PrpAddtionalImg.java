package com.radinfo.safe.domain.http;


import java.io.Serializable;
import java.util.Date;

public class PrpAddtionalImg implements Serializable {

    private static final long serialVersionUID = -2152840234046529515L;
    private String certiNo;
    private String policyNo;
    private String certiType;
    private String needAddImgFlag;
    private String addImgReason;
    private String addImgRemark;
    private Date operateTime;
    private String operatorCode;
    private String comCode;
    private String underwriteFlag;
    private String uploadFlag;
    private String completeUpload;
    public void setCertiNo(String certiNo) {
        this.certiNo = certiNo;
    }
    public String getCertiNo() {
        return certiNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }
    public String getPolicyNo() {
        return policyNo;
    }

    public void setCertiType(String certiType) {
        this.certiType = certiType;
    }
    public String getCertiType() {
        return certiType;
    }

    public void setNeedAddImgFlag(String needAddImgFlag) {
        this.needAddImgFlag = needAddImgFlag;
    }
    public String getNeedAddImgFlag() {
        return needAddImgFlag;
    }

    public void setAddImgReason(String addImgReason) {
        this.addImgReason = addImgReason;
    }
    public String getAddImgReason() {
        return addImgReason;
    }

    public void setAddImgRemark(String addImgRemark) {
        this.addImgRemark = addImgRemark;
    }
    public String getAddImgRemark() {
        return addImgRemark;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }
    public Date getOperateTime() {
        return operateTime;
    }

    public void setOperatorCode(String operatorCode) {
        this.operatorCode = operatorCode;
    }
    public String getOperatorCode() {
        return operatorCode;
    }

    public void setComCode(String comCode) {
        this.comCode = comCode;
    }
    public String getComCode() {
        return comCode;
    }

    public void setUnderwriteFlag(String underwriteFlag) {
        this.underwriteFlag = underwriteFlag;
    }
    public String getUnderwriteFlag() {
        return underwriteFlag;
    }

    public void setUploadFlag(String uploadFlag) {
        this.uploadFlag = uploadFlag;
    }
    public String getUploadFlag() {
        return uploadFlag;
    }

    public void setCompleteUpload(String completeUpload) {
        this.completeUpload = completeUpload;
    }
    public String getCompleteUpload() {
        return completeUpload;
    }

}

package com.radinfo.safe.domain.http;


import java.io.Serializable;

public class PrpOcrRecord implements Serializable {

    private static final long serialVersionUID = -6685703012917559025L;
    private String serialId;
    private String certiNo;
    private String remark;
    private String createdBy;
    private String createdDate;
    private String updatedBy;
    private String updatedDate;
    private String flag;
    private boolean readMsg;
    private String items;
    public void setSerialId(String serialId) {
        this.serialId = serialId;
    }
    public String getSerialId() {
        return serialId;
    }

    public void setCertiNo(String certiNo) {
        this.certiNo = certiNo;
    }
    public String getCertiNo() {
        return certiNo;
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

    public void setFlag(String flag) {
        this.flag = flag;
    }
    public String getFlag() {
        return flag;
    }

    public void setReadMsg(boolean readMsg) {
        this.readMsg = readMsg;
    }
    public boolean getReadMsg() {
        return readMsg;
    }

    public void setItems(String items) {
        this.items = items;
    }
    public String getItems() {
        return items;
    }

}
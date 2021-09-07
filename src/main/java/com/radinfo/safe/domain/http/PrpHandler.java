package com.radinfo.safe.domain.http;


import java.io.Serializable;

public class PrpHandler implements Serializable {

    private static final long serialVersionUID = 8234183038778118731L;
    private String comCode;
    private String comName;
    private String handlerCode;
    private String handlerName;
    private int perforPercentage;
    private String remark;
    private String flag;
    private String vocationalCode;
    private String proposalNo;
    public void setComCode(String comCode) {
        this.comCode = comCode;
    }
    public String getComCode() {
        return comCode;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }
    public String getComName() {
        return comName;
    }

    public void setHandlerCode(String handlerCode) {
        this.handlerCode = handlerCode;
    }
    public String getHandlerCode() {
        return handlerCode;
    }

    public void setHandlerName(String handlerName) {
        this.handlerName = handlerName;
    }
    public String getHandlerName() {
        return handlerName;
    }

    public void setPerforPercentage(int perforPercentage) {
        this.perforPercentage = perforPercentage;
    }
    public int getPerforPercentage() {
        return perforPercentage;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    public String getRemark() {
        return remark;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
    public String getFlag() {
        return flag;
    }

    public void setVocationalCode(String vocationalCode) {
        this.vocationalCode = vocationalCode;
    }
    public String getVocationalCode() {
        return vocationalCode;
    }

    public void setProposalNo(String proposalNo) {
        this.proposalNo = proposalNo;
    }
    public String getProposalNo() {
        return proposalNo;
    }

}
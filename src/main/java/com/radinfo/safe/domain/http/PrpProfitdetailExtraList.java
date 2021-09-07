package com.radinfo.safe.domain.http;


import java.io.Serializable;
import java.util.Date;


public class PrpProfitdetailExtraList implements Serializable {

    private static final long serialVersionUID = -239994889648542764L;
    private String riskCode;
    private String profitType;
    private int profitPeriod;
    private int itemKindNo;
    private String kindCode;
    private String kindName;
    private String profitCode;
    private String profitName;
    private int serialNo;
    private String condition;
    private String fieldValue;
    private int profitRate;
    private String chooseFlag;
    private String flag;
    private String conditionCode;
    private String createdBy;
    private Date createdDate;
    private String updatedBy;
    private Date updatedDate;
    private String proposalNo;
    public void setRiskCode(String riskCode) {
        this.riskCode = riskCode;
    }
    public String getRiskCode() {
        return riskCode;
    }

    public void setProfitType(String profitType) {
        this.profitType = profitType;
    }
    public String getProfitType() {
        return profitType;
    }

    public void setProfitPeriod(int profitPeriod) {
        this.profitPeriod = profitPeriod;
    }
    public int getProfitPeriod() {
        return profitPeriod;
    }

    public void setItemKindNo(int itemKindNo) {
        this.itemKindNo = itemKindNo;
    }
    public int getItemKindNo() {
        return itemKindNo;
    }

    public void setKindCode(String kindCode) {
        this.kindCode = kindCode;
    }
    public String getKindCode() {
        return kindCode;
    }

    public void setKindName(String kindName) {
        this.kindName = kindName;
    }
    public String getKindName() {
        return kindName;
    }

    public void setProfitCode(String profitCode) {
        this.profitCode = profitCode;
    }
    public String getProfitCode() {
        return profitCode;
    }

    public void setProfitName(String profitName) {
        this.profitName = profitName;
    }
    public String getProfitName() {
        return profitName;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }
    public int getSerialNo() {
        return serialNo;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
    public String getCondition() {
        return condition;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }
    public String getFieldValue() {
        return fieldValue;
    }

    public void setProfitRate(int profitRate) {
        this.profitRate = profitRate;
    }
    public int getProfitRate() {
        return profitRate;
    }

    public void setChooseFlag(String chooseFlag) {
        this.chooseFlag = chooseFlag;
    }
    public String getChooseFlag() {
        return chooseFlag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
    public String getFlag() {
        return flag;
    }

    public void setConditionCode(String conditionCode) {
        this.conditionCode = conditionCode;
    }
    public String getConditionCode() {
        return conditionCode;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    public Date getCreatedDate() {
        return createdDate;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setProposalNo(String proposalNo) {
        this.proposalNo = proposalNo;
    }
    public String getProposalNo() {
        return proposalNo;
    }

}
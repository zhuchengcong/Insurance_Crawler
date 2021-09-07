package com.radinfo.safe.domain.http;


import java.io.Serializable;
import java.util.Date;


public class CiInsureDemandScoreList implements Serializable {

    private static final long serialVersionUID = -7343936635697777539L;
    private String demandNo;
    private int serialNo;
    private String scoreCode;
    private String scoreCodeDesc;
    private int score;
    private Date updateTime;
    private String createdBy;
    private long createdDate;
    private String updatedBy;
    private long updatedDate;
    public void setDemandNo(String demandNo) {
        this.demandNo = demandNo;
    }
    public String getDemandNo() {
        return demandNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }
    public int getSerialNo() {
        return serialNo;
    }

    public void setScoreCode(String scoreCode) {
        this.scoreCode = scoreCode;
    }
    public String getScoreCode() {
        return scoreCode;
    }

    public void setScoreCodeDesc(String scoreCodeDesc) {
        this.scoreCodeDesc = scoreCodeDesc;
    }
    public String getScoreCodeDesc() {
        return scoreCodeDesc;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public int getScore() {
        return score;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    public Date getUpdateTime() {
        return updateTime;
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
package com.radinfo.safe.domain.http;

import java.io.Serializable;
import java.util.Date;


public class CiInsureDuplicatedList implements Serializable {

    private static final long serialVersionUID = -7704128082446517234L;
    private String demandNo;
    private int serialNo;
    private String companyId;
    private Date duplicatedStartDate;
    private Date duplicatedEndDate;
    private String owner;
    private String comcCoverageName;
    private long limitAmount;
    private Date coverageStartDate;
    private Date coverageEndDate;
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

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }
    public String getCompanyId() {
        return companyId;
    }

    public void setDuplicatedStartDate(Date duplicatedStartDate) {
        this.duplicatedStartDate = duplicatedStartDate;
    }
    public Date getDuplicatedStartDate() {
        return duplicatedStartDate;
    }

    public void setDuplicatedEndDate(Date duplicatedEndDate) {
        this.duplicatedEndDate = duplicatedEndDate;
    }
    public Date getDuplicatedEndDate() {
        return duplicatedEndDate;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    public String getOwner() {
        return owner;
    }

    public void setComcCoverageName(String comcCoverageName) {
        this.comcCoverageName = comcCoverageName;
    }
    public String getComcCoverageName() {
        return comcCoverageName;
    }

    public void setLimitAmount(long limitAmount) {
        this.limitAmount = limitAmount;
    }
    public long getLimitAmount() {
        return limitAmount;
    }

    public void setCoverageStartDate(Date coverageStartDate) {
        this.coverageStartDate = coverageStartDate;
    }
    public Date getCoverageStartDate() {
        return coverageStartDate;
    }

    public void setCoverageEndDate(Date coverageEndDate) {
        this.coverageEndDate = coverageEndDate;
    }
    public Date getCoverageEndDate() {
        return coverageEndDate;
    }

}

package com.radinfo.safe.domain.http;


import java.io.Serializable;
import java.util.Date;


public class CiInsureDemandLossList  implements Serializable {

    private static final long serialVersionUID = -6298985645212733589L;
    private String demandNo;
    private String serialNo;
    private String lossTime;
    private String lossAddress;
    private String lossAction;
    private int coeff;
    private String lossType;
    private String identifyType;
    private String identifyNumber;
    private String remark;
    private String flag;
    private Date lossAcceptDate;
    private String lossactiondesc;
    private String lossTypeDesc;
    private String peccancyId;
    private String decisionId;
    private String decisionType;
    private String violationRecordTypeName;
    private String vouchCode;
    private String sanctionPerson;
    private String sanctionDate;
    private String acceptAgencyCode;
    private String processingStatus;
    private String driverName;
    private String peccanyDetail;
    public void setDemandNo(String demandNo) {
        this.demandNo = demandNo;
    }
    public String getDemandNo() {
        return demandNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }
    public String getSerialNo() {
        return serialNo;
    }

    public void setLossTime(String lossTime) {
        this.lossTime = lossTime;
    }
    public String getLossTime() {
        return lossTime;
    }

    public void setLossAddress(String lossAddress) {
        this.lossAddress = lossAddress;
    }
    public String getLossAddress() {
        return lossAddress;
    }

    public void setLossAction(String lossAction) {
        this.lossAction = lossAction;
    }
    public String getLossAction() {
        return lossAction;
    }

    public void setCoeff(int coeff) {
        this.coeff = coeff;
    }
    public int getCoeff() {
        return coeff;
    }

    public void setLossType(String lossType) {
        this.lossType = lossType;
    }
    public String getLossType() {
        return lossType;
    }

    public void setIdentifyType(String identifyType) {
        this.identifyType = identifyType;
    }
    public String getIdentifyType() {
        return identifyType;
    }

    public void setIdentifyNumber(String identifyNumber) {
        this.identifyNumber = identifyNumber;
    }
    public String getIdentifyNumber() {
        return identifyNumber;
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

    public void setLossAcceptDate(Date lossAcceptDate) {
        this.lossAcceptDate = lossAcceptDate;
    }
    public Date getLossAcceptDate() {
        return lossAcceptDate;
    }

    public void setLossactiondesc(String lossactiondesc) {
        this.lossactiondesc = lossactiondesc;
    }
    public String getLossactiondesc() {
        return lossactiondesc;
    }

    public void setLossTypeDesc(String lossTypeDesc) {
        this.lossTypeDesc = lossTypeDesc;
    }
    public String getLossTypeDesc() {
        return lossTypeDesc;
    }

    public void setPeccancyId(String peccancyId) {
        this.peccancyId = peccancyId;
    }
    public String getPeccancyId() {
        return peccancyId;
    }

    public void setDecisionId(String decisionId) {
        this.decisionId = decisionId;
    }
    public String getDecisionId() {
        return decisionId;
    }

    public void setDecisionType(String decisionType) {
        this.decisionType = decisionType;
    }
    public String getDecisionType() {
        return decisionType;
    }

    public void setViolationRecordTypeName(String violationRecordTypeName) {
        this.violationRecordTypeName = violationRecordTypeName;
    }
    public String getViolationRecordTypeName() {
        return violationRecordTypeName;
    }

    public void setVouchCode(String vouchCode) {
        this.vouchCode = vouchCode;
    }
    public String getVouchCode() {
        return vouchCode;
    }

    public void setSanctionPerson(String sanctionPerson) {
        this.sanctionPerson = sanctionPerson;
    }
    public String getSanctionPerson() {
        return sanctionPerson;
    }

    public void setSanctionDate(String sanctionDate) {
        this.sanctionDate = sanctionDate;
    }
    public String getSanctionDate() {
        return sanctionDate;
    }

    public void setAcceptAgencyCode(String acceptAgencyCode) {
        this.acceptAgencyCode = acceptAgencyCode;
    }
    public String getAcceptAgencyCode() {
        return acceptAgencyCode;
    }

    public void setProcessingStatus(String processingStatus) {
        this.processingStatus = processingStatus;
    }
    public String getProcessingStatus() {
        return processingStatus;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }
    public String getDriverName() {
        return driverName;
    }

    public void setPeccanyDetail(String peccanyDetail) {
        this.peccanyDetail = peccanyDetail;
    }
    public String getPeccanyDetail() {
        return peccanyDetail;
    }

}
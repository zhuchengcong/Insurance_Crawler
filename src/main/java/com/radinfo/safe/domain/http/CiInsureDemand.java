package com.radinfo.safe.domain.http;


import java.io.Serializable;
import java.util.Date;
public class CiInsureDemand implements Serializable {

    private static final long serialVersionUID = 2017297956653557206L;
    private String proposalNo;
    private String demandNo;
    private String policyNo;
    private String licenseNo;
    private String licenseType;
    private String useNatureCode;
    private String frameNo;
    private String engineNo;
    private String licenseColorCode;
    private String carOwner;
    private Date enrollDate;
    private Date makeDate;
    private int seatCount;
    private String tonCount;
    private Date validCheckDate;
    private String manufacturerName;
    private String modelCode;
    private String brandCName;
    private String brandName;
    private String carKindCode;
    private String checkDate;
    private Date endvalidDate;
    private String carStatus;
    private String haulage;
    private Date startDate;
    private Date endDate;
    private double amount;
    private String premium;
    private String benchMarkPremium;
    private String peccancyCoeff;
    private String claimCoeff;
    private String driverCoeff;
    private String districtCoeff;
    private String commissionRate;
    private String basePremium;
    private String comCode;
    private String operatorCode;
    private Date demandTime;
    private String remark;
    private String flag;
    private String reinsureFlag;
    private String lastBillDate;
    private String rateFloatFlag;
    private String claimAdjustReason;
    private String peccancyAdjustReason;
    private String driverRateReason;
    private String districtRateReason;
    private String adjustStart;
    private String adjustend;
    private String requestRemark;
    private String responseRemark;
    private String restricFlag;
    private String preferentialPremium;
    private String preferentialFormula;
    private String preferentialDay;
    private String prevalidNo;
    private Date proconfirmStartDate;
    private Date proConfirmEndDate;
    private String dzflag;
    private Date lastYearStartDate;
    private Date lastYearEndDate;
    private String taxActual;
    private String previousPay;
    private String lateFee;
    private String busilastyearStartDate;
    private String extendChar1;
    private String queryPastDate;
    private String transferDate;
    private String dummyRequestRemark;
    private String dummyResponseRemark;
    private String policyAdjustValue;
    private String renewalFlag;
    private String demandEffectEndTime;
    private String transferFlag;
    private String highRiskFlag;
    private String effectReason;
    private String lastYearCompanyId;
    private String message;
    private String validStatus;
    private Date operatorDate;
    private String updateCode;
    private Date updateDate;
    private String claimRecordStartDate;
    private String claimRecordEndDate;
    private String peccancyRecordStartDate;
    private String peccancyRecordEndDate;
    private String insurerArea;
    private String busiInsurerArea;
    private String newVehicleFlag;
    public void setProposalNo(String proposalNo) {
        this.proposalNo = proposalNo;
    }
    public String getProposalNo() {
        return proposalNo;
    }

    public void setDemandNo(String demandNo) {
        this.demandNo = demandNo;
    }
    public String getDemandNo() {
        return demandNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }
    public String getPolicyNo() {
        return policyNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }
    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }
    public String getLicenseType() {
        return licenseType;
    }

    public void setUseNatureCode(String useNatureCode) {
        this.useNatureCode = useNatureCode;
    }
    public String getUseNatureCode() {
        return useNatureCode;
    }

    public void setFrameNo(String frameNo) {
        this.frameNo = frameNo;
    }
    public String getFrameNo() {
        return frameNo;
    }

    public void setEngineNo(String engineNo) {
        this.engineNo = engineNo;
    }
    public String getEngineNo() {
        return engineNo;
    }

    public void setLicenseColorCode(String licenseColorCode) {
        this.licenseColorCode = licenseColorCode;
    }
    public String getLicenseColorCode() {
        return licenseColorCode;
    }

    public void setCarOwner(String carOwner) {
        this.carOwner = carOwner;
    }
    public String getCarOwner() {
        return carOwner;
    }

    public void setEnrollDate(Date enrollDate) {
        this.enrollDate = enrollDate;
    }
    public Date getEnrollDate() {
        return enrollDate;
    }

    public void setMakeDate(Date makeDate) {
        this.makeDate = makeDate;
    }
    public Date getMakeDate() {
        return makeDate;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }
    public int getSeatCount() {
        return seatCount;
    }

    public void setTonCount(String tonCount) {
        this.tonCount = tonCount;
    }
    public String getTonCount() {
        return tonCount;
    }

    public void setValidCheckDate(Date validCheckDate) {
        this.validCheckDate = validCheckDate;
    }
    public Date getValidCheckDate() {
        return validCheckDate;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }
    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setModelCode(String modelCode) {
        this.modelCode = modelCode;
    }
    public String getModelCode() {
        return modelCode;
    }

    public void setBrandCName(String brandCName) {
        this.brandCName = brandCName;
    }
    public String getBrandCName() {
        return brandCName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
    public String getBrandName() {
        return brandName;
    }

    public void setCarKindCode(String carKindCode) {
        this.carKindCode = carKindCode;
    }
    public String getCarKindCode() {
        return carKindCode;
    }

    public void setCheckDate(String checkDate) {
        this.checkDate = checkDate;
    }
    public String getCheckDate() {
        return checkDate;
    }

    public void setEndvalidDate(Date endvalidDate) {
        this.endvalidDate = endvalidDate;
    }
    public Date getEndvalidDate() {
        return endvalidDate;
    }

    public void setCarStatus(String carStatus) {
        this.carStatus = carStatus;
    }
    public String getCarStatus() {
        return carStatus;
    }

    public void setHaulage(String haulage) {
        this.haulage = haulage;
    }
    public String getHaulage() {
        return haulage;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getStartDate() {
        return startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    public Date getEndDate() {
        return endDate;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public double getAmount() {
        return amount;
    }

    public void setPremium(String premium) {
        this.premium = premium;
    }
    public String getPremium() {
        return premium;
    }

    public void setBenchMarkPremium(String benchMarkPremium) {
        this.benchMarkPremium = benchMarkPremium;
    }
    public String getBenchMarkPremium() {
        return benchMarkPremium;
    }

    public void setPeccancyCoeff(String peccancyCoeff) {
        this.peccancyCoeff = peccancyCoeff;
    }
    public String getPeccancyCoeff() {
        return peccancyCoeff;
    }

    public void setClaimCoeff(String claimCoeff) {
        this.claimCoeff = claimCoeff;
    }
    public String getClaimCoeff() {
        return claimCoeff;
    }

    public void setDriverCoeff(String driverCoeff) {
        this.driverCoeff = driverCoeff;
    }
    public String getDriverCoeff() {
        return driverCoeff;
    }

    public void setDistrictCoeff(String districtCoeff) {
        this.districtCoeff = districtCoeff;
    }
    public String getDistrictCoeff() {
        return districtCoeff;
    }

    public void setCommissionRate(String commissionRate) {
        this.commissionRate = commissionRate;
    }
    public String getCommissionRate() {
        return commissionRate;
    }

    public void setBasePremium(String basePremium) {
        this.basePremium = basePremium;
    }
    public String getBasePremium() {
        return basePremium;
    }

    public void setComCode(String comCode) {
        this.comCode = comCode;
    }
    public String getComCode() {
        return comCode;
    }

    public void setOperatorCode(String operatorCode) {
        this.operatorCode = operatorCode;
    }
    public String getOperatorCode() {
        return operatorCode;
    }

    public void setDemandTime(Date demandTime) {
        this.demandTime = demandTime;
    }
    public Date getDemandTime() {
        return demandTime;
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

    public void setReinsureFlag(String reinsureFlag) {
        this.reinsureFlag = reinsureFlag;
    }
    public String getReinsureFlag() {
        return reinsureFlag;
    }

    public void setLastBillDate(String lastBillDate) {
        this.lastBillDate = lastBillDate;
    }
    public String getLastBillDate() {
        return lastBillDate;
    }

    public void setRateFloatFlag(String rateFloatFlag) {
        this.rateFloatFlag = rateFloatFlag;
    }
    public String getRateFloatFlag() {
        return rateFloatFlag;
    }

    public void setClaimAdjustReason(String claimAdjustReason) {
        this.claimAdjustReason = claimAdjustReason;
    }
    public String getClaimAdjustReason() {
        return claimAdjustReason;
    }

    public void setPeccancyAdjustReason(String peccancyAdjustReason) {
        this.peccancyAdjustReason = peccancyAdjustReason;
    }
    public String getPeccancyAdjustReason() {
        return peccancyAdjustReason;
    }

    public void setDriverRateReason(String driverRateReason) {
        this.driverRateReason = driverRateReason;
    }
    public String getDriverRateReason() {
        return driverRateReason;
    }

    public void setDistrictRateReason(String districtRateReason) {
        this.districtRateReason = districtRateReason;
    }
    public String getDistrictRateReason() {
        return districtRateReason;
    }

    public void setAdjustStart(String adjustStart) {
        this.adjustStart = adjustStart;
    }
    public String getAdjustStart() {
        return adjustStart;
    }

    public void setAdjustend(String adjustend) {
        this.adjustend = adjustend;
    }
    public String getAdjustend() {
        return adjustend;
    }

    public void setRequestRemark(String requestRemark) {
        this.requestRemark = requestRemark;
    }
    public String getRequestRemark() {
        return requestRemark;
    }

    public void setResponseRemark(String responseRemark) {
        this.responseRemark = responseRemark;
    }
    public String getResponseRemark() {
        return responseRemark;
    }

    public void setRestricFlag(String restricFlag) {
        this.restricFlag = restricFlag;
    }
    public String getRestricFlag() {
        return restricFlag;
    }

    public void setPreferentialPremium(String preferentialPremium) {
        this.preferentialPremium = preferentialPremium;
    }
    public String getPreferentialPremium() {
        return preferentialPremium;
    }

    public void setPreferentialFormula(String preferentialFormula) {
        this.preferentialFormula = preferentialFormula;
    }
    public String getPreferentialFormula() {
        return preferentialFormula;
    }

    public void setPreferentialDay(String preferentialDay) {
        this.preferentialDay = preferentialDay;
    }
    public String getPreferentialDay() {
        return preferentialDay;
    }

    public void setPrevalidNo(String prevalidNo) {
        this.prevalidNo = prevalidNo;
    }
    public String getPrevalidNo() {
        return prevalidNo;
    }

    public void setProconfirmStartDate(Date proconfirmStartDate) {
        this.proconfirmStartDate = proconfirmStartDate;
    }
    public Date getProconfirmStartDate() {
        return proconfirmStartDate;
    }

    public void setProConfirmEndDate(Date proConfirmEndDate) {
        this.proConfirmEndDate = proConfirmEndDate;
    }
    public Date getProConfirmEndDate() {
        return proConfirmEndDate;
    }

    public void setDzflag(String dzflag) {
        this.dzflag = dzflag;
    }
    public String getDzflag() {
        return dzflag;
    }

    public void setLastYearStartDate(Date lastYearStartDate) {
        this.lastYearStartDate = lastYearStartDate;
    }
    public Date getLastYearStartDate() {
        return lastYearStartDate;
    }

    public void setLastYearEndDate(Date lastYearEndDate) {
        this.lastYearEndDate = lastYearEndDate;
    }
    public Date getLastYearEndDate() {
        return lastYearEndDate;
    }

    public void setTaxActual(String taxActual) {
        this.taxActual = taxActual;
    }
    public String getTaxActual() {
        return taxActual;
    }

    public void setPreviousPay(String previousPay) {
        this.previousPay = previousPay;
    }
    public String getPreviousPay() {
        return previousPay;
    }

    public void setLateFee(String lateFee) {
        this.lateFee = lateFee;
    }
    public String getLateFee() {
        return lateFee;
    }

    public void setBusilastyearStartDate(String busilastyearStartDate) {
        this.busilastyearStartDate = busilastyearStartDate;
    }
    public String getBusilastyearStartDate() {
        return busilastyearStartDate;
    }

    public void setExtendChar1(String extendChar1) {
        this.extendChar1 = extendChar1;
    }
    public String getExtendChar1() {
        return extendChar1;
    }

    public void setQueryPastDate(String queryPastDate) {
        this.queryPastDate = queryPastDate;
    }
    public String getQueryPastDate() {
        return queryPastDate;
    }

    public void setTransferDate(String transferDate) {
        this.transferDate = transferDate;
    }
    public String getTransferDate() {
        return transferDate;
    }

    public void setDummyRequestRemark(String dummyRequestRemark) {
        this.dummyRequestRemark = dummyRequestRemark;
    }
    public String getDummyRequestRemark() {
        return dummyRequestRemark;
    }

    public void setDummyResponseRemark(String dummyResponseRemark) {
        this.dummyResponseRemark = dummyResponseRemark;
    }
    public String getDummyResponseRemark() {
        return dummyResponseRemark;
    }

    public void setPolicyAdjustValue(String policyAdjustValue) {
        this.policyAdjustValue = policyAdjustValue;
    }
    public String getPolicyAdjustValue() {
        return policyAdjustValue;
    }

    public void setRenewalFlag(String renewalFlag) {
        this.renewalFlag = renewalFlag;
    }
    public String getRenewalFlag() {
        return renewalFlag;
    }

    public void setDemandEffectEndTime(String demandEffectEndTime) {
        this.demandEffectEndTime = demandEffectEndTime;
    }
    public String getDemandEffectEndTime() {
        return demandEffectEndTime;
    }

    public void setTransferFlag(String transferFlag) {
        this.transferFlag = transferFlag;
    }
    public String getTransferFlag() {
        return transferFlag;
    }

    public void setHighRiskFlag(String highRiskFlag) {
        this.highRiskFlag = highRiskFlag;
    }
    public String getHighRiskFlag() {
        return highRiskFlag;
    }

    public void setEffectReason(String effectReason) {
        this.effectReason = effectReason;
    }
    public String getEffectReason() {
        return effectReason;
    }

    public void setLastYearCompanyId(String lastYearCompanyId) {
        this.lastYearCompanyId = lastYearCompanyId;
    }
    public String getLastYearCompanyId() {
        return lastYearCompanyId;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }

    public void setValidStatus(String validStatus) {
        this.validStatus = validStatus;
    }
    public String getValidStatus() {
        return validStatus;
    }

    public void setOperatorDate(Date operatorDate) {
        this.operatorDate = operatorDate;
    }
    public Date getOperatorDate() {
        return operatorDate;
    }

    public void setUpdateCode(String updateCode) {
        this.updateCode = updateCode;
    }
    public String getUpdateCode() {
        return updateCode;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
    public Date getUpdateDate() {
        return updateDate;
    }

    public void setClaimRecordStartDate(String claimRecordStartDate) {
        this.claimRecordStartDate = claimRecordStartDate;
    }
    public String getClaimRecordStartDate() {
        return claimRecordStartDate;
    }

    public void setClaimRecordEndDate(String claimRecordEndDate) {
        this.claimRecordEndDate = claimRecordEndDate;
    }
    public String getClaimRecordEndDate() {
        return claimRecordEndDate;
    }

    public void setPeccancyRecordStartDate(String peccancyRecordStartDate) {
        this.peccancyRecordStartDate = peccancyRecordStartDate;
    }
    public String getPeccancyRecordStartDate() {
        return peccancyRecordStartDate;
    }

    public void setPeccancyRecordEndDate(String peccancyRecordEndDate) {
        this.peccancyRecordEndDate = peccancyRecordEndDate;
    }
    public String getPeccancyRecordEndDate() {
        return peccancyRecordEndDate;
    }

    public void setInsurerArea(String insurerArea) {
        this.insurerArea = insurerArea;
    }
    public String getInsurerArea() {
        return insurerArea;
    }

    public void setBusiInsurerArea(String busiInsurerArea) {
        this.busiInsurerArea = busiInsurerArea;
    }
    public String getBusiInsurerArea() {
        return busiInsurerArea;
    }

    public void setNewVehicleFlag(String newVehicleFlag) {
        this.newVehicleFlag = newVehicleFlag;
    }
    public String getNewVehicleFlag() {
        return newVehicleFlag;
    }

}

package com.radinfo.safe.domain.http;


import java.io.Serializable;
import java.util.Date;


public class CiInsureDemandSub  implements Serializable {

    private static final long serialVersionUID = 29067000734456687L;
    private String businessNo;
    private int serialNo;
    private String businessType;
    private String demandNo;
    private String prevalidNo;
    private String validNo;
    private String licenseNo;
    private String engineNo;
    private String frameNo;
    private String validStatus;
    private Date operateDate;
    private String operateCode;
    private String updateCode;
    private Date updateDate;
    private String policyNo;
    public void setBusinessNo(String businessNo) {
        this.businessNo = businessNo;
    }
    public String getBusinessNo() {
        return businessNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }
    public int getSerialNo() {
        return serialNo;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }
    public String getBusinessType() {
        return businessType;
    }

    public void setDemandNo(String demandNo) {
        this.demandNo = demandNo;
    }
    public String getDemandNo() {
        return demandNo;
    }

    public void setPrevalidNo(String prevalidNo) {
        this.prevalidNo = prevalidNo;
    }
    public String getPrevalidNo() {
        return prevalidNo;
    }

    public void setValidNo(String validNo) {
        this.validNo = validNo;
    }
    public String getValidNo() {
        return validNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }
    public String getLicenseNo() {
        return licenseNo;
    }

    public void setEngineNo(String engineNo) {
        this.engineNo = engineNo;
    }
    public String getEngineNo() {
        return engineNo;
    }

    public void setFrameNo(String frameNo) {
        this.frameNo = frameNo;
    }
    public String getFrameNo() {
        return frameNo;
    }

    public void setValidStatus(String validStatus) {
        this.validStatus = validStatus;
    }
    public String getValidStatus() {
        return validStatus;
    }

    public void setOperateDate(Date operateDate) {
        this.operateDate = operateDate;
    }
    public Date getOperateDate() {
        return operateDate;
    }

    public void setOperateCode(String operateCode) {
        this.operateCode = operateCode;
    }
    public String getOperateCode() {
        return operateCode;
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

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }
    public String getPolicyNo() {
        return policyNo;
    }

}
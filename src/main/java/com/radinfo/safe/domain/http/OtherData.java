package com.radinfo.safe.domain.http;


import java.io.Serializable;

public class OtherData implements Serializable {

    private static final long serialVersionUID = 927158297250923025L;
    private boolean comfirmDisRate;
    private boolean comfirmBusinessNature;
    private boolean comfirmVinNo;
    private boolean comfirmPhoneNumber;
    private String sysSource;
    private String templateCode;
    private boolean hasRequestTrafficVehicle;
    private boolean hasRequestScore;
    public void setComfirmDisRate(boolean comfirmDisRate) {
        this.comfirmDisRate = comfirmDisRate;
    }
    public boolean getComfirmDisRate() {
        return comfirmDisRate;
    }

    public void setComfirmBusinessNature(boolean comfirmBusinessNature) {
        this.comfirmBusinessNature = comfirmBusinessNature;
    }
    public boolean getComfirmBusinessNature() {
        return comfirmBusinessNature;
    }

    public void setComfirmVinNo(boolean comfirmVinNo) {
        this.comfirmVinNo = comfirmVinNo;
    }
    public boolean getComfirmVinNo() {
        return comfirmVinNo;
    }

    public void setComfirmPhoneNumber(boolean comfirmPhoneNumber) {
        this.comfirmPhoneNumber = comfirmPhoneNumber;
    }
    public boolean getComfirmPhoneNumber() {
        return comfirmPhoneNumber;
    }

    public void setSysSource(String sysSource) {
        this.sysSource = sysSource;
    }
    public String getSysSource() {
        return sysSource;
    }

    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
    }
    public String getTemplateCode() {
        return templateCode;
    }

    public void setHasRequestTrafficVehicle(boolean hasRequestTrafficVehicle) {
        this.hasRequestTrafficVehicle = hasRequestTrafficVehicle;
    }
    public boolean getHasRequestTrafficVehicle() {
        return hasRequestTrafficVehicle;
    }

    public void setHasRequestScore(boolean hasRequestScore) {
        this.hasRequestScore = hasRequestScore;
    }
    public boolean getHasRequestScore() {
        return hasRequestScore;
    }

}
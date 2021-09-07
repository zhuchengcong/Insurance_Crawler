package com.radinfo.safe.domain.http;


import java.io.Serializable;

public class PrpCarOrigin implements Serializable {

    private static final long serialVersionUID = -6531011276337018262L;
    private String proposalNo;
    private String riskCode;
    private String itemNo;
    private String brandName;
    private String modelCode;
    private String seatCount;
    private String tonCount;
    private String exhaustScale;
    public void setProposalNo(String proposalNo) {
        this.proposalNo = proposalNo;
    }
    public String getProposalNo() {
        return proposalNo;
    }

    public void setRiskCode(String riskCode) {
        this.riskCode = riskCode;
    }
    public String getRiskCode() {
        return riskCode;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }
    public String getItemNo() {
        return itemNo;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
    public String getBrandName() {
        return brandName;
    }

    public void setModelCode(String modelCode) {
        this.modelCode = modelCode;
    }
    public String getModelCode() {
        return modelCode;
    }

    public void setSeatCount(String seatCount) {
        this.seatCount = seatCount;
    }
    public String getSeatCount() {
        return seatCount;
    }

    public void setTonCount(String tonCount) {
        this.tonCount = tonCount;
    }
    public String getTonCount() {
        return tonCount;
    }

    public void setExhaustScale(String exhaustScale) {
        this.exhaustScale = exhaustScale;
    }
    public String getExhaustScale() {
        return exhaustScale;
    }

}
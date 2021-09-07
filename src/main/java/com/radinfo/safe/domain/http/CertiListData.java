package com.radinfo.safe.domain.http;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class CertiListData {

    @JsonProperty("certiNo")
    private String certino;
    @JsonProperty("licenseNo")
    private String licenseno;
    @JsonProperty("engineNo")
    private String engineno;
    @JsonProperty("appliName")
    private String appliname;
    @JsonProperty("insuredName")
    private String insuredname;
    @JsonProperty("startDate")
    private String startdate;
    @JsonProperty("endDate")
    private String enddate;
    public void setCertino(String certino) {
        this.certino = certino;
    }
    public String getCertino() {
        return certino;
    }

    public void setLicenseno(String licenseno) {
        this.licenseno = licenseno;
    }
    public String getLicenseno() {
        return licenseno;
    }

    public void setEngineno(String engineno) {
        this.engineno = engineno;
    }
    public String getEngineno() {
        return engineno;
    }

    public void setAppliname(String appliname) {
        this.appliname = appliname;
    }
    public String getAppliname() {
        return appliname;
    }

    public void setInsuredname(String insuredname) {
        this.insuredname = insuredname;
    }
    public String getInsuredname() {
        return insuredname;
    }


}

package com.radinfo.safe.domain.http;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CertiList {
    private int status;
    @JsonProperty("statusText")
    private String statustext;
    private CertiListDTO data;
    public void setStatus(int status) {
        this.status = status;
    }
    public int getStatus() {
        return status;
    }

    public void setStatustext(String statustext) {
        this.statustext = statustext;
    }
    public String getStatustext() {
        return statustext;
    }

    public void setData(CertiListDTO data) {
        this.data = data;
    }
    public CertiListDTO getData() {
        return data;
    }
}

package com.radinfo.safe.domain.http;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class CertiList implements Serializable {
    private static final long serialVersionUID = 7812141862195638880L;
    private int status;
    @JsonProperty("statusText")
    private String statusText;
    private CertiListDTO data;
    public void setStatus(int status) {
        this.status = status;
    }
    public int getStatus() {
        return status;
    }

    public String getStatusText() {
        return statusText;
    }

    public void setStatusText(String statusText) {
        this.statusText = statusText;
    }

    public void setData(CertiListDTO data) {
        this.data = data;
    }
    public CertiListDTO getData() {
        return data;
    }
}

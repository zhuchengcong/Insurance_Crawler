package com.radinfo.safe.domain.http;

import java.io.Serializable;

public class ProposalBICI implements Serializable {
    private static final long serialVersionUID = 33469590618190964L;

    private int status;
    private String statusText;
    private ProposalBICIData data;
    public void setStatus(int status) {
        this.status = status;
    }
    public int getStatus() {
        return status;
    }

    public void setStatusText(String statusText) {
        this.statusText = statusText;
    }
    public String getStatusText() {
        return statusText;
    }

    public void setData(ProposalBICIData data) {
        this.data = data;
    }
    public ProposalBICIData getData() {
        return data;
    }
}

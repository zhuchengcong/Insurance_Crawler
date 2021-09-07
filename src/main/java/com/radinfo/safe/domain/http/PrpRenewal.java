package com.radinfo.safe.domain.http;


import java.io.Serializable;

public class PrpRenewal implements Serializable {

    private static final long serialVersionUID = -1475064174647099239L;
    private String oldPolicyNo;
    private String flag;
    private String intervalDays;
    private String proposalNo;
    public void setOldPolicyNo(String oldPolicyNo) {
        this.oldPolicyNo = oldPolicyNo;
    }
    public String getOldPolicyNo() {
        return oldPolicyNo;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
    public String getFlag() {
        return flag;
    }

    public void setIntervalDays(String intervalDays) {
        this.intervalDays = intervalDays;
    }
    public String getIntervalDays() {
        return intervalDays;
    }

    public void setProposalNo(String proposalNo) {
        this.proposalNo = proposalNo;
    }
    public String getProposalNo() {
        return proposalNo;
    }

}
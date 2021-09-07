package com.radinfo.safe.domain.http;

import java.io.Serializable;

public class PrpMainsubList implements Serializable {

    private static final long serialVersionUID = 8343857559901462474L;
    private String mainPolicyNo;
    private String flag;
    private String remark;
    private String proposalNo;
    public void setMainPolicyNo(String mainPolicyNo) {
        this.mainPolicyNo = mainPolicyNo;
    }
    public String getMainPolicyNo() {
        return mainPolicyNo;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
    public String getFlag() {
        return flag;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    public String getRemark() {
        return remark;
    }

    public void setProposalNo(String proposalNo) {
        this.proposalNo = proposalNo;
    }
    public String getProposalNo() {
        return proposalNo;
    }

}

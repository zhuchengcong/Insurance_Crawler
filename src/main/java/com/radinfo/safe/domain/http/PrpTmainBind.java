package com.radinfo.safe.domain.http;


import java.io.Serializable;

public class PrpTmainBind  implements Serializable {

    private static final long serialVersionUID = 5956489474847501322L;
    private String policyNo;
    private String mainPolicyNo;
    private String flag;
    private String remark;
    private String createdBy;
    private String createdDate;
    private String updatedBy;
    private String updatedDate;
    private String riskCode;
    private String proposalNo;
    private String mainProposalNo;
    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }
    public String getPolicyNo() {
        return policyNo;
    }

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

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }
    public String getCreatedDate() {
        return createdDate;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }
    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setRiskCode(String riskCode) {
        this.riskCode = riskCode;
    }
    public String getRiskCode() {
        return riskCode;
    }

    public void setProposalNo(String proposalNo) {
        this.proposalNo = proposalNo;
    }
    public String getProposalNo() {
        return proposalNo;
    }

    public void setMainProposalNo(String mainProposalNo) {
        this.mainProposalNo = mainProposalNo;
    }
    public String getMainProposalNo() {
        return mainProposalNo;
    }

}
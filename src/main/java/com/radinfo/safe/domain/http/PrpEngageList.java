package com.radinfo.safe.domain.http;


import java.io.Serializable;

public class PrpEngageList implements Serializable {

    private static final long serialVersionUID = 2650833083122805933L;
    private String riskCode;
    private int serialNo;
    private int lineNo;
    private String clauseCode;
    private String titleFlag;
    private String flag;
    private String clauses;
    private String titleName;
    private String clauseCodeType;
    private String proposalNo;
    public void setRiskCode(String riskCode) {
        this.riskCode = riskCode;
    }
    public String getRiskCode() {
        return riskCode;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }
    public int getSerialNo() {
        return serialNo;
    }

    public void setLineNo(int lineNo) {
        this.lineNo = lineNo;
    }
    public int getLineNo() {
        return lineNo;
    }

    public void setClauseCode(String clauseCode) {
        this.clauseCode = clauseCode;
    }
    public String getClauseCode() {
        return clauseCode;
    }

    public void setTitleFlag(String titleFlag) {
        this.titleFlag = titleFlag;
    }
    public String getTitleFlag() {
        return titleFlag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
    public String getFlag() {
        return flag;
    }

    public void setClauses(String clauses) {
        this.clauses = clauses;
    }
    public String getClauses() {
        return clauses;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }
    public String getTitleName() {
        return titleName;
    }

    public void setClauseCodeType(String clauseCodeType) {
        this.clauseCodeType = clauseCodeType;
    }
    public String getClauseCodeType() {
        return clauseCodeType;
    }

    public void setProposalNo(String proposalNo) {
        this.proposalNo = proposalNo;
    }
    public String getProposalNo() {
        return proposalNo;
    }

}

package com.radinfo.safe.domain.http;

import java.io.Serializable;
import java.util.Date;


public class PrpPlanList  implements Serializable {

    private static final long serialVersionUID = -4704137238923343384L;
    private String endorseNo;
    private int serialNo;
    private int payNo;
    private String payReason;
    private Date planDate;
    private String currency;
    private double planFee;
    private double delinquentFee;
    private String flag;
    private Date planStartDate;
    private double afterTaxPremium;
    private double sumTax;
    private int taxRate;
    private String proposalNo;
    public void setEndorseNo(String endorseNo) {
        this.endorseNo = endorseNo;
    }
    public String getEndorseNo() {
        return endorseNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }
    public int getSerialNo() {
        return serialNo;
    }

    public void setPayNo(int payNo) {
        this.payNo = payNo;
    }
    public int getPayNo() {
        return payNo;
    }

    public void setPayReason(String payReason) {
        this.payReason = payReason;
    }
    public String getPayReason() {
        return payReason;
    }

    public void setPlanDate(Date planDate) {
        this.planDate = planDate;
    }
    public Date getPlanDate() {
        return planDate;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public String getCurrency() {
        return currency;
    }

    public void setPlanFee(double planFee) {
        this.planFee = planFee;
    }
    public double getPlanFee() {
        return planFee;
    }

    public void setDelinquentFee(double delinquentFee) {
        this.delinquentFee = delinquentFee;
    }
    public double getDelinquentFee() {
        return delinquentFee;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
    public String getFlag() {
        return flag;
    }

    public void setPlanStartDate(Date planStartDate) {
        this.planStartDate = planStartDate;
    }
    public Date getPlanStartDate() {
        return planStartDate;
    }

    public void setAfterTaxPremium(double afterTaxPremium) {
        this.afterTaxPremium = afterTaxPremium;
    }
    public double getAfterTaxPremium() {
        return afterTaxPremium;
    }

    public void setSumTax(double sumTax) {
        this.sumTax = sumTax;
    }
    public double getSumTax() {
        return sumTax;
    }

    public void setTaxRate(int taxRate) {
        this.taxRate = taxRate;
    }
    public int getTaxRate() {
        return taxRate;
    }

    public void setProposalNo(String proposalNo) {
        this.proposalNo = proposalNo;
    }
    public String getProposalNo() {
        return proposalNo;
    }

}

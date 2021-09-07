package com.radinfo.safe.domain.http;


import java.io.Serializable;

public class PrpFeeList implements Serializable {

    private static final long serialVersionUID = 425950527103800487L;
    private String riskCode;
    private String currency;
    private double amount;
    private double premium;
    private String flag;
    private String currency1;
    private int exchangeRate1;
    private double amount1;
    private double premium1;
    private String currency2;
    private int exchangeRate2;
    private double amount2;
    private double premium2;
    private double afterTaxPremium;
    private double sumTax;
    private int taxRate;
    private String proposalNo;
    public void setRiskCode(String riskCode) {
        this.riskCode = riskCode;
    }
    public String getRiskCode() {
        return riskCode;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public String getCurrency() {
        return currency;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public double getAmount() {
        return amount;
    }

    public void setPremium(double premium) {
        this.premium = premium;
    }
    public double getPremium() {
        return premium;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
    public String getFlag() {
        return flag;
    }

    public void setCurrency1(String currency1) {
        this.currency1 = currency1;
    }
    public String getCurrency1() {
        return currency1;
    }

    public void setExchangeRate1(int exchangeRate1) {
        this.exchangeRate1 = exchangeRate1;
    }
    public int getExchangeRate1() {
        return exchangeRate1;
    }

    public void setAmount1(double amount1) {
        this.amount1 = amount1;
    }
    public double getAmount1() {
        return amount1;
    }

    public void setPremium1(double premium1) {
        this.premium1 = premium1;
    }
    public double getPremium1() {
        return premium1;
    }

    public void setCurrency2(String currency2) {
        this.currency2 = currency2;
    }
    public String getCurrency2() {
        return currency2;
    }

    public void setExchangeRate2(int exchangeRate2) {
        this.exchangeRate2 = exchangeRate2;
    }
    public int getExchangeRate2() {
        return exchangeRate2;
    }

    public void setAmount2(double amount2) {
        this.amount2 = amount2;
    }
    public double getAmount2() {
        return amount2;
    }

    public void setPremium2(double premium2) {
        this.premium2 = premium2;
    }
    public double getPremium2() {
        return premium2;
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
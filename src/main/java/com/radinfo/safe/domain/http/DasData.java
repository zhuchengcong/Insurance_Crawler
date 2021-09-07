package com.radinfo.safe.domain.http;


import java.io.Serializable;
import java.util.List;


public class DasData implements Serializable {

    private static final long serialVersionUID = -7134599470400366659L;
    private String businessNoDAB;
    private String profitRateDABC01;
    private String profitRateDABC02;
    private String profitRateDABC05;
    private List<String> kindCodeDABList;
    private boolean needValidProfitRate;
    public void setBusinessNoDAB(String businessNoDAB) {
        this.businessNoDAB = businessNoDAB;
    }
    public String getBusinessNoDAB() {
        return businessNoDAB;
    }

    public void setProfitRateDABC01(String profitRateDABC01) {
        this.profitRateDABC01 = profitRateDABC01;
    }
    public String getProfitRateDABC01() {
        return profitRateDABC01;
    }

    public void setProfitRateDABC02(String profitRateDABC02) {
        this.profitRateDABC02 = profitRateDABC02;
    }
    public String getProfitRateDABC02() {
        return profitRateDABC02;
    }

    public void setProfitRateDABC05(String profitRateDABC05) {
        this.profitRateDABC05 = profitRateDABC05;
    }
    public String getProfitRateDABC05() {
        return profitRateDABC05;
    }

    public void setKindCodeDABList(List<String> kindCodeDABList) {
        this.kindCodeDABList = kindCodeDABList;
    }
    public List<String> getKindCodeDABList() {
        return kindCodeDABList;
    }

    public void setNeedValidProfitRate(boolean needValidProfitRate) {
        this.needValidProfitRate = needValidProfitRate;
    }
    public boolean getNeedValidProfitRate() {
        return needValidProfitRate;
    }

}
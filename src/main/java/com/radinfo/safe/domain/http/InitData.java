package com.radinfo.safe.domain.http;


import java.io.Serializable;

public class InitData  implements Serializable {

    private static final long serialVersionUID = -1589080992470850192L;
    private String isDQZReform2020Start;
    private String isDABReform2020Start;
    private boolean profitC03FromSalesAndArrowFactorSerialNo;
    private boolean profitC03FromSales;
    public void setIsDQZReform2020Start(String isDQZReform2020Start) {
        this.isDQZReform2020Start = isDQZReform2020Start;
    }
    public String getIsDQZReform2020Start() {
        return isDQZReform2020Start;
    }

    public void setIsDABReform2020Start(String isDABReform2020Start) {
        this.isDABReform2020Start = isDABReform2020Start;
    }
    public String getIsDABReform2020Start() {
        return isDABReform2020Start;
    }

    public void setProfitC03FromSalesAndArrowFactorSerialNo(boolean profitC03FromSalesAndArrowFactorSerialNo) {
        this.profitC03FromSalesAndArrowFactorSerialNo = profitC03FromSalesAndArrowFactorSerialNo;
    }
    public boolean getProfitC03FromSalesAndArrowFactorSerialNo() {
        return profitC03FromSalesAndArrowFactorSerialNo;
    }

    public void setProfitC03FromSales(boolean profitC03FromSales) {
        this.profitC03FromSales = profitC03FromSales;
    }
    public boolean getProfitC03FromSales() {
        return profitC03FromSales;
    }

}

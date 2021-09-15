package com.radinfo.safe.request;

import java.io.Serializable;
//合并计算请求体
//这里面需要根据 入参结果灵活添加参数

public class CalculatePremiumAllRequest implements Serializable {
    private static final long serialVersionUID = -3757215755707468335L;
//    InsuranceBIData
    private boolean hideLoading=false;
    private InsuranceBIDataRequest insuranceBIData;
    private InsuranceCIDataRequest insuranceCIData;

    public InsuranceCIDataRequest getInsuranceCIData() {
        return insuranceCIData;
    }

    public void setInsuranceCIData(InsuranceCIDataRequest insuranceCIData) {
        this.insuranceCIData = insuranceCIData;
    }

    public boolean isHideLoading() {
        return hideLoading;
    }

    public void setHideLoading(boolean hideLoading) {
        this.hideLoading = hideLoading;
    }

    public InsuranceBIDataRequest getInsuranceBIData() {
        return insuranceBIData;
    }

    public void setInsuranceBIData(InsuranceBIDataRequest insuranceBIData) {
        this.insuranceBIData = insuranceBIData;
    }
}

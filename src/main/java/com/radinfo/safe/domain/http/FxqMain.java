package com.radinfo.safe.domain.http;


import java.io.Serializable;
import java.util.List;


public class FxqMain implements Serializable {

    private static final long serialVersionUID = -6616582464956071571L;
    private boolean showFxqFlag;
    private List<String> fxqInputType;
    private boolean identifyFlag;
    private boolean oldIdentifyFlag;
    private int premium;
    public void setShowFxqFlag(boolean showFxqFlag) {
        this.showFxqFlag = showFxqFlag;
    }
    public boolean getShowFxqFlag() {
        return showFxqFlag;
    }

    public void setFxqInputType(List<String> fxqInputType) {
        this.fxqInputType = fxqInputType;
    }
    public List<String> getFxqInputType() {
        return fxqInputType;
    }

    public void setIdentifyFlag(boolean identifyFlag) {
        this.identifyFlag = identifyFlag;
    }
    public boolean getIdentifyFlag() {
        return identifyFlag;
    }

    public void setOldIdentifyFlag(boolean oldIdentifyFlag) {
        this.oldIdentifyFlag = oldIdentifyFlag;
    }
    public boolean getOldIdentifyFlag() {
        return oldIdentifyFlag;
    }

    public void setPremium(int premium) {
        this.premium = premium;
    }
    public int getPremium() {
        return premium;
    }

}
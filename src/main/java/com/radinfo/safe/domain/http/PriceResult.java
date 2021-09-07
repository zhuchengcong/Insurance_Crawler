package com.radinfo.safe.domain.http;


import java.io.Serializable;
import java.util.List;

public class PriceResult implements Serializable {

    private static final long serialVersionUID = 6052239314184327083L;

    private GbMain gbMain;
    private GbOriginMain gbOriginMain;
    private List<GbItemKindList> gbItemKindList;
    private List<JingsuanProfitList> jingsuanProfitList;
    private List<HebaoProfitList> hebaoProfitList;
    private List<ChushiProfitist> chushiProfitist;
    private List<String> liandongProfitList;
    private List<QiwangProfitList> qiwangProfitList;
    private List<QiandanProfitList> qiandanProfitList;
    private List<String> gbEffectList;
    public void setGbMain(GbMain gbMain) {
        this.gbMain = gbMain;
    }
    public GbMain getGbMain() {
        return gbMain;
    }

    public void setGbOriginMain(GbOriginMain gbOriginMain) {
        this.gbOriginMain = gbOriginMain;
    }
    public GbOriginMain getGbOriginMain() {
        return gbOriginMain;
    }

    public void setGbItemKindList(List<GbItemKindList> gbItemKindList) {
        this.gbItemKindList = gbItemKindList;
    }
    public List<GbItemKindList> getGbItemKindList() {
        return gbItemKindList;
    }

    public void setJingsuanProfitList(List<JingsuanProfitList> jingsuanProfitList) {
        this.jingsuanProfitList = jingsuanProfitList;
    }
    public List<JingsuanProfitList> getJingsuanProfitList() {
        return jingsuanProfitList;
    }

    public void setHebaoProfitList(List<HebaoProfitList> hebaoProfitList) {
        this.hebaoProfitList = hebaoProfitList;
    }
    public List<HebaoProfitList> getHebaoProfitList() {
        return hebaoProfitList;
    }

    public void setChushiProfitist(List<ChushiProfitist> chushiProfitist) {
        this.chushiProfitist = chushiProfitist;
    }
    public List<ChushiProfitist> getChushiProfitist() {
        return chushiProfitist;
    }

    public void setLiandongProfitList(List<String> liandongProfitList) {
        this.liandongProfitList = liandongProfitList;
    }
    public List<String> getLiandongProfitList() {
        return liandongProfitList;
    }

    public void setQiwangProfitList(List<QiwangProfitList> qiwangProfitList) {
        this.qiwangProfitList = qiwangProfitList;
    }
    public List<QiwangProfitList> getQiwangProfitList() {
        return qiwangProfitList;
    }

    public void setQiandanProfitList(List<QiandanProfitList> qiandanProfitList) {
        this.qiandanProfitList = qiandanProfitList;
    }
    public List<QiandanProfitList> getQiandanProfitList() {
        return qiandanProfitList;
    }

    public void setGbEffectList(List<String> gbEffectList) {
        this.gbEffectList = gbEffectList;
    }
    public List<String> getGbEffectList() {
        return gbEffectList;
    }

}

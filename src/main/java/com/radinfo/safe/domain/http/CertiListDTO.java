package com.radinfo.safe.domain.http;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public class CertiListDTO implements Serializable {
    private static final long serialVersionUID = 8509177830938822853L;
    @JsonProperty("pageNo")
    private int pageno;
    @JsonProperty("perPage")
    private int perpage;
    @JsonProperty("totalCount")
    private int totalcount;
    private List<CertiListData> data;
    public void setPageno(int pageno) {
        this.pageno = pageno;
    }
    public int getPageno() {
        return pageno;
    }

    public void setPerpage(int perpage) {
        this.perpage = perpage;
    }
    public int getPerpage() {
        return perpage;
    }

    public void setTotalcount(int totalcount) {
        this.totalcount = totalcount;
    }
    public int getTotalcount() {
        return totalcount;
    }

    public void setData(List<CertiListData> data) {
        this.data = data;
    }
    public List<CertiListData> getData() {
        return data;
    }
}

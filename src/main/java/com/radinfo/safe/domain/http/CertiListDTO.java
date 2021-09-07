package com.radinfo.safe.domain.http;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public class CertiListDTO implements Serializable {
    private static final long serialVersionUID = 8509177830938822853L;
    @JsonProperty("pageNo")
    private int pageNo;
    @JsonProperty("perPage")
    private int perPage;
    @JsonProperty("totalCount")
    private int totalCount;
    private List<CertiListData> data;

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPerPage() {
        return perPage;
    }

    public void setPerPage(int perPage) {
        this.perPage = perPage;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List<CertiListData> getData() {
        return data;
    }

    public void setData(List<CertiListData> data) {
        this.data = data;
    }
}

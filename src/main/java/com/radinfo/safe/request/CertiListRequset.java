package com.radinfo.safe.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class CertiListRequset implements Serializable {
    private static final long serialVersionUID = 5073667233378775754L;
    @JsonProperty("queryData")
    private Querydata queryData;
    private Pager pager;
    @JsonProperty("hideLoading")
    private boolean hideLoading=false;


    public Querydata getQueryData() {
        return queryData;
    }

    public void setQueryData(Querydata queryData) {
        this.queryData = queryData;
    }

    public Pager getPager() {
        return pager;
    }

    public void setPager(Pager pager) {
        this.pager = pager;
    }

    public boolean isHideLoading() {
        return hideLoading;
    }

    public void setHideLoading(boolean hideLoading) {
        this.hideLoading = hideLoading;
    }

    public class Querydata {

        @JsonProperty("proposalNo")
        private String proposalNo="";
        @JsonProperty("policyNo")
        private String policyNo="";
        @JsonProperty("insuredName")
        private String insuredName="";
        @JsonProperty("licenseNo")
        private String licenseNo="";
        @JsonProperty("vinNo")
        private String vinNo="";
        @JsonProperty("engineNo")
        private String engineNo="";

        public String getProposalNo() {
            return proposalNo;
        }

        public void setProposalNo(String proposalNo) {
            this.proposalNo = proposalNo;
        }

        public String getPolicyNo() {
            return policyNo;
        }

        public void setPolicyNo(String policyNo) {
            this.policyNo = policyNo;
        }

        public String getInsuredName() {
            return insuredName;
        }

        public void setInsuredName(String insuredName) {
            this.insuredName = insuredName;
        }

        public String getLicenseNo() {
            return licenseNo;
        }

        public void setLicenseNo(String licenseNo) {
            this.licenseNo = licenseNo;
        }

        public String getVinNo() {
            return vinNo;
        }

        public void setVinNo(String vinNo) {
            this.vinNo = vinNo;
        }

        public String getEngineNo() {
            return engineNo;
        }

        public void setEngineNo(String engineNo) {
            this.engineNo = engineNo;
        }
    }










    public class Pager {

        private int page =1;
        @JsonProperty("totalCount")
        private int totalCount;
        private int limit=10;

        public int getPage() {
            return page;
        }

        public void setPage(int page) {
            this.page = page;
        }

        public int getTotalCount() {
            return totalCount;
        }

        public void setTotalCount(int totalCount) {
            this.totalCount = totalCount;
        }

        public int getLimit() {
            return limit;
        }

        public void setLimit(int limit) {
            this.limit = limit;
        }
    }
}

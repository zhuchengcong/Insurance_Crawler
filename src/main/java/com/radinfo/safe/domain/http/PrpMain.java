package com.radinfo.safe.domain.http;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class PrpMain implements Serializable {

    private static final long serialVersionUID = 6684230719606742828L;
    private String policyNo;
    private String classCode;
    private String riskCode;
    private String proposalNo;
    private String contractNo;
    private String policySort;
    private String printNo;
    private String businessNature;
    private String language;
    private String policyType;
    private String appliCode;
    private String appliName;
    private String appliAddress;
    private String insuredCode;
    private String insuredName;
    private String insuredAddress;
    private Date operateDate;
    private Date startDate;
    private int startHour;
    private Date endDate;
    private int endHour;
    private String pureRate;
    private double disRate;
    private double taxDisRate;
    private double discount;
    private String currency;
    private String sumValue;
    private double sumAmount;
    private double sumDiscount;
    private double sumPremium;
    private int sumSubPrem;
    private int sumQuantity;
    private String judicalCode;
    private String judicalScope;
    private String autoTransRenewflag;
    private String argueSolution;
    private String arbitBoardName;
    private int payTimes;
    private String endorseTimes;
    private String claimTimes;
    private String makeCom;
    private String operateSite;
    private String comCode;
    private String handlerCode;
    private String handler1Code;
    private String approverCode;
    private String underwriteCode;
    private String underwriteName;
    private String operatorCode;
    private Date inputDate;
    private int inputHour;
    private Date underwriteEndDate;
    private Date statisticsYM;
    private String agentCode;
    private String coinsFlag;
    private String reinsFlag;
    private String allinsFlag;
    private String underwriteFlag;
    private String othFlag;
    private String flag;
    private int disRate1;
    private String businessFlag;
    private String updaterCode;
    private Date updateDate;
    private String updateHour;
    private Date signDate;
    private String shareHolderFlag;
    private String agreementNo;
    private String inquiryNo;
    private String payMode;
    private String remark;
    private String visaCode;
    private String manualType;
    private String nationFlag;
    private String startMinute;
    private String endMinute;
    private String jfeeFlag;
    private Date precheckDate;
    private String handlerName;
    private String handler1Name;
    private String payRefCode;
    private String payRefName;
    private String payRefTime;
    private String printTime;
    private String agriType;
    private String subBusinessNature;
    private String agriNature;
    private String serviceProviders;
    private String serviceType;
    private String services;
    private String billingWay;
    private String businessChannel;
    private String businessAgentType;
    private String uniteAgentChannel;
    private String businessKind;
    private String invoiceMan;
    private String cardCName;
    private String formatPolicyCode;
    private String quotationNo;
    private String additionalFlag;
    private String agentOperateFlag;
    private String printStatus;
    private String ifRemote;
    private String ifMedical;
    private String operateTime;
    private Date saveTime;
    private String businatureNo;
    private String teamCode;
    private String sysSource;
    private String ciArmyFlag;
    private String feeRuleNo;
    private String feeRuleId;
    private String quotationNum;
    private int sumPremiumOrigin;
    private String insertTime;
    private String updateTime;
    private String reportFlag;
    private String lastYearEndDate;
    private String businessType;
    private String upperRuleId;
    private String uniqueNo;
    private double additionalCostRate;
    private double afterTaxPremium;
    private double sumTax;
    private int taxRate;
    private String thirdBusinessFlag;
    private String recordCode;
    private String activationNo;
    private String createdBy;
    private long createdDate;
    private String updatedBy;
    private long updatedDate;
    private String epolicyFlag;
    private String eproposalFlag;
    private String agentBusiness;
    private String autoTransRenewFlag;
    private String jfeePayType;
    private Date prePayRefTime;
    private String isDQZInOurCompany;
    private String isArmyVehicle;
    private String isInsuredDQZNow;
    private String renewalFlag;
    private int shortRate;
    private double sumBenchmarkPremium;
    private double totalDisCount;
    private String disRateModifyPower;
    private int disRateTop;
    private String disRateModifyFlag;
    private String shareHolderName;
    private String commissionMessageList;
    private String combo;
    private String comboName;
    private String localTaxFlag;
    private String selectedUndwrtProfit;
    private String inputPricedProfit;
    private int factorMultiplyPricedProfit;
    private int standardPricedProfit;
    private int processedPricedProfit;
    private int realPricedProfit;
    private String profitRemark;
    private String profitC03FeeRuleId;
    private String profitC03FeeRuleNo;
    private List<String> undwrtProfitList;
    private boolean undwrtProfitC03Valid;
    private boolean undwrtProfitC03ValidAndArrowFactorSerialNo;
    private String quoteType;
    private String relatedFlag;
    private String salesExpenseRate;
    private String guangBoCertiNo;
    private String commissionFlag;
    private String useGbPricedProfitFlag;
    private String lsiCombo;
    private String lsiComboName;
    private String loanPeriod;
    private String beneficiaryClause;
    private String einsuranceCardFlag;
    private String allPremium;
    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }
    public String getPolicyNo() {
        return policyNo;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }
    public String getClassCode() {
        return classCode;
    }

    public void setRiskCode(String riskCode) {
        this.riskCode = riskCode;
    }
    public String getRiskCode() {
        return riskCode;
    }

    public void setProposalNo(String proposalNo) {
        this.proposalNo = proposalNo;
    }
    public String getProposalNo() {
        return proposalNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }
    public String getContractNo() {
        return contractNo;
    }

    public void setPolicySort(String policySort) {
        this.policySort = policySort;
    }
    public String getPolicySort() {
        return policySort;
    }

    public void setPrintNo(String printNo) {
        this.printNo = printNo;
    }
    public String getPrintNo() {
        return printNo;
    }

    public void setBusinessNature(String businessNature) {
        this.businessNature = businessNature;
    }
    public String getBusinessNature() {
        return businessNature;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    public String getLanguage() {
        return language;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }
    public String getPolicyType() {
        return policyType;
    }

    public void setAppliCode(String appliCode) {
        this.appliCode = appliCode;
    }
    public String getAppliCode() {
        return appliCode;
    }

    public void setAppliName(String appliName) {
        this.appliName = appliName;
    }
    public String getAppliName() {
        return appliName;
    }

    public void setAppliAddress(String appliAddress) {
        this.appliAddress = appliAddress;
    }
    public String getAppliAddress() {
        return appliAddress;
    }

    public void setInsuredCode(String insuredCode) {
        this.insuredCode = insuredCode;
    }
    public String getInsuredCode() {
        return insuredCode;
    }

    public void setInsuredName(String insuredName) {
        this.insuredName = insuredName;
    }
    public String getInsuredName() {
        return insuredName;
    }

    public void setInsuredAddress(String insuredAddress) {
        this.insuredAddress = insuredAddress;
    }
    public String getInsuredAddress() {
        return insuredAddress;
    }

    public void setOperateDate(Date operateDate) {
        this.operateDate = operateDate;
    }
    public Date getOperateDate() {
        return operateDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getStartDate() {
        return startDate;
    }

    public void setStartHour(int startHour) {
        this.startHour = startHour;
    }
    public int getStartHour() {
        return startHour;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    public Date getEndDate() {
        return endDate;
    }

    public void setEndHour(int endHour) {
        this.endHour = endHour;
    }
    public int getEndHour() {
        return endHour;
    }

    public void setPureRate(String pureRate) {
        this.pureRate = pureRate;
    }
    public String getPureRate() {
        return pureRate;
    }

    public void setDisRate(double disRate) {
        this.disRate = disRate;
    }
    public double getDisRate() {
        return disRate;
    }

    public void setTaxDisRate(double taxDisRate) {
        this.taxDisRate = taxDisRate;
    }
    public double getTaxDisRate() {
        return taxDisRate;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
    public double getDiscount() {
        return discount;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public String getCurrency() {
        return currency;
    }

    public void setSumValue(String sumValue) {
        this.sumValue = sumValue;
    }
    public String getSumValue() {
        return sumValue;
    }

    public void setSumAmount(double sumAmount) {
        this.sumAmount = sumAmount;
    }
    public double getSumAmount() {
        return sumAmount;
    }

    public void setSumDiscount(double sumDiscount) {
        this.sumDiscount = sumDiscount;
    }
    public double getSumDiscount() {
        return sumDiscount;
    }

    public void setSumPremium(double sumPremium) {
        this.sumPremium = sumPremium;
    }
    public double getSumPremium() {
        return sumPremium;
    }

    public void setSumSubPrem(int sumSubPrem) {
        this.sumSubPrem = sumSubPrem;
    }
    public int getSumSubPrem() {
        return sumSubPrem;
    }

    public void setSumQuantity(int sumQuantity) {
        this.sumQuantity = sumQuantity;
    }
    public int getSumQuantity() {
        return sumQuantity;
    }

    public void setJudicalCode(String judicalCode) {
        this.judicalCode = judicalCode;
    }
    public String getJudicalCode() {
        return judicalCode;
    }

    public void setJudicalScope(String judicalScope) {
        this.judicalScope = judicalScope;
    }
    public String getJudicalScope() {
        return judicalScope;
    }

    public void setAutoTransRenewflag(String autoTransRenewflag) {
        this.autoTransRenewflag = autoTransRenewflag;
    }
    public String getAutoTransRenewflag() {
        return autoTransRenewflag;
    }

    public void setArgueSolution(String argueSolution) {
        this.argueSolution = argueSolution;
    }
    public String getArgueSolution() {
        return argueSolution;
    }

    public void setArbitBoardName(String arbitBoardName) {
        this.arbitBoardName = arbitBoardName;
    }
    public String getArbitBoardName() {
        return arbitBoardName;
    }

    public void setPayTimes(int payTimes) {
        this.payTimes = payTimes;
    }
    public int getPayTimes() {
        return payTimes;
    }

    public void setEndorseTimes(String endorseTimes) {
        this.endorseTimes = endorseTimes;
    }
    public String getEndorseTimes() {
        return endorseTimes;
    }

    public void setClaimTimes(String claimTimes) {
        this.claimTimes = claimTimes;
    }
    public String getClaimTimes() {
        return claimTimes;
    }

    public void setMakeCom(String makeCom) {
        this.makeCom = makeCom;
    }
    public String getMakeCom() {
        return makeCom;
    }

    public void setOperateSite(String operateSite) {
        this.operateSite = operateSite;
    }
    public String getOperateSite() {
        return operateSite;
    }

    public void setComCode(String comCode) {
        this.comCode = comCode;
    }
    public String getComCode() {
        return comCode;
    }

    public void setHandlerCode(String handlerCode) {
        this.handlerCode = handlerCode;
    }
    public String getHandlerCode() {
        return handlerCode;
    }

    public void setHandler1Code(String handler1Code) {
        this.handler1Code = handler1Code;
    }
    public String getHandler1Code() {
        return handler1Code;
    }

    public void setApproverCode(String approverCode) {
        this.approverCode = approverCode;
    }
    public String getApproverCode() {
        return approverCode;
    }

    public void setUnderwriteCode(String underwriteCode) {
        this.underwriteCode = underwriteCode;
    }
    public String getUnderwriteCode() {
        return underwriteCode;
    }

    public void setUnderwriteName(String underwriteName) {
        this.underwriteName = underwriteName;
    }
    public String getUnderwriteName() {
        return underwriteName;
    }

    public void setOperatorCode(String operatorCode) {
        this.operatorCode = operatorCode;
    }
    public String getOperatorCode() {
        return operatorCode;
    }

    public void setInputDate(Date inputDate) {
        this.inputDate = inputDate;
    }
    public Date getInputDate() {
        return inputDate;
    }

    public void setInputHour(int inputHour) {
        this.inputHour = inputHour;
    }
    public int getInputHour() {
        return inputHour;
    }

    public void setUnderwriteEndDate(Date underwriteEndDate) {
        this.underwriteEndDate = underwriteEndDate;
    }
    public Date getUnderwriteEndDate() {
        return underwriteEndDate;
    }

    public void setStatisticsYM(Date statisticsYM) {
        this.statisticsYM = statisticsYM;
    }
    public Date getStatisticsYM() {
        return statisticsYM;
    }

    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode;
    }
    public String getAgentCode() {
        return agentCode;
    }

    public void setCoinsFlag(String coinsFlag) {
        this.coinsFlag = coinsFlag;
    }
    public String getCoinsFlag() {
        return coinsFlag;
    }

    public void setReinsFlag(String reinsFlag) {
        this.reinsFlag = reinsFlag;
    }
    public String getReinsFlag() {
        return reinsFlag;
    }

    public void setAllinsFlag(String allinsFlag) {
        this.allinsFlag = allinsFlag;
    }
    public String getAllinsFlag() {
        return allinsFlag;
    }

    public void setUnderwriteFlag(String underwriteFlag) {
        this.underwriteFlag = underwriteFlag;
    }
    public String getUnderwriteFlag() {
        return underwriteFlag;
    }

    public void setOthFlag(String othFlag) {
        this.othFlag = othFlag;
    }
    public String getOthFlag() {
        return othFlag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
    public String getFlag() {
        return flag;
    }

    public void setDisRate1(int disRate1) {
        this.disRate1 = disRate1;
    }
    public int getDisRate1() {
        return disRate1;
    }

    public void setBusinessFlag(String businessFlag) {
        this.businessFlag = businessFlag;
    }
    public String getBusinessFlag() {
        return businessFlag;
    }

    public void setUpdaterCode(String updaterCode) {
        this.updaterCode = updaterCode;
    }
    public String getUpdaterCode() {
        return updaterCode;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateHour(String updateHour) {
        this.updateHour = updateHour;
    }
    public String getUpdateHour() {
        return updateHour;
    }

    public void setSignDate(Date signDate) {
        this.signDate = signDate;
    }
    public Date getSignDate() {
        return signDate;
    }

    public void setShareHolderFlag(String shareHolderFlag) {
        this.shareHolderFlag = shareHolderFlag;
    }
    public String getShareHolderFlag() {
        return shareHolderFlag;
    }

    public void setAgreementNo(String agreementNo) {
        this.agreementNo = agreementNo;
    }
    public String getAgreementNo() {
        return agreementNo;
    }

    public void setInquiryNo(String inquiryNo) {
        this.inquiryNo = inquiryNo;
    }
    public String getInquiryNo() {
        return inquiryNo;
    }

    public void setPayMode(String payMode) {
        this.payMode = payMode;
    }
    public String getPayMode() {
        return payMode;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    public String getRemark() {
        return remark;
    }

    public void setVisaCode(String visaCode) {
        this.visaCode = visaCode;
    }
    public String getVisaCode() {
        return visaCode;
    }

    public void setManualType(String manualType) {
        this.manualType = manualType;
    }
    public String getManualType() {
        return manualType;
    }

    public void setNationFlag(String nationFlag) {
        this.nationFlag = nationFlag;
    }
    public String getNationFlag() {
        return nationFlag;
    }

    public void setStartMinute(String startMinute) {
        this.startMinute = startMinute;
    }
    public String getStartMinute() {
        return startMinute;
    }

    public void setEndMinute(String endMinute) {
        this.endMinute = endMinute;
    }
    public String getEndMinute() {
        return endMinute;
    }

    public void setJfeeFlag(String jfeeFlag) {
        this.jfeeFlag = jfeeFlag;
    }
    public String getJfeeFlag() {
        return jfeeFlag;
    }

    public void setPrecheckDate(Date precheckDate) {
        this.precheckDate = precheckDate;
    }
    public Date getPrecheckDate() {
        return precheckDate;
    }

    public void setHandlerName(String handlerName) {
        this.handlerName = handlerName;
    }
    public String getHandlerName() {
        return handlerName;
    }

    public void setHandler1Name(String handler1Name) {
        this.handler1Name = handler1Name;
    }
    public String getHandler1Name() {
        return handler1Name;
    }

    public void setPayRefCode(String payRefCode) {
        this.payRefCode = payRefCode;
    }
    public String getPayRefCode() {
        return payRefCode;
    }

    public void setPayRefName(String payRefName) {
        this.payRefName = payRefName;
    }
    public String getPayRefName() {
        return payRefName;
    }

    public void setPayRefTime(String payRefTime) {
        this.payRefTime = payRefTime;
    }
    public String getPayRefTime() {
        return payRefTime;
    }

    public void setPrintTime(String printTime) {
        this.printTime = printTime;
    }
    public String getPrintTime() {
        return printTime;
    }

    public void setAgriType(String agriType) {
        this.agriType = agriType;
    }
    public String getAgriType() {
        return agriType;
    }

    public void setSubBusinessNature(String subBusinessNature) {
        this.subBusinessNature = subBusinessNature;
    }
    public String getSubBusinessNature() {
        return subBusinessNature;
    }

    public void setAgriNature(String agriNature) {
        this.agriNature = agriNature;
    }
    public String getAgriNature() {
        return agriNature;
    }

    public void setServiceProviders(String serviceProviders) {
        this.serviceProviders = serviceProviders;
    }
    public String getServiceProviders() {
        return serviceProviders;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
    public String getServiceType() {
        return serviceType;
    }

    public void setServices(String services) {
        this.services = services;
    }
    public String getServices() {
        return services;
    }

    public void setBillingWay(String billingWay) {
        this.billingWay = billingWay;
    }
    public String getBillingWay() {
        return billingWay;
    }

    public void setBusinessChannel(String businessChannel) {
        this.businessChannel = businessChannel;
    }
    public String getBusinessChannel() {
        return businessChannel;
    }

    public void setBusinessAgentType(String businessAgentType) {
        this.businessAgentType = businessAgentType;
    }
    public String getBusinessAgentType() {
        return businessAgentType;
    }

    public void setUniteAgentChannel(String uniteAgentChannel) {
        this.uniteAgentChannel = uniteAgentChannel;
    }
    public String getUniteAgentChannel() {
        return uniteAgentChannel;
    }

    public void setBusinessKind(String businessKind) {
        this.businessKind = businessKind;
    }
    public String getBusinessKind() {
        return businessKind;
    }

    public void setInvoiceMan(String invoiceMan) {
        this.invoiceMan = invoiceMan;
    }
    public String getInvoiceMan() {
        return invoiceMan;
    }

    public void setCardCName(String cardCName) {
        this.cardCName = cardCName;
    }
    public String getCardCName() {
        return cardCName;
    }

    public void setFormatPolicyCode(String formatPolicyCode) {
        this.formatPolicyCode = formatPolicyCode;
    }
    public String getFormatPolicyCode() {
        return formatPolicyCode;
    }

    public void setQuotationNo(String quotationNo) {
        this.quotationNo = quotationNo;
    }
    public String getQuotationNo() {
        return quotationNo;
    }

    public void setAdditionalFlag(String additionalFlag) {
        this.additionalFlag = additionalFlag;
    }
    public String getAdditionalFlag() {
        return additionalFlag;
    }

    public void setAgentOperateFlag(String agentOperateFlag) {
        this.agentOperateFlag = agentOperateFlag;
    }
    public String getAgentOperateFlag() {
        return agentOperateFlag;
    }

    public void setPrintStatus(String printStatus) {
        this.printStatus = printStatus;
    }
    public String getPrintStatus() {
        return printStatus;
    }

    public void setIfRemote(String ifRemote) {
        this.ifRemote = ifRemote;
    }
    public String getIfRemote() {
        return ifRemote;
    }

    public void setIfMedical(String ifMedical) {
        this.ifMedical = ifMedical;
    }
    public String getIfMedical() {
        return ifMedical;
    }

    public void setOperateTime(String operateTime) {
        this.operateTime = operateTime;
    }
    public String getOperateTime() {
        return operateTime;
    }

    public void setSaveTime(Date saveTime) {
        this.saveTime = saveTime;
    }
    public Date getSaveTime() {
        return saveTime;
    }

    public void setBusinatureNo(String businatureNo) {
        this.businatureNo = businatureNo;
    }
    public String getBusinatureNo() {
        return businatureNo;
    }

    public void setTeamCode(String teamCode) {
        this.teamCode = teamCode;
    }
    public String getTeamCode() {
        return teamCode;
    }

    public void setSysSource(String sysSource) {
        this.sysSource = sysSource;
    }
    public String getSysSource() {
        return sysSource;
    }

    public void setCiArmyFlag(String ciArmyFlag) {
        this.ciArmyFlag = ciArmyFlag;
    }
    public String getCiArmyFlag() {
        return ciArmyFlag;
    }

    public void setFeeRuleNo(String feeRuleNo) {
        this.feeRuleNo = feeRuleNo;
    }
    public String getFeeRuleNo() {
        return feeRuleNo;
    }

    public void setFeeRuleId(String feeRuleId) {
        this.feeRuleId = feeRuleId;
    }
    public String getFeeRuleId() {
        return feeRuleId;
    }

    public void setQuotationNum(String quotationNum) {
        this.quotationNum = quotationNum;
    }
    public String getQuotationNum() {
        return quotationNum;
    }

    public void setSumPremiumOrigin(int sumPremiumOrigin) {
        this.sumPremiumOrigin = sumPremiumOrigin;
    }
    public int getSumPremiumOrigin() {
        return sumPremiumOrigin;
    }

    public void setInsertTime(String insertTime) {
        this.insertTime = insertTime;
    }
    public String getInsertTime() {
        return insertTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
    public String getUpdateTime() {
        return updateTime;
    }

    public void setReportFlag(String reportFlag) {
        this.reportFlag = reportFlag;
    }
    public String getReportFlag() {
        return reportFlag;
    }

    public void setLastYearEndDate(String lastYearEndDate) {
        this.lastYearEndDate = lastYearEndDate;
    }
    public String getLastYearEndDate() {
        return lastYearEndDate;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }
    public String getBusinessType() {
        return businessType;
    }

    public void setUpperRuleId(String upperRuleId) {
        this.upperRuleId = upperRuleId;
    }
    public String getUpperRuleId() {
        return upperRuleId;
    }

    public void setUniqueNo(String uniqueNo) {
        this.uniqueNo = uniqueNo;
    }
    public String getUniqueNo() {
        return uniqueNo;
    }

    public void setAdditionalCostRate(double additionalCostRate) {
        this.additionalCostRate = additionalCostRate;
    }
    public double getAdditionalCostRate() {
        return additionalCostRate;
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

    public void setThirdBusinessFlag(String thirdBusinessFlag) {
        this.thirdBusinessFlag = thirdBusinessFlag;
    }
    public String getThirdBusinessFlag() {
        return thirdBusinessFlag;
    }

    public void setRecordCode(String recordCode) {
        this.recordCode = recordCode;
    }
    public String getRecordCode() {
        return recordCode;
    }

    public void setActivationNo(String activationNo) {
        this.activationNo = activationNo;
    }
    public String getActivationNo() {
        return activationNo;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedDate(long createdDate) {
        this.createdDate = createdDate;
    }
    public long getCreatedDate() {
        return createdDate;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedDate(long updatedDate) {
        this.updatedDate = updatedDate;
    }
    public long getUpdatedDate() {
        return updatedDate;
    }

    public void setEpolicyFlag(String epolicyFlag) {
        this.epolicyFlag = epolicyFlag;
    }
    public String getEpolicyFlag() {
        return epolicyFlag;
    }

    public void setEproposalFlag(String eproposalFlag) {
        this.eproposalFlag = eproposalFlag;
    }
    public String getEproposalFlag() {
        return eproposalFlag;
    }

    public void setAgentBusiness(String agentBusiness) {
        this.agentBusiness = agentBusiness;
    }
    public String getAgentBusiness() {
        return agentBusiness;
    }

    public void setAutoTransRenewFlag(String autoTransRenewFlag) {
        this.autoTransRenewFlag = autoTransRenewFlag;
    }
    public String getAutoTransRenewFlag() {
        return autoTransRenewFlag;
    }

    public void setJfeePayType(String jfeePayType) {
        this.jfeePayType = jfeePayType;
    }
    public String getJfeePayType() {
        return jfeePayType;
    }

    public void setPrePayRefTime(Date prePayRefTime) {
        this.prePayRefTime = prePayRefTime;
    }
    public Date getPrePayRefTime() {
        return prePayRefTime;
    }

    public void setIsDQZInOurCompany(String isDQZInOurCompany) {
        this.isDQZInOurCompany = isDQZInOurCompany;
    }
    public String getIsDQZInOurCompany() {
        return isDQZInOurCompany;
    }

    public void setIsArmyVehicle(String isArmyVehicle) {
        this.isArmyVehicle = isArmyVehicle;
    }
    public String getIsArmyVehicle() {
        return isArmyVehicle;
    }

    public void setIsInsuredDQZNow(String isInsuredDQZNow) {
        this.isInsuredDQZNow = isInsuredDQZNow;
    }
    public String getIsInsuredDQZNow() {
        return isInsuredDQZNow;
    }

    public void setRenewalFlag(String renewalFlag) {
        this.renewalFlag = renewalFlag;
    }
    public String getRenewalFlag() {
        return renewalFlag;
    }

    public void setShortRate(int shortRate) {
        this.shortRate = shortRate;
    }
    public int getShortRate() {
        return shortRate;
    }

    public void setSumBenchmarkPremium(double sumBenchmarkPremium) {
        this.sumBenchmarkPremium = sumBenchmarkPremium;
    }
    public double getSumBenchmarkPremium() {
        return sumBenchmarkPremium;
    }

    public void setTotalDisCount(double totalDisCount) {
        this.totalDisCount = totalDisCount;
    }
    public double getTotalDisCount() {
        return totalDisCount;
    }

    public void setDisRateModifyPower(String disRateModifyPower) {
        this.disRateModifyPower = disRateModifyPower;
    }
    public String getDisRateModifyPower() {
        return disRateModifyPower;
    }

    public void setDisRateTop(int disRateTop) {
        this.disRateTop = disRateTop;
    }
    public int getDisRateTop() {
        return disRateTop;
    }

    public void setDisRateModifyFlag(String disRateModifyFlag) {
        this.disRateModifyFlag = disRateModifyFlag;
    }
    public String getDisRateModifyFlag() {
        return disRateModifyFlag;
    }

    public void setShareHolderName(String shareHolderName) {
        this.shareHolderName = shareHolderName;
    }
    public String getShareHolderName() {
        return shareHolderName;
    }

    public void setCommissionMessageList(String commissionMessageList) {
        this.commissionMessageList = commissionMessageList;
    }
    public String getCommissionMessageList() {
        return commissionMessageList;
    }

    public void setCombo(String combo) {
        this.combo = combo;
    }
    public String getCombo() {
        return combo;
    }

    public void setComboName(String comboName) {
        this.comboName = comboName;
    }
    public String getComboName() {
        return comboName;
    }

    public void setLocalTaxFlag(String localTaxFlag) {
        this.localTaxFlag = localTaxFlag;
    }
    public String getLocalTaxFlag() {
        return localTaxFlag;
    }

    public void setSelectedUndwrtProfit(String selectedUndwrtProfit) {
        this.selectedUndwrtProfit = selectedUndwrtProfit;
    }
    public String getSelectedUndwrtProfit() {
        return selectedUndwrtProfit;
    }

    public void setInputPricedProfit(String inputPricedProfit) {
        this.inputPricedProfit = inputPricedProfit;
    }
    public String getInputPricedProfit() {
        return inputPricedProfit;
    }

    public void setFactorMultiplyPricedProfit(int factorMultiplyPricedProfit) {
        this.factorMultiplyPricedProfit = factorMultiplyPricedProfit;
    }
    public int getFactorMultiplyPricedProfit() {
        return factorMultiplyPricedProfit;
    }

    public void setStandardPricedProfit(int standardPricedProfit) {
        this.standardPricedProfit = standardPricedProfit;
    }
    public int getStandardPricedProfit() {
        return standardPricedProfit;
    }

    public void setProcessedPricedProfit(int processedPricedProfit) {
        this.processedPricedProfit = processedPricedProfit;
    }
    public int getProcessedPricedProfit() {
        return processedPricedProfit;
    }

    public void setRealPricedProfit(int realPricedProfit) {
        this.realPricedProfit = realPricedProfit;
    }
    public int getRealPricedProfit() {
        return realPricedProfit;
    }

    public void setProfitRemark(String profitRemark) {
        this.profitRemark = profitRemark;
    }
    public String getProfitRemark() {
        return profitRemark;
    }

    public void setProfitC03FeeRuleId(String profitC03FeeRuleId) {
        this.profitC03FeeRuleId = profitC03FeeRuleId;
    }
    public String getProfitC03FeeRuleId() {
        return profitC03FeeRuleId;
    }

    public void setProfitC03FeeRuleNo(String profitC03FeeRuleNo) {
        this.profitC03FeeRuleNo = profitC03FeeRuleNo;
    }
    public String getProfitC03FeeRuleNo() {
        return profitC03FeeRuleNo;
    }

    public void setUndwrtProfitList(List<String> undwrtProfitList) {
        this.undwrtProfitList = undwrtProfitList;
    }
    public List<String> getUndwrtProfitList() {
        return undwrtProfitList;
    }

    public void setUndwrtProfitC03Valid(boolean undwrtProfitC03Valid) {
        this.undwrtProfitC03Valid = undwrtProfitC03Valid;
    }
    public boolean getUndwrtProfitC03Valid() {
        return undwrtProfitC03Valid;
    }

    public void setUndwrtProfitC03ValidAndArrowFactorSerialNo(boolean undwrtProfitC03ValidAndArrowFactorSerialNo) {
        this.undwrtProfitC03ValidAndArrowFactorSerialNo = undwrtProfitC03ValidAndArrowFactorSerialNo;
    }
    public boolean getUndwrtProfitC03ValidAndArrowFactorSerialNo() {
        return undwrtProfitC03ValidAndArrowFactorSerialNo;
    }

    public void setQuoteType(String quoteType) {
        this.quoteType = quoteType;
    }
    public String getQuoteType() {
        return quoteType;
    }

    public void setRelatedFlag(String relatedFlag) {
        this.relatedFlag = relatedFlag;
    }
    public String getRelatedFlag() {
        return relatedFlag;
    }

    public void setSalesExpenseRate(String salesExpenseRate) {
        this.salesExpenseRate = salesExpenseRate;
    }
    public String getSalesExpenseRate() {
        return salesExpenseRate;
    }

    public void setGuangBoCertiNo(String guangBoCertiNo) {
        this.guangBoCertiNo = guangBoCertiNo;
    }
    public String getGuangBoCertiNo() {
        return guangBoCertiNo;
    }

    public void setCommissionFlag(String commissionFlag) {
        this.commissionFlag = commissionFlag;
    }
    public String getCommissionFlag() {
        return commissionFlag;
    }

    public void setUseGbPricedProfitFlag(String useGbPricedProfitFlag) {
        this.useGbPricedProfitFlag = useGbPricedProfitFlag;
    }
    public String getUseGbPricedProfitFlag() {
        return useGbPricedProfitFlag;
    }

    public void setLsiCombo(String lsiCombo) {
        this.lsiCombo = lsiCombo;
    }
    public String getLsiCombo() {
        return lsiCombo;
    }

    public void setLsiComboName(String lsiComboName) {
        this.lsiComboName = lsiComboName;
    }
    public String getLsiComboName() {
        return lsiComboName;
    }

    public void setLoanPeriod(String loanPeriod) {
        this.loanPeriod = loanPeriod;
    }
    public String getLoanPeriod() {
        return loanPeriod;
    }

    public void setBeneficiaryClause(String beneficiaryClause) {
        this.beneficiaryClause = beneficiaryClause;
    }
    public String getBeneficiaryClause() {
        return beneficiaryClause;
    }

    public void setEinsuranceCardFlag(String einsuranceCardFlag) {
        this.einsuranceCardFlag = einsuranceCardFlag;
    }
    public String getEinsuranceCardFlag() {
        return einsuranceCardFlag;
    }

    public void setAllPremium(String allPremium) {
        this.allPremium = allPremium;
    }
    public String getAllPremium() {
        return allPremium;
    }

}
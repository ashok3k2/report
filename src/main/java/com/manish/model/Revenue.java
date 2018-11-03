package com.manish.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by ashok.maurya on 03/11/18.
 */
@Entity
@Table(name = "revenue")
public class Revenue {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, insertable = false)
    private Long id;

    @Column(name = "ProfitCenterLvl3")
    private String profitCenterLvl3;

    @Column(name = "ProfitCenterLvl5")
    private String profitCenterLvl5;

    @Column(name = "BusinessGroupName")
    private String businessGroupName;

    @Column(name = "GlobalBusinessUnitName")
    private String globalBusinessUnitName;

    @Column(name = "DealID")
    private String dealID;

    @Column(name = "SellOutFYMonth")
    private String sellOutFYMonth;

    @Column(name = "SellInFYMonth")
    private String sellInFYMonth;

    @Column(name = "GrossRevenueUSD")
    private Double grossRevenueUSD;

    @Column(name = "NDPRevenueUSD")
    private Double ndpRevenueUSD;

    @Column(name = "NetRevenueUSD")
    private Double netRevenueUSD;

    @Column(name = "GrossMarginUSD")
    private Double grossMarginUSD;

    @Column(name = "TopValue")
    private String topValue;

    @Column(name = "TransactionTypeCode")
    private String transactionTypeCode;

    @Column(name = "DealNonDeal")
    private String dealNonDeal;

    @Column(name = "NDPBucket")
    private String ndpBucket;

    @Column(name = "QuoteBucket")
    private String quoteBucket;

    @Column(name = "Program")
    private String program;

    @Column(name = "MCCD")
    private String mccd;

    @Column(name = "SQDerived")
    private String sqDerived;

    @Column(name = "SQPBIdentifier")
    private String sqpbIdentifier;

    @Column(name = "SECURITYKEY")
    private String securityKey;

    @Column(name = "[Transaction Flag]")
    private String transactionFlag;

    @Column(name = "RTM")
    private String rtm;

    @Column(name = "ClaimPartnerName")
    private String claimPartnerName;

    @Column(name = "ClaimPartnerId")
    private String claimPartnerId;

    @Column(name = "[Pricing Type]")
    private String pricingType;

    @Column(name = "[Quote Category]")
    private String quoteCategory;

    @Column(name = "[Quote Type]")
    private String quoteType;

    @Column(name = "[Source System]")
    private String sourceSystem;

    @Column(name = "BMI_Pricing_Mechanism")
    private String bmiPricingMechanism;

    @Column(name = "region")
    private String region;

    @Column(name = "Subregion")
    private String subRegion;

    @Column(name = "ClaimStatus")
    private String claimStatus;

    @Column(name = "CDW_Flag")
    private String cdwFlag;

    @Column(name = "CTO_Flag")
    private String croFlag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProfitCenterLvl3() {
        return profitCenterLvl3;
    }

    public void setProfitCenterLvl3(String profitCenterLvl3) {
        this.profitCenterLvl3 = profitCenterLvl3;
    }

    public String getProfitCenterLvl5() {
        return profitCenterLvl5;
    }

    public void setProfitCenterLvl5(String profitCenterLvl5) {
        this.profitCenterLvl5 = profitCenterLvl5;
    }

    public String getBusinessGroupName() {
        return businessGroupName;
    }

    public void setBusinessGroupName(String businessGroupName) {
        this.businessGroupName = businessGroupName;
    }

    public String getGlobalBusinessUnitName() {
        return globalBusinessUnitName;
    }

    public void setGlobalBusinessUnitName(String globalBusinessUnitName) {
        this.globalBusinessUnitName = globalBusinessUnitName;
    }

    public String getDealID() {
        return dealID;
    }

    public void setDealID(String dealID) {
        this.dealID = dealID;
    }

    public String getSellOutFYMonth() {
        return sellOutFYMonth;
    }

    public void setSellOutFYMonth(String sellOutFYMonth) {
        this.sellOutFYMonth = sellOutFYMonth;
    }

    public String getSellInFYMonth() {
        return sellInFYMonth;
    }

    public void setSellInFYMonth(String sellInFYMonth) {
        this.sellInFYMonth = sellInFYMonth;
    }

    public Double getGrossRevenueUSD() {
        return grossRevenueUSD;
    }

    public void setGrossRevenueUSD(Double grossRevenueUSD) {
        this.grossRevenueUSD = grossRevenueUSD;
    }

    public Double getNdpRevenueUSD() {
        return ndpRevenueUSD;
    }

    public void setNdpRevenueUSD(Double ndpRevenueUSD) {
        this.ndpRevenueUSD = ndpRevenueUSD;
    }

    public Double getNetRevenueUSD() {
        return netRevenueUSD;
    }

    public void setNetRevenueUSD(Double netRevenueUSD) {
        this.netRevenueUSD = netRevenueUSD;
    }

    public Double getGrossMarginUSD() {
        return grossMarginUSD;
    }

    public void setGrossMarginUSD(Double grossMarginUSD) {
        this.grossMarginUSD = grossMarginUSD;
    }

    public String getTopValue() {
        return topValue;
    }

    public void setTopValue(String topValue) {
        this.topValue = topValue;
    }

    public String getTransactionTypeCode() {
        return transactionTypeCode;
    }

    public void setTransactionTypeCode(String transactionTypeCode) {
        this.transactionTypeCode = transactionTypeCode;
    }

    public String getDealNonDeal() {
        return dealNonDeal;
    }

    public void setDealNonDeal(String dealNonDeal) {
        this.dealNonDeal = dealNonDeal;
    }

    public String getNdpBucket() {
        return ndpBucket;
    }

    public void setNdpBucket(String ndpBucket) {
        this.ndpBucket = ndpBucket;
    }

    public String getQuoteBucket() {
        return quoteBucket;
    }

    public void setQuoteBucket(String quoteBucket) {
        this.quoteBucket = quoteBucket;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getMccd() {
        return mccd;
    }

    public void setMccd(String mccd) {
        this.mccd = mccd;
    }

    public String getSqDerived() {
        return sqDerived;
    }

    public void setSqDerived(String sqDerived) {
        this.sqDerived = sqDerived;
    }

    public String getSqpbIdentifier() {
        return sqpbIdentifier;
    }

    public void setSqpbIdentifier(String sqpbIdentifier) {
        this.sqpbIdentifier = sqpbIdentifier;
    }

    public String getSecurityKey() {
        return securityKey;
    }

    public void setSecurityKey(String securityKey) {
        this.securityKey = securityKey;
    }

    public String getTransactionFlag() {
        return transactionFlag;
    }

    public void setTransactionFlag(String transactionFlag) {
        this.transactionFlag = transactionFlag;
    }

    public String getRtm() {
        return rtm;
    }

    public void setRtm(String rtm) {
        this.rtm = rtm;
    }

    public String getClaimPartnerName() {
        return claimPartnerName;
    }

    public void setClaimPartnerName(String claimPartnerName) {
        this.claimPartnerName = claimPartnerName;
    }

    public String getClaimPartnerId() {
        return claimPartnerId;
    }

    public void setClaimPartnerId(String claimPartnerId) {
        this.claimPartnerId = claimPartnerId;
    }

    public String getPricingType() {
        return pricingType;
    }

    public void setPricingType(String pricingType) {
        this.pricingType = pricingType;
    }

    public String getQuoteCategory() {
        return quoteCategory;
    }

    public void setQuoteCategory(String quoteCategory) {
        this.quoteCategory = quoteCategory;
    }

    public String getQuoteType() {
        return quoteType;
    }

    public void setQuoteType(String quoteType) {
        this.quoteType = quoteType;
    }

    public String getSourceSystem() {
        return sourceSystem;
    }

    public void setSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
    }

    public String getBmiPricingMechanism() {
        return bmiPricingMechanism;
    }

    public void setBmiPricingMechanism(String bmiPricingMechanism) {
        this.bmiPricingMechanism = bmiPricingMechanism;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSubRegion() {
        return subRegion;
    }

    public void setSubRegion(String subRegion) {
        this.subRegion = subRegion;
    }

    public String getClaimStatus() {
        return claimStatus;
    }

    public void setClaimStatus(String claimStatus) {
        this.claimStatus = claimStatus;
    }

    public String getCdwFlag() {
        return cdwFlag;
    }

    public void setCdwFlag(String cdwFlag) {
        this.cdwFlag = cdwFlag;
    }

    public String getCroFlag() {
        return croFlag;
    }

    public void setCroFlag(String croFlag) {
        this.croFlag = croFlag;
    }
}

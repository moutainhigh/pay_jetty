package com.ibs.core.module.customer.domain;

import java.util.Date;

import com.ibs.portal.framework.server.domain.BaseEntity;

public class CustBankAcnt extends BaseEntity {

    private static final long serialVersionUID = 8855323737639293788L;

    private String id; // ID
    private String bankAcntCode; // BANK_ACNT_CODE
    private String custCode; // CUST_CODE
    private String country; // COUNTRY
    private String provience; // PROVIENCE
    private String city; // CITY
    private String custName; // CUST_NAME
    private String certType; // CERT_TYPE
    private String certNum; // CERT_NUM
    private String isDefault; // IS_DEFAULT
    private String bankName; // BANK_NAME
    private String bankCode; // BANK_CODE
    private String bankBranchName; // BANK_BRANCH_NAME
    private String bankBranchCode; // BANK_BRANCH_CODE
    private String bankCardNum; // BANK_CARD_NUM
    private String status; // STATUS
    private String currency; // CURRENCY
    private String acntType; // ACNT_TYPE
    private String creator; // CREATOR
    private Date createTime; // CREATE_TIME
    private String updator; // UPDATOR
    private Date updateTime; // UPDATE_TIME
    private String isValid; // IS_VALID

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBankAcntCode() {
        return bankAcntCode;
    }

    public void setBankAcntCode(String bankAcntCode) {
        this.bankAcntCode = bankAcntCode;
    }

    public String getCustCode() {
        return custCode;
    }

    public void setCustCode(String custCode) {
        this.custCode = custCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvience() {
        return provience;
    }

    public void setProvience(String provience) {
        this.provience = provience;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    public String getCertNum() {
        return certNum;
    }

    public void setCertNum(String certNum) {
        this.certNum = certNum;
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankBranchName() {
        return bankBranchName;
    }

    public void setBankBranchName(String bankBranchName) {
        this.bankBranchName = bankBranchName;
    }

    public String getBankBranchCode() {
        return bankBranchCode;
    }

    public void setBankBranchCode(String bankBranchCode) {
        this.bankBranchCode = bankBranchCode;
    }

    public String getBankCardNum() {
        return bankCardNum;
    }

    public void setBankCardNum(String bankCardNum) {
        this.bankCardNum = bankCardNum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAcntType() {
        return acntType;
    }

    public void setAcntType(String acntType) {
        this.acntType = acntType;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }

    @Override
    public String toString() {
        return "CustBankAcnt [id=" + id + ", bankAcntCode=" + bankAcntCode + ", custCode=" + custCode + ", country="
                + country + ", provience=" + provience + ", city=" + city + ", custName=" + custName + ", certType="
                + certType + ", certNum=" + certNum + ", isDefault=" + isDefault + ", bankName=" + bankName
                + ", bankCode=" + bankCode + ", bankBranchName=" + bankBranchName + ", bankBranchCode=" + bankBranchCode
                + ", bankCardNum=" + bankCardNum + ", status=" + status + ", currency=" + currency + ", acntType="
                + acntType + ", creator=" + creator + ", createTime=" + createTime + ", updator=" + updator
                + ", updateTime=" + updateTime + ", isValid=" + isValid + "]";
    }

}

package com.spider.bean.lianjia;

import java.util.Date;

/**
 * 房屋交易
 *
 * @author chenzhongwei
 * @create 2017-04-01 11:20
 **/
public class ApartmentTransactionInfo {

    private Integer id;
    private String apartmentId; //房屋id
    private Date onLineDate; //挂牌时间
    private String transactionOwnership;//交易权属 例:商品房
    private Date preTransactionDate;//上次交易时间
    private String apartmentApplication;//房屋用途 例:普通住宅
    private String apartmentYears;//房屋年限 例:满五年
    private String propertyOwnership;//产权所属 例:非共有
    private String mortgage;//抵押信息 例:无抵押
    private String propertyOwnershipCertificate; //房本备件 例:已上传房本照片

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(String apartmentId) {
        this.apartmentId = apartmentId;
    }

    public Date getOnLineDate() {
        return onLineDate;
    }

    public void setOnLineDate(Date onLineDate) {
        this.onLineDate = onLineDate;
    }

    public String getTransactionOwnership() {
        return transactionOwnership;
    }

    public void setTransactionOwnership(String transactionOwnership) {
        this.transactionOwnership = transactionOwnership;
    }

    public Date getPreTransactionDate() {
        return preTransactionDate;
    }

    public void setPreTransactionDate(Date preTransactionDate) {
        this.preTransactionDate = preTransactionDate;
    }

    public String getApartmentApplication() {
        return apartmentApplication;
    }

    public void setApartmentApplication(String apartmentApplication) {
        this.apartmentApplication = apartmentApplication;
    }

    public String getApartmentYears() {
        return apartmentYears;
    }

    public void setApartmentYears(String apartmentYears) {
        this.apartmentYears = apartmentYears;
    }

    public String getPropertyOwnership() {
        return propertyOwnership;
    }

    public void setPropertyOwnership(String propertyOwnership) {
        this.propertyOwnership = propertyOwnership;
    }

    public String getMortgage() {
        return mortgage;
    }

    public void setMortgage(String mortgage) {
        this.mortgage = mortgage;
    }

    public String getPropertyOwnershipCertificate() {
        return propertyOwnershipCertificate;
    }

    public void setPropertyOwnershipCertificate(String propertyOwnershipCertificate) {
        this.propertyOwnershipCertificate = propertyOwnershipCertificate;
    }

    @Override
    public String toString() {
        return "ApartmentTransactionInfo{" +
                "id=" + id +
                ", apartmentId='" + apartmentId + '\'' +
                ", onLineDate=" + onLineDate +
                ", transactionOwnership='" + transactionOwnership + '\'' +
                ", preTransactionDate=" + preTransactionDate +
                ", apartmentApplication='" + apartmentApplication + '\'' +
                ", apartmentYears='" + apartmentYears + '\'' +
                ", propertyOwnership='" + propertyOwnership + '\'' +
                ", mortgage='" + mortgage + '\'' +
                ", propertyOwnershipCertificate='" + propertyOwnershipCertificate + '\'' +
                '}';
    }
}
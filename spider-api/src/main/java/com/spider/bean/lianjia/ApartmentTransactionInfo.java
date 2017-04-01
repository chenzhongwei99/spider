package com.spider.bean.lianjia;

import java.util.Date;

/**
 * ���ݽ���
 *
 * @author chenzhongwei
 * @create 2017-04-01 11:20
 **/
public class ApartmentTransactionInfo {

    private Integer id;
    private String apartmentId; //����id
    private Date onLineDate; //����ʱ��
    private String transactionOwnership;//����Ȩ�� ��:��Ʒ��
    private Date preTransactionDate;//�ϴν���ʱ��
    private String apartmentApplication;//������; ��:��ͨסլ
    private String apartmentYears;//�������� ��:������
    private String propertyOwnership;//��Ȩ���� ��:�ǹ���
    private String mortgage;//��Ѻ��Ϣ ��:�޵�Ѻ
    private String propertyOwnershipCertificate; //�������� ��:���ϴ�������Ƭ

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
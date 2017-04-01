package com.spider.bean.lianjia;

/**
 * ���ݻ�����Ϣ
 *
 * @author chenzhongwei
 * @create 2017-03-30 17:03
 **/
public class ApartmentInfo {

    private Integer id;
    private String apartmentId; //����id
    private String apartmentName; //С������
    private String apartmentBuildArea;//���ݽ������
    private String unitPrice; //���� ��:10000/ƽ
    private String totalPrice; //�ܼ�
    private String apartmentType;//�������� ��:��������
    private String apartmentDirection;//���ݳ���
    private String imageUrl; //����ͼƬ
    private String subwayLine; //������
    private String subwayStation;//վ
    private String districtName;//�� ��:������
    private String positionName;//����λ�� ��:������

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

    public String getApartmentName() {
        return apartmentName;
    }

    public void setApartmentName(String apartmentName) {
        this.apartmentName = apartmentName;
    }

    public String getApartmentBuildArea() {
        return apartmentBuildArea;
    }

    public void setApartmentBuildArea(String apartmentBuildArea) {
        this.apartmentBuildArea = apartmentBuildArea;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getApartmentType() {
        return apartmentType;
    }

    public void setApartmentType(String apartmentType) {
        this.apartmentType = apartmentType;
    }

    public String getApartmentDirection() {
        return apartmentDirection;
    }

    public void setApartmentDirection(String apartmentDirection) {
        this.apartmentDirection = apartmentDirection;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getSubwayLine() {
        return subwayLine;
    }

    public void setSubwayLine(String subwayLine) {
        this.subwayLine = subwayLine;
    }

    public String getSubwayStation() {
        return subwayStation;
    }

    public void setSubwayStation(String subwayStation) {
        this.subwayStation = subwayStation;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    @Override
    public String toString() {
        return "ApartmentInfo{" +
                "id=" + id +
                ", apartmentId='" + apartmentId + '\'' +
                ", apartmentName='" + apartmentName + '\'' +
                ", apartmentBuildArea='" + apartmentBuildArea + '\'' +
                ", unitPrice='" + unitPrice + '\'' +
                ", totalPrice='" + totalPrice + '\'' +
                ", apartmentType='" + apartmentType + '\'' +
                ", apartmentDirection='" + apartmentDirection + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", subwayLine='" + subwayLine + '\'' +
                ", subwayStation='" + subwayStation + '\'' +
                ", districtName='" + districtName + '\'' +
                ", positionName='" + positionName + '\'' +
                '}';
    }
}
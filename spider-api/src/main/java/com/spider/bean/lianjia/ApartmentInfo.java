package com.spider.bean.lianjia;

/**
 * 房屋基本信息
 *
 * @author chenzhongwei
 * @create 2017-03-30 17:03
 **/
public class ApartmentInfo {

    private Integer id;
    private String apartmentId; //房屋id
    private String apartmentName; //小区名称
    private String apartmentBuildArea;//房屋建筑面积
    private String unitPrice; //均价 例:10000/平
    private String totalPrice; //总价
    private String apartmentType;//房屋类型 例:三室两厅
    private String apartmentDirection;//房屋朝向
    private String imageUrl; //房屋图片
    private String subwayLine; //地铁线
    private String subwayStation;//站

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
                '}';
    }
}
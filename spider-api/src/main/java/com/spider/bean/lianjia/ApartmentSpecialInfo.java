package com.spider.bean.lianjia;

/**
 * 房源特色
 *
 * @author chenzhongwei
 * @create 2017-04-01 13:36
 **/
public class ApartmentSpecialInfo {

    private Integer id;
    private String apartmentId; //房屋id
    private String apartmentTags;//房源标签 例:近地铁
    private String apartmentSellingPoint;//卖点
    private String traffic;//交通

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

    public String getApartmentTags() {
        return apartmentTags;
    }

    public void setApartmentTags(String apartmentTags) {
        this.apartmentTags = apartmentTags;
    }

    public String getApartmentSellingPoint() {
        return apartmentSellingPoint;
    }

    public void setApartmentSellingPoint(String apartmentSellingPoint) {
        this.apartmentSellingPoint = apartmentSellingPoint;
    }

    public String getTraffic() {
        return traffic;
    }

    public void setTraffic(String traffic) {
        this.traffic = traffic;
    }

    @Override
    public String toString() {
        return "ApartmentSpecialInfo{" +
                "id=" + id +
                ", apartmentId='" + apartmentId + '\'' +
                ", apartmentTags='" + apartmentTags + '\'' +
                ", apartmentSellingPoint='" + apartmentSellingPoint + '\'' +
                ", traffic='" + traffic + '\'' +
                '}';
    }
}
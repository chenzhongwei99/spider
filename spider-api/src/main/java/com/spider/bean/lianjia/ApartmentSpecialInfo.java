package com.spider.bean.lianjia;

/**
 * ��Դ��ɫ
 *
 * @author chenzhongwei
 * @create 2017-04-01 13:36
 **/
public class ApartmentSpecialInfo {

    private Integer id;
    private String apartmentId; //����id
    private String apartmentTags;//��Դ��ǩ ��:������
    private String apartmentSellingPoint;//����
    private String traffic;//��ͨ

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
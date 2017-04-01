package com.spider.bean.lianjia;

import java.util.List;

/**
 * ���ݻ�����Ϣ
 *
 * @author chenzhongwei
 * @create 2017-04-01 10:38
 **/
public class ApartmentBaseInfo {

    private Integer id;
    private String apartmentId; //����id
    private String apartmentType;//�������� ��:��������
    private String apartmentFloor;//����¥��
    private String apartmentBuildArea;//���ݽ������
    private String apartmentStructure;//���ͽṹ
    private String apartmentUseArea; //ʹ�����
    private String buildingType; //�������� ��:�������
    private String apartmentDirection;//���ݳ���
    private String buildingStructure;//�����ṹ ��:�ֻ�ṹ
    private String decorationType; //װ������ ��:��װ
    private String elevatorType; //�������� ��:��������
    private boolean haveElevator; //�Ƿ��е���
    private Integer propertyYears; //��Ȩ����
    private List<String> imageList; //����ͼƬ

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

    public String getApartmentType() {
        return apartmentType;
    }

    public void setApartmentType(String apartmentType) {
        this.apartmentType = apartmentType;
    }

    public String getApartmentFloor() {
        return apartmentFloor;
    }

    public void setApartmentFloor(String apartmentFloor) {
        this.apartmentFloor = apartmentFloor;
    }

    public String getApartmentBuildArea() {
        return apartmentBuildArea;
    }

    public void setApartmentBuildArea(String apartmentBuildArea) {
        this.apartmentBuildArea = apartmentBuildArea;
    }

    public String getApartmentStructure() {
        return apartmentStructure;
    }

    public void setApartmentStructure(String apartmentStructure) {
        this.apartmentStructure = apartmentStructure;
    }

    public String getApartmentUseArea() {
        return apartmentUseArea;
    }

    public void setApartmentUseArea(String apartmentUseArea) {
        this.apartmentUseArea = apartmentUseArea;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }

    public String getApartmentDirection() {
        return apartmentDirection;
    }

    public void setApartmentDirection(String apartmentDirection) {
        this.apartmentDirection = apartmentDirection;
    }

    public String getBuildingStructure() {
        return buildingStructure;
    }

    public void setBuildingStructure(String buildingStructure) {
        this.buildingStructure = buildingStructure;
    }

    public String getDecorationType() {
        return decorationType;
    }

    public void setDecorationType(String decorationType) {
        this.decorationType = decorationType;
    }

    public String getElevatorType() {
        return elevatorType;
    }

    public void setElevatorType(String elevatorType) {
        this.elevatorType = elevatorType;
    }

    public boolean isHaveElevator() {
        return haveElevator;
    }

    public void setHaveElevator(boolean haveElevator) {
        this.haveElevator = haveElevator;
    }

    public Integer getPropertyYears() {
        return propertyYears;
    }

    public void setPropertyYears(Integer propertyYears) {
        this.propertyYears = propertyYears;
    }

    public List<String> getImageList() {
        return imageList;
    }

    public void setImageList(List<String> imageList) {
        this.imageList = imageList;
    }

    @Override
    public String toString() {
        return "ApartmentBaseInfo{" +
                "id=" + id +
                ", apartmentId='" + apartmentId + '\'' +
                ", apartmentType='" + apartmentType + '\'' +
                ", apartmentFloor='" + apartmentFloor + '\'' +
                ", apartmentBuildArea='" + apartmentBuildArea + '\'' +
                ", apartmentStructure='" + apartmentStructure + '\'' +
                ", apartmentUseArea='" + apartmentUseArea + '\'' +
                ", buildingType='" + buildingType + '\'' +
                ", apartmentDirection='" + apartmentDirection + '\'' +
                ", buildingStructure='" + buildingStructure + '\'' +
                ", decorationType='" + decorationType + '\'' +
                ", elevatorType='" + elevatorType + '\'' +
                ", haveElevator=" + haveElevator +
                ", propertyYears=" + propertyYears +
                ", imageList=" + imageList +
                '}';
    }
}
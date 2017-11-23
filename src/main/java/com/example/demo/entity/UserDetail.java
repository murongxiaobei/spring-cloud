package com.example.demo.entity;

import javax.persistence.*;
import java.util.Date;
@Entity
public class UserDetail {

    @Id
    private Integer userId;

    private String sex;


    private Integer age;


    private Date birthday;


    private String tag;


    private String hometown;


    private String nativePlace;


    private String birthPlace;


    private String workPlace;


    private String height;


    private String weight;


    private String degree;


    private String isChildren;


    private String homeRank;

    private String smoke;

    private String drink;


    private String faith;


    private String maritalStatus;


    private String nationality;


    private String industry;


    private String earning;


    private Date etrDate;


    private String introduce;


    public UserDetail(Integer userId, String sex, Integer age, Date birthday, String tag, String hometown, String nativePlace, String birthPlace, String workPlace, String height, String weight, String degree, String isChildren, String homeRank, String smoke, String drink, String faith, String maritalStatus, String nationality, String industry, String earning, Date etrDate, String introduce) {
        this.userId = userId;
        this.sex = sex;
        this.age = age;
        this.birthday = birthday;
        this.tag = tag;
        this.hometown = hometown;
        this.nativePlace = nativePlace;
        this.birthPlace = birthPlace;
        this.workPlace = workPlace;
        this.height = height;
        this.weight = weight;
        this.degree = degree;
        this.isChildren = isChildren;
        this.homeRank = homeRank;
        this.smoke = smoke;
        this.drink = drink;
        this.faith = faith;
        this.maritalStatus = maritalStatus;
        this.nationality = nationality;
        this.industry = industry;
        this.earning = earning;
        this.etrDate = etrDate;
        this.introduce = introduce;
    }

    public UserDetail() {
        super();
    }


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getSex() {
        return sex;
    }


    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }


    public Integer getAge() {
        return age;
    }


    public void setAge(Integer age) {
        this.age = age;
    }


    public Date getBirthday() {
        return birthday;
    }


    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }


    public String getTag() {
        return tag;
    }


    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }


    public String getHometown() {
        return hometown;
    }


    public void setHometown(String hometown) {
        this.hometown = hometown == null ? null : hometown.trim();
    }

    public String getNativePlace() {
        return nativePlace;
    }


    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace == null ? null : nativePlace.trim();
    }


    public String getBirthPlace() {
        return birthPlace;
    }


    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace == null ? null : birthPlace.trim();
    }

    public String getWorkPlace() {
        return workPlace;
    }


    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace == null ? null : workPlace.trim();
    }


    public String getHeight() {
        return height;
    }


    public void setHeight(String height) {
        this.height = height == null ? null : height.trim();
    }


    public String getWeight() {
        return weight;
    }


    public void setWeight(String weight) {
        this.weight = weight == null ? null : weight.trim();
    }

    public String getDegree() {
        return degree;
    }


    public void setDegree(String degree) {
        this.degree = degree == null ? null : degree.trim();
    }


    public String getIsChildren() {
        return isChildren;
    }


    public void setIsChildren(String isChildren) {
        this.isChildren = isChildren == null ? null : isChildren.trim();
    }


    public String getHomeRank() {
        return homeRank;
    }


    public void setHomeRank(String homeRank) {
        this.homeRank = homeRank == null ? null : homeRank.trim();
    }


    public String getSmoke() {
        return smoke;
    }


    public void setSmoke(String smoke) {
        this.smoke = smoke == null ? null : smoke.trim();
    }


    public String getDrink() {
        return drink;
    }


    public void setDrink(String drink) {
        this.drink = drink == null ? null : drink.trim();
    }


    public String getFaith() {
        return faith;
    }


    public void setFaith(String faith) {
        this.faith = faith == null ? null : faith.trim();
    }


    public String getMaritalStatus() {
        return maritalStatus;
    }


    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus == null ? null : maritalStatus.trim();
    }


    public String getNationality() {
        return nationality;
    }


    public void setNationality(String nationality) {
        this.nationality = nationality == null ? null : nationality.trim();
    }


    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry == null ? null : industry.trim();
    }


    public String getEarning() {
        return earning;
    }


    public void setEarning(String earning) {
        this.earning = earning == null ? null : earning.trim();
    }


    public Date getEtrDate() {
        return etrDate;
    }


    public void setEtrDate(Date etrDate) {
        this.etrDate = etrDate;
    }


    public String getIntroduce() {
        return introduce;
    }


    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }
}
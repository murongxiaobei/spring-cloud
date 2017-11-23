package com.example.demo.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class User{

    @Id
    @GeneratedValue
    private Integer userId;


    private String userName;


    private String userPwd;


    private String phone;


    private String userStatus;


    private String isUse;


    private String etrId;


    private Date etrDate;


    private String mdfId;


    private Date mdfDate;


    public User(Integer userId, String userName, String userPwd, String phone, String userStatus, String isUse, String etrId, Date etrDate, String mdfId, Date mdfDate) {
        this.userId = userId;
        this.userName = userName;
        this.userPwd = userPwd;
        this.phone = phone;
        this.userStatus = userStatus;
        this.isUse = isUse;
        this.etrId = etrId;
        this.etrDate = etrDate;
        this.mdfId = mdfId;
        this.mdfDate = mdfDate;
    }


    public User() {
        super();
    }


    public Integer getUserId() {
        return userId;
    }


    public void setUserId(Integer userId) {
        this.userId = userId;
    }


    public String getUserName() {
        return userName;
    }


    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }


    public String getUserPwd() {
        return userPwd;
    }


    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }


    public String getPhone() {
        return phone;
    }


    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }


    public String getUserStatus() {
        return userStatus;
    }


    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus == null ? null : userStatus.trim();
    }


    public String getIsUse() {
        return isUse;
    }


    public void setIsUse(String isUse) {
        this.isUse = isUse == null ? null : isUse.trim();
    }


    public String getEtrId() {
        return etrId;
    }


    public void setEtrId(String etrId) {
        this.etrId = etrId == null ? null : etrId.trim();
    }


    public Date getEtrDate() {
        return etrDate;
    }


    public void setEtrDate(Date etrDate) {
        this.etrDate = etrDate;
    }


    public String getMdfId() {
        return mdfId;
    }


    public void setMdfId(String mdfId) {
        this.mdfId = mdfId == null ? null : mdfId.trim();
    }


    public Date getMdfDate() {
        return mdfDate;
    }


    public void setMdfDate(Date mdfDate) {
        this.mdfDate = mdfDate;
    }


}
package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
@Entity
public class UserImg {
    @Id
    @GeneratedValue
    private Integer id;

    private Integer userId;


    private String imgName;


    private Integer serNum;


    private Date createTime;

    private String isHeadPic;


    private byte[] img;


    public UserImg(Integer userId, String imgName, Integer serNum, Date createTime, String isHeadPic, byte[] img) {
        this.userId = userId;
        this.imgName = imgName;
        this.serNum = serNum;
        this.createTime = createTime;
        this.isHeadPic = isHeadPic;
        this.img = img;
    }

    public UserImg() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }


    public void setUserId(Integer userId) {
        this.userId = userId;
    }


    public String getImgName() {
        return imgName;
    }


    public void setImgName(String imgName) {
        this.imgName = imgName == null ? null : imgName.trim();
    }


    public Integer getSerNum() {
        return serNum;
    }


    public void setSerNum(Integer serNum) {
        this.serNum = serNum;
    }


    public Date getCreateTime() {
        return createTime;
    }


    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


    public String getIsHeadPic() {
        return isHeadPic;
    }


    public void setIsHeadPic(String isHeadPic) {
        this.isHeadPic = isHeadPic == null ? null : isHeadPic.trim();
    }


    public byte[] getImg() {
        return img;
    }


    public void setImg(byte[] img) {
        this.img = img;
    }
}
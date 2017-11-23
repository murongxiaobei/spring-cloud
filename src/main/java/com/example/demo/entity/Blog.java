package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

public class Blog implements Serializable {
    private static final long serialVersionUID = -3258839839160856613L;
    private Long id;
    private String topic;
    private String content;
    private Date createTime;

    public Blog() {

    }

    public Blog(Long id, String topic, String content, Date createTime) {
        this.id = id;
        this.topic = topic;
        this.content = content;
        this.createTime = createTime;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}

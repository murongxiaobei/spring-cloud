package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class City {
    @Id
    @GeneratedValue
    private Long id;

    private String level;

    private String name;

    private Boolean isUse;

    public City() {

    }

    public City(String level, String name, Boolean isUse) {
        this.level = level;
        this.name = name;
        this.isUse = isUse;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getUse() {
        return isUse;
    }

    public void setUse(Boolean use) {
        isUse = use;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", level='" + level + '\'' +
                ", name=" + name +
                ", isUse=" + isUse +
                '}';
    }
}

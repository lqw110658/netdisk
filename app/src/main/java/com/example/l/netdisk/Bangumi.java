package com.example.l.netdisk;

import org.litepal.crud.LitePalSupport;

public class Bangumi extends LitePalSupport {

    private String name;

    private String picPath;

    private String week;

    private String detailUrl;

    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }

    public String getDetailUrl() {
        return detailUrl;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }
    public String getName() {
        return name;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }
}

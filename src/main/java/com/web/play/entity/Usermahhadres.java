package com.web.play.entity;

import java.io.Serializable;

/**
 * (Usermahhadres)实体类
 *
 * @author makejava
 * @since 2020-07-09 17:20:16
 */
public class Usermahhadres implements Serializable {
    private static final long serialVersionUID = 750006836606378632L;

    private Integer userid;

    private String userrecommend;


    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUserrecommend() {
        return userrecommend;
    }

    public void setUserrecommend(String userrecommend) {
        this.userrecommend = userrecommend;
    }

}
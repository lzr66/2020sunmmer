package com.web.play.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (Role)实体类
 *
 * @author makejava
 * @since 2020-07-09 18:37:09
 */
public class Role implements Serializable {
    private static final long serialVersionUID = -59706988345374139L;

    private Integer roleId;

    private String name;

    private String code;

    private String description;

    private Date created;

    private Date updated;


    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

}
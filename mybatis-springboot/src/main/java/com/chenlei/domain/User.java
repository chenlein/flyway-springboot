package com.chenlei.domain;

import java.io.Serializable;

/**
 * @Author: 陈磊
 * @Date: 2018/7/3
 * @Description:
 */
public class User implements Serializable {

    private Long id;

    private String name;

    private String address;

    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

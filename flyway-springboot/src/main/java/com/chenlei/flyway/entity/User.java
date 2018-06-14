package com.chenlei.flyway.entity;

import java.io.Serializable;

/**
 * @Author: 陈磊
 * @Date: 2018/6/13
 * @Description:
 */
public class User implements Serializable {

    private String id;

    private String name;

    private int age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

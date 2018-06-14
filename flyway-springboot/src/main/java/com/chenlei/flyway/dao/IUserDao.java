package com.chenlei.flyway.dao;

import com.chenlei.flyway.entity.User;

import java.util.List;

/**
 * @Author: 陈磊
 * @Date: 2018/6/13
 * @Description:
 */
public interface IUserDao {

    int create(User user);

    List<User> listAll ();

}

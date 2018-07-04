package com.chenlei.service;

import com.chenlei.domain.User;

/**
 * @Author: 陈磊
 * @Date: 2018/7/3
 * @Description:
 */
public interface IUserService {

    /**
     * create user
     * @param user
     */
    void create(User user);

    /**
     * retrieve user
     * @param id
     * @return
     */
    User retrieve(long id);

    /**
     * update user
     * @param user
     */
    void update(User user);

    /**
     * delete user
     * @param id
     */
    void delete(long id);

}

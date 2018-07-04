package com.chenlei.dao;

import com.chenlei.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: 陈磊
 * @Date: 2018/7/3
 * @Description:
 */
@Mapper
public interface UserDao {

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
    User retrieve(Long id);

    /**
     * update user
     * @param user
     */
    void update(User user);

    /**
     * delete user
     * @param id
     */
    void delete(Long id);

}

package com.chenlei.service.impl;

import com.chenlei.dao.UserDao;
import com.chenlei.domain.User;
import com.chenlei.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: 陈磊
 * @Date: 2018/7/3
 * @Description:
 */

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void create(User user) {
        this.userDao.create(user);
    }

    @Override
    public User retrieve(long id) {
        return this.userDao.retrieve(id);
    }

    @Override
    public void update(User user) {
        this.userDao.update(user);
    }

    @Override
    public void delete(long id) {
        this.userDao.delete(id);
    }

}

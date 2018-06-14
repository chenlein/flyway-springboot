package com.chenlei.flyway.service.impl;

import com.chenlei.flyway.dao.IUserDao;
import com.chenlei.flyway.entity.User;
import com.chenlei.flyway.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * @Author: 陈磊
 * @Date: 2018/6/13
 * @Description:
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public int create(User user) {
        if (user.getId() == null) {
            user.setId(UUID.randomUUID().toString());
        }
        return this.userDao.create(user);
    }

    @Override
    public List<User> listAll() {
        return this.userDao.listAll();
    }

}

package com.chenlei.flyway.dao.impl;

import com.chenlei.flyway.dao.IUserDao;
import com.chenlei.flyway.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: 陈磊
 * @Date: 2018/6/13
 * @Description:
 */
@Repository
public class UserDaoImpl implements IUserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int create(User user) {
        return this.jdbcTemplate.update("insert into t_user (id, name, age) values (?, ?, ?)", user.getId(), user.getName(), user.getAge());
    }

    @Override
    public List<User> listAll() {
        return this.jdbcTemplate.query("select * from t_user", new BeanPropertyRowMapper<>(User.class));
    }
}

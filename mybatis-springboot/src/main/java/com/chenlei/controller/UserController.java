package com.chenlei.controller;

import com.chenlei.domain.User;
import com.chenlei.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 陈磊
 * @Date: 2018/7/3
 * @Description:
 */

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/retrieve/{id}")
    public User retrieve(@PathVariable("id") long id) {
        return this.userService.retrieve(id);
    }

}

package com.chenlei.flyway.controller;

import com.chenlei.flyway.entity.User;
import com.chenlei.flyway.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: 陈磊
 * @Date: 2018/6/13
 * @Description:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public User create (@RequestBody User user) throws Exception {
        int i = this.userService.create(user);
        if (i == 1) {
            return user;
        } else {
            throw new Exception("Create Failed!");
        }
    }

    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    @ResponseBody
    public List<User> listAll() {
        return this.userService.listAll();
    }

}

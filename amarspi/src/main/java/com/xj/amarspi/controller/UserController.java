package com.xj.amarspi.controller;

import com.xj.amarspi.entity.User;
import com.xj.amarspi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/userId", method = RequestMethod.GET)
    public User findByUserId(@RequestParam(value = "userId", required = true) int userId) {
        System.out.println("开始查询...");
        return userService.findUserById(userId);
    }

    @RequestMapping(value = "/userAll", method = RequestMethod.GET)
    public List<User> findUsers() {
        System.out.println("开始查询...");
        return userService.findUsers();
    }


}
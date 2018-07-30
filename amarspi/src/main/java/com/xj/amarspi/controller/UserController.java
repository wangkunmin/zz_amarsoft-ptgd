package com.xj.amarspi.controller;

import com.xj.amarspi.common.result.Result;
import com.xj.amarspi.common.result.ResultUtil;
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
    public Result findByUserId(@RequestParam(value = "userId", required = true) int userId) {
        System.out.println("开始查询...");
        return ResultUtil.success(userService.findUserById(userId));
    }

    @RequestMapping(value = "/userAll", method = RequestMethod.GET)
    public Result findUsers() {
        System.out.println("开始查询...");
        return ResultUtil.success(userService.findUsers()) ;
    }


}
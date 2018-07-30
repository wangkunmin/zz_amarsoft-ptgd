package com.xj.ptgd.controller;

import com.xj.ptgd.entity.User;
import com.xj.ptgd.service.UserService;
import com.xj.ptgd.xmlEntity.UserXML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
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

    @RequestMapping(value = "/getUserInfo", produces = { "application/xml;charset=UTF-8" })
    @ResponseBody
    public List<UserXML> getUserBaseInfo(HttpServletRequest request) {
        System.out.println("开始查询...");
        return userService.findUsersXML();
    }

}
package com.xj.ptgd.service.impl;

import com.xj.ptgd.dao.UserDao;
import com.xj.ptgd.entity.User;
import com.xj.ptgd.service.UserService;
import com.xj.ptgd.xmlEntity.UserXML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public List<User> findUsers(){
        return userDao.findUsers();
    }

    @Override
    public List<UserXML> findUsersXML() {
        return userDao.findUsersXML();
    }

    @Override
    public User findUserById(Integer userId) {
        return userDao.findUserForId(userId);
    }

}

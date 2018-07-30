package com.xj.ptgd.service.impl;

import com.xj.ptgd.common.exception.CustomException;
import com.xj.ptgd.common.result.ResultEnum;
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
        User user = userDao.findUserForId(userId);
        if(user == null){
            throw new CustomException(ResultEnum.DATA_NULL);
        }else{
            return user;
        }
    }

}

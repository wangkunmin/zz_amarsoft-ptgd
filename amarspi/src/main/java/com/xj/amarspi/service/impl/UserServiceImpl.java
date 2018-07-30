package com.xj.amarspi.service.impl;

import com.xj.amarspi.common.exception.DataNullException;
import com.xj.amarspi.common.result.ResultEnum;
import com.xj.amarspi.dao.UserDao;
import com.xj.amarspi.entity.User;
import com.xj.amarspi.service.UserService;
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
    public User findUserById(Integer userId){
        User user = userDao.findUserForId(userId);
        if(user == null){ //数据为空处理
            throw new DataNullException(ResultEnum.DATA_NULL);
        }else{
            return user;
        }
    }

}

package com.xj.amarspi.dao;

import com.xj.amarspi.entity.User;

import java.util.List;

public interface UserDao {
    List<User> findUsers();
    User findUserForId(Integer userId);
}

package com.xj.amarspi.service;

import com.xj.amarspi.entity.User;

import java.util.List;

public interface UserService {
    List<User> findUsers();

    User findUserById(Integer userId);
}

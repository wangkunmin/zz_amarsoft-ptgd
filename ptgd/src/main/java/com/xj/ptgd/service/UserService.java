package com.xj.ptgd.service;


import com.xj.ptgd.entity.User;
import com.xj.ptgd.xmlEntity.UserXML;

import java.util.List;

public interface UserService {
    List<User> findUsers();
    List<UserXML> findUsersXML();
    User findUserById(Integer userId);
}

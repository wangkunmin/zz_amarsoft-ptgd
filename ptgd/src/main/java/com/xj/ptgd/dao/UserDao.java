package com.xj.ptgd.dao;

import com.xj.ptgd.entity.User;
import com.xj.ptgd.xmlEntity.UserXML;

import java.util.List;

public interface UserDao {
    List<User> findUsers();
    List<UserXML> findUsersXML();
    User findUserForId(Integer userId);
}

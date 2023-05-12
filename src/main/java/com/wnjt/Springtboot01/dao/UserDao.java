package com.wnjt.Springtboot01.dao;

import com.wnjt.Springtboot01.entity.TUser;

public interface UserDao {

    TUser selectByName(String username);

}

package com.wnjt.Springtboot01.service.impl;

import com.wnjt.Springtboot01.dao.UserDao;
import com.wnjt.Springtboot01.entity.TUser;
import com.wnjt.Springtboot01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceimpl implements UserService {

    @Autowired
    UserDao userDao;

//    public UserServiceimpl(UserDao userDao) {
//        this.userDao = userDao;
//    }

    @Override
    public String login(String username ,String password){
        //业务具体实现
        //自定义假的
        //TUser tUser=new TUser(1,"123","123","ADSAD","ASD");

        TUser tUser1 = userDao.selectByName(username);
        //通过username查询用户信息
        System.out.println(tUser1);

        if(tUser1!=null){
            if(password.equals(tUser1.getPassword())){
                return "denglucheng";
            }
            else{
                return "登录失败,mimabuzhengque";
            }
        }
        else{
            return "用户不存在";
        }



//        return "输出userservice中的login方法";
    }
}

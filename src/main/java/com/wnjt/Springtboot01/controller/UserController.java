package com.wnjt.Springtboot01.controller;

import com.wnjt.Springtboot01.entity.ResultData;
import com.wnjt.Springtboot01.entity.TUser;
import com.wnjt.Springtboot01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
/*
http://localhost:8081/UserController/login
http://localhost:8081/UserController/login?username=123&password=123
http://localhost:8081/UserController/regist]
JSON  key-value
{
 "username":"admin",
 "password":12345
}
2、获取参数
3、处理业务 调用service层  得到结果
4、处理结果 封装结果
5、响应 返回 返回数据（@ResponseBody    将Java对象转化为json格式的字符串）  返回界面
*/
//@RestController=@Controller+@ResponseBody

/*restFul设计风格
GET:  select (查询数据)
POST: insert (增添)
DELETE: delete(删除)
PUT: update (更新)
*/


@Controller//下面类接在控制器类
@RequestMapping("/UserController")
public class UserController {

    @Autowired  //@Resoure
    UserService userService;
    //    登录实例
    @GetMapping ("/login")//get方式 之前php处理过？username=sada&password=uhi
    @ResponseBody//用于返回字符串 java对象转换为JSON字符串   @RequestBody  将字符串转换为Java对象
    public ResultData login(String username, String password){
        //获取到请求参数
        System.out.println("用户名："+username+"密码："+password);//控制台打印
        //调用业务层  service  result (String  "登录成功"   ”登录失败“)
//        1、创建对应service
//        2、调用service
//           ① UserService userService = new UserServiceImpl();
//        String login = userService.login();
//        System.out.println(login);
//           ② @Autowired    //@Resource
//                UserService userService;
        String login = userService.login(username ,password);
        System.out.println(login);
        /*
        封装结果{
        “code”：状态码 200 500，
        “message”:"请求成功/请求失败"，
        "data":result  (List Map)
        }
        */
        ResultData resultData = new ResultData( 200, "请求成功",111);//创建对象 new类
        return resultData;//返回java对象

//        return username+password;//HTML返回字符串
//        UserService userService= new UserService();
    }

    //增加
    //用户所有信息 用户名 密码 性别 地址 爱好 。。。。一个用户对象 json字符串 ==》java对象 @RequstBody

    @PostMapping("/insertuser")
    @ResponseBody//用于返回字符串
    public ResultData add( @RequestBody TUser tuser ){

        System.out.println(tuser);

//        String login = userService.login();
//
//        System.out.println(login);

        ResultData resultData = new ResultData( 200, "请求成功","增加成功");//创建对象 new类
        return resultData;//返回java对象
    }

    //删除
    @DeleteMapping("/deleteuser")
    @ResponseBody//用于返回字符串
    public ResultData delete(){

        ResultData resultData = new ResultData( 200, "请求成功","删除成功");//创建对象 new类

        return resultData;//返回java对象
    }

    //更新
    @PutMapping("/updateuser")
    @ResponseBody//用于返回字符串
    public ResultData update(){

        ResultData resultData = new ResultData( 200, "请求成功","更新成功");//创建对象 new类

        return resultData;//返回java对象
    }

    //注册
    @RequestMapping("/regist")
//    @ResponseBody返回页面不能加
    public String regist(){
        System.out.println("zhuce成功");//控制台打印
        return "regist";//HTML返回文件regist,html
    }





}

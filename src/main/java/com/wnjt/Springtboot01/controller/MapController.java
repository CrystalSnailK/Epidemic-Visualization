package com.wnjt.Springtboot01.controller;
//GET:http://localhost:8081/MapController/getData
//1.拦截请求
//2.获取参数
//3.处理业务 调用service层


import com.wnjt.Springtboot01.entity.NameValue;
import com.wnjt.Springtboot01.entity.ResultData;
import com.wnjt.Springtboot01.service.MapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/MapController")
public class MapController {

    @Autowired
    MapService mapService;

    @RequestMapping("/getData")
    @ResponseBody
    public ResultData getNameAndValue(){
        //调用业务层 1、获取地图数据
       List<NameValue> mapData  = mapService.getNameAndValue();
       //封装结果
        //2.获取玫瑰图数据
        List<NameValue> meiData  = mapService.getDeadData();
        // 封装结果
        //3.获取饼图数据
        List<NameValue> bingData = mapService.getConfirmData();
        //4、折线图数据
        List<NameValue> zheData = mapService.getzheData();
        //5、条图数据
        List<NameValue> tiaoData = mapService.gettiaoData();

        //用HashMap把多个数据放入集合
        HashMap<String,Object> result=new HashMap<>();
        result.put("mapData",mapData);//放入result
        result.put("meiData",meiData);//放入result
        result.put("bingData",bingData);//放入result
        result.put("zheData",zheData);//放入result
        result.put("tiaoData",tiaoData);//放入result

        ResultData resultData =new ResultData(200,"查询成功",result);
        //响应，返回
        return  resultData;

    }
}

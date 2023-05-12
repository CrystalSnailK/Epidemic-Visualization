package com.wnjt.Springtboot01.service.impl;


import com.wnjt.Springtboot01.dao.MapDao;
import com.wnjt.Springtboot01.entity.NameValue;
import com.wnjt.Springtboot01.service.MapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MapServiceimpl implements MapService {


    @Autowired
    MapDao mapDao;


    //map的数据获取
    @Override
    public List<NameValue> getNameAndValue() {
        //调用Dao MapDao
        List<NameValue> resultconfirm = mapDao.getNameAndValue();

        return resultconfirm;
    }


    //mei的数据获取
    @Override
    public List<NameValue> getDeadData(){

        List<NameValue> resultDead=mapDao.getDeadData();

        return resultDead;
    }

    @Override
    public List<NameValue> getConfirmData(){

        List<NameValue> resultConfirm=mapDao.getConfirmData();

        return resultConfirm;
    }

    @Override
    public List<NameValue> getzheData() {

        List<NameValue> resultzhe=mapDao.getzheData();

        return resultzhe;
    }

    @Override
    public List<NameValue> gettiaoData() {

        List<NameValue> resulttiao=mapDao.gettiaoData();

        return resulttiao;}

}

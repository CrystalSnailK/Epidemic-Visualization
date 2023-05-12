package com.wnjt.Springtboot01.dao;


import com.wnjt.Springtboot01.entity.NameValue;

import java.util.List;

public interface MapDao {
    //map的数据获取
    List<NameValue> getNameAndValue();
    //mei的数据获取
    List<NameValue> getDeadData();

    List<NameValue> getConfirmData();

    List<NameValue> getzheData();

    List<NameValue> gettiaoData();
}

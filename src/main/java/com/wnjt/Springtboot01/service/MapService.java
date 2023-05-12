package com.wnjt.Springtboot01.service;


import com.wnjt.Springtboot01.entity.NameValue;

import java.util.List;

public interface MapService {

    List<NameValue> getNameAndValue();//map的数据获取

    List<NameValue> getDeadData();//mei的数据获取

    List<NameValue> getConfirmData();

    List<NameValue> getzheData();

    List<NameValue> gettiaoData();
}

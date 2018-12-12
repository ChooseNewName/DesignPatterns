package com.nf147.ssm_superman.FactoryMode.简单工厂.service;


import com.nf147.ssm_superman.FactoryMode.简单工厂.Phones.HuaWei_1;
import com.nf147.ssm_superman.FactoryMode.简单工厂.Phones.IPhone_1;
import com.nf147.ssm_superman.FactoryMode.简单工厂.Phones.XiaoMi_1;
import com.nf147.ssm_superman.FactoryMode.简单工厂.dao.Phone1;

public class PhoneFactory {

    public Phone1 createPhone(String tag) {
        if ("hw".equals(tag)) {
            return new HuaWei_1();
        } else if ("IPhone".equals(tag)) {
            return new IPhone_1();
        } else if ("xm".equals(tag)) {
            return new XiaoMi_1();
        }
        return null;
    }




}

package com.nf147.ssm_superman.FactoryMode.原始模式.Phones;


import com.nf147.ssm_superman.FactoryMode.原始模式.dao.Phone;

public class IPhone implements Phone {

    public void play() {
        System.out.println("我是苹果手机");
    }
}

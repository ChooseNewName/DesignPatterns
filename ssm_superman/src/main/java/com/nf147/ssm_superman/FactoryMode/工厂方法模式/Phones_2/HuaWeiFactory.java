package com.nf147.ssm_superman.FactoryMode.工厂方法模式.Phones_2;


import com.nf147.ssm_superman.FactoryMode.工厂方法模式.dao_2.PhoneFactory;
import com.nf147.ssm_superman.FactoryMode.工厂方法模式.dao_2.Phone_2;

public class HuaWeiFactory implements PhoneFactory {

    @Override
    public Phone_2 createPhone() {
        return new HuaWei_2();
    }
}

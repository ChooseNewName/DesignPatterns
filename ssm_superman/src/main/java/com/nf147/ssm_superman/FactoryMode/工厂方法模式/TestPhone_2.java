package com.nf147.ssm_superman.FactoryMode.工厂方法模式;

import com.nf147.ssm_superman.FactoryMode.工厂方法模式.Phones_2.HuaWeiFactory;
import com.nf147.ssm_superman.FactoryMode.工厂方法模式.Phones_2.IPhoneFactory;
import com.nf147.ssm_superman.FactoryMode.工厂方法模式.Phones_2.XiaoMiFactory;
import com.nf147.ssm_superman.FactoryMode.工厂方法模式.dao_2.PhoneFactory;

public class TestPhone_2 {

    public static void main(String[] args) {

        HuaWeiFactory huaWeiFactory = new HuaWeiFactory();
        huaWeiFactory.createPhone().play();

        IPhoneFactory iPhoneFactory = new IPhoneFactory();
        iPhoneFactory.createPhone().play();

        XiaoMiFactory xiaoMiFactory = new XiaoMiFactory();
        xiaoMiFactory.createPhone().play();
    }

}

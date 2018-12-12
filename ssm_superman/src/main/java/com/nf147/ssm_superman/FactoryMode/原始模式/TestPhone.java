package com.nf147.ssm_superman.FactoryMode.原始模式;


import com.nf147.ssm_superman.FactoryMode.原始模式.Phones.HuaWei;
import com.nf147.ssm_superman.FactoryMode.原始模式.Phones.IPhone;
import com.nf147.ssm_superman.FactoryMode.原始模式.Phones.XiaoMi;
import com.nf147.ssm_superman.FactoryMode.原始模式.dao.Phone;

public class TestPhone {

    public static void main(String[] args) {
        Phone iPhone = new IPhone();
        iPhone.play();

        Phone xiaoMi = new XiaoMi();
        xiaoMi.play();

        Phone huaWei = new HuaWei();
        huaWei.play();
    }

}

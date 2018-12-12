package com.nf147.ssm_superman.FactoryMode.简单工厂;

import com.nf147.ssm_superman.FactoryMode.简单工厂.service.PhoneFactory;

public class TestPhone1 {

    public static void main(String[] args) {
        PhoneFactory pf = new PhoneFactory();

        pf.createPhone("xm").play();
        pf.createPhone("IPhone").play();
        pf.createPhone("hw").play();

//
    }

}

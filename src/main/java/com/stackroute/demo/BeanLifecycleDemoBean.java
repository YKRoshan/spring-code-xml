package com.stackroute.demo;

import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean {

    public void afterPropertiesSet() throws Exception {
        System.out.println("inside afterPropertiesSet");
    }

    public void customInit() throws Exception {
        System.out.println("inside customInit");

    }

    public void customDestroy() throws Exception {
        System.out.println("inside custom destroy");

    }
}
package com.ssm.test;

import com.ssm.service.AccountService;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

    @Test
    public void springTest(){

        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService as = (AccountService) ac.getBean("accountService");
        as.findAll();
    }
}

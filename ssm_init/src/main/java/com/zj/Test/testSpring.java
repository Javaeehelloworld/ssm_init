package com.zj.Test;

import com.zj.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSpring {

    @Test
    public void run1(){
        //测试spring
        ApplicationContext ac = new
                ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AccountService as = (AccountService) ac.getBean("accountController");
        as.findAll();
    }
}

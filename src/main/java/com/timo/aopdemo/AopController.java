package com.timo.aopdemo;

import com.timo.aopdemo.aop.AopTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aop")
public class AopController {
    @Autowired
    AopTest aopTest;
    @RequestMapping("/test")
    public String testAop(){
        return aopTest.targetMethod();
    }


}

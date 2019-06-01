package com.timo.aopdemo;

import com.timo.aopdemo.aop.AopTest;
import com.timo.aopdemo.selfautoconfig.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aop")
public class AopController {
    @Autowired
    AopTest aopTest;

    @Autowired
    HelloService helloService;
    @RequestMapping("/test")
    public String testAop(){
        return aopTest.targetMethod();
    }
    @RequestMapping("/auto")
    public String autoConfiguration(){
        helloService.sayHello();
        return helloService.getMsg();
    }


}

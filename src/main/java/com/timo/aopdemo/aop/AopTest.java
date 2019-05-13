package com.timo.aopdemo.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * execution(modifiers-pattern? return-type-pattern declaring-type-pattern? name-pattern(param-pattern) throws-pattern?)
 * 其中return-type-pattern， name-pattern(param-pattern)是必须的，其余的是选填的。
 *任意公共方法的执行：
 *
 * execution(public * *(..))
 * 任何一个以“set”开始的方法的执行：
 *
 * execution(* set*(..))
 * AccountService 接口的任意方法的执行：
 *
 * execution(* com.xyz.service.AccountService.*(..))
 * 定义在service包里的任意方法的执行：
 *
 * execution(* com.xyz.service.*.*(..))
 * 定义在service包或者子包里的任意方法的执行：
 *
 * 注意包或者子包用两个点
 * execution(* com.xyz.service..*.*(..))
 */
@Aspect
@Component
public class AopTest {

    @Pointcut("execution(* com.timo.aopdemo..*.*(..))")
    public String  targetMethod(){
        System.out.println("*******target method**********");
        return "targetMethod";
    }

    @Before("targetMethod()")
    public void before(){
        System.out.println("***********before*********");
    }

    @After("targetMethod()")
    public void after(){
        System.out.println("***********after*********");
    }
}

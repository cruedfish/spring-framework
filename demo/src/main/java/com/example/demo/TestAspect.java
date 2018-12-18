package com.example.demo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TestAspect {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Pointcut("execution(public * com.example.demo..*.*(..))")
    public void webLog(){}

    @Before("webLog()")
    public void doBefor(){
        logger.info("测试之前");
    }
    @After("webLog()")
    public void doAfter(){
        logger.info("测试之后");
    }
}

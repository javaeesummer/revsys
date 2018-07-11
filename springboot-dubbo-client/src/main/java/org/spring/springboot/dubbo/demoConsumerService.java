package org.spring.springboot.dubbo;

import com.alibaba.dubbo.config.annotation.Reference;
import org.spring.springboot.domain.City;
import org.spring.springboot.dubbo.facade.test;
import org.springframework.stereotype.Component;

/**
 * @author hxs
 * @desprition 用来干嘛的呢, 也就是随便写写的
 **/


public class demoConsumerService{

    @Reference(version = "1.0.0")
    test test;
    public void sayhello(){
        test.sayhello();
    }
}
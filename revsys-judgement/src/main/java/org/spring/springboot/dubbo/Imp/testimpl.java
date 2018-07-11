package org.spring.springboot.dubbo.Imp;

import com.alibaba.dubbo.config.annotation.Service;
import org.spring.springboot.dubbo.facade.test;

/**
 * @author hxs
 * @desprition 用来干嘛的呢, 也就是随便写写的
 **/
@Service(version = "1.0.0")
public class testimpl implements test {

    @Override
    public void sayhello() {
        System.out.println("hello");
    }
}

package com.yucong.provider.service.user;

import com.alibaba.dubbo.config.annotation.Service;
import com.yucong.service.RemoteUserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 官方介绍文档
 * 
 * https://github.com/alibaba/dubbo-spring-boot-starter/blob/master/README_zh.md
 * 
 */
@Component
@Service(/*version = "1.0.0",*/timeout = 10000,interfaceClass = RemoteUserService.class)
public class RemoteUserServiceImpl implements RemoteUserService {

    private static final Logger logger = LoggerFactory.getLogger(RemoteUserServiceImpl.class);

    @Override
    public String sayHello(String name) {
    	logger.info("say Hello :" + name);
        return "Hello "+name;
    }
}

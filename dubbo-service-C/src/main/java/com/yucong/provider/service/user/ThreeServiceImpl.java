package com.yucong.provider.service.user;

import com.alibaba.dubbo.config.annotation.Service;
import com.yucong.service.ThreeService;

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
@Service(/*version = "1.0.0",*/timeout = 10000,interfaceClass = ThreeService.class)
public class ThreeServiceImpl implements ThreeService {

    private static final Logger logger = LoggerFactory.getLogger(ThreeServiceImpl.class);

    @Override
    public String three(String name) {
    	logger.info("say Hello :" + name);
        return "Hello "+name;
    }
}

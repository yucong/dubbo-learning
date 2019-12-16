package com.yucong.service.service.user;

import com.alibaba.dubbo.config.annotation.Service;
import com.yucong.service.OneService;

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
@Service(/*version = "1.0.0",*/timeout = 10000,interfaceClass = OneService.class)
public class OneServiceImpl implements OneService {

    private static final Logger logger = LoggerFactory.getLogger(OneService.class);

    @Override
    public String one(String name) {
    	logger.info("service one :" + name);
        return "service one " + name;
    }
    
}

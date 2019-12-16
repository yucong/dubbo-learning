package com.yucong.provider.service.user;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.yucong.service.ThreeService;
import com.yucong.service.TwoService;

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
@Service(/*version = "1.0.0",*/timeout = 10000,interfaceClass = TwoService.class)
public class TwoServiceImpl implements TwoService {

    private static final Logger logger = LoggerFactory.getLogger(TwoServiceImpl.class);

    @Reference(/*version = "1.1.0",*/check = false /*,url="dubbo://localhost:20880"*/)
    private ThreeService threeService;
    
    @Override
    public String two(String name) {
    	logger.info("say Hello two:" + name);
        return threeService.three(name);
    }
}

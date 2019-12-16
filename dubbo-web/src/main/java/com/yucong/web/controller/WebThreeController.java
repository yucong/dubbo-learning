package com.yucong.web.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yucong.service.ThreeService;

@RestController
public class WebThreeController {

	/**
	 * 
	 * 直连需要加url="dubbo://localhost:20880"
	 * 
	 */
    @Reference(/*version = "1.1.0",*/check = false /*,url="dubbo://localhost:20880"*/)
    private ThreeService threeService;


    @RequestMapping(value="/three/say/{name}")
    public String sayHello(@PathVariable("name") String name){

        String result = threeService.three(name);
        return result;
    }


}

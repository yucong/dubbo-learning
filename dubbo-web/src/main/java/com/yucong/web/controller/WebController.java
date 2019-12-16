package com.yucong.web.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.yucong.service.OneService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

	/**
	 * 
	 * 直连需要加url="dubbo://localhost:20880"
	 * 
	 */
    @Reference(/*version = "1.1.0",*/check = false /*,url="dubbo://localhost:20880"*/)
    private OneService oneService;


    @RequestMapping(value="/dubbo/say/{name}")
    public String sayHello(@PathVariable("name") String name){

        String result = oneService.one(name);
        return result;
    }


}

package cn.com.jhn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Rest 入口，用于测试
 * @author 陈琳
 * @create 2016-10-20 上午 10:52
 **/
@RestController
@RequestMapping("/spring-cloud-config")
public class InvoiceController {



    /**
     * @description:spring cloud  config 测试
     * @author:陈琳
     * @return:
     * @param
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String test() {
        return "Welcome to Spring Cloud Server";

    }

}

package com.web.play.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.web.play.entity.Orders;
import com.web.play.service.OrdersService;

import javax.annotation.Resource;

@RestController
public class TestController {

    @Resource
    private OrdersService ordersService;

    @RequestMapping("/test")
    public Orders test(){
        Orders an = this.ordersService.queryById(String.valueOf(10000002));
        //return "Test";
        return an;
    }
}

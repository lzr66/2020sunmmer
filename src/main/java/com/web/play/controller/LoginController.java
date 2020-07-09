package com.web.play.controller;

import com.alibaba.fastjson.JSON;
import com.web.play.dao.UserDao;
import com.web.play.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@CrossOrigin
public class LoginController {

    /*

    @Autowired
    UserDao userDao;

    @PostMapping (value = "/login",consumes = "application/x-www-form-urlencoded")
    public String login(User user) {

        String flag = "0";
        User us = userDao.getUserByMessage(user.getUsername(), user.getPassword());
        System.out.println("user:" + us);
        HashMap<String, Object> res = new HashMap<>();
        if (us != null) {
            flag = "0";
        }
        res.put("flag", flag);
        res.put("user", user);
        String res_json = JSON.toJSONString(res);
        return res_json;
    }
     */

    //判断该用户名是否已经存在
    @PostMapping (value = "/LoginName")
    public boolean LoginName(String username){
        return true;
    }


}

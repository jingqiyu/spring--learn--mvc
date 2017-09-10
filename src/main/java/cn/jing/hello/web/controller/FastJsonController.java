package cn.jing.hello.web.controller;

import cn.jing.hello.web.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/fast")
public class FastJsonController {

    @GetMapping("/get")
    @ResponseBody
    public User getUser(){
        User user = new User("jing","dscmwer!!dc1");
        return user;
    }

}

package cn.jing.hello.web.controller;

import cn.jing.hello.web.po.RlUser;
import cn.jing.hello.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mybatis")
public class MybatisUserController {

    @Autowired
    private UserService userService;

    @GetMapping("/get")
    public RlUser getUser(@RequestParam("uid") int userId) throws Exception {
        return userService.getByUserId(userId);
    }


}

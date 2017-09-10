package cn.jing.hello.web.controller;

import cn.jing.hello.web.entity.User;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/json")
public class JsonTestController {

    @GetMapping("/user")
    @JsonView(User.WithoutPasswordView.class)
    public User getUser() {
        return new User("eric", "7!jd#h23");
    }


    @GetMapping("/user1")
    @JsonView(User.WithPasswordView.class)
    public User getUserWithOut() {
        return new User("eric", "7!jd#h23");
    }

    @GetMapping("/test")
    public User user(){
        User user = new User("s","s");
        return user;
    }


}

package cn.jing.hello.web.controller;

import cn.jing.hello.web.entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DataBinderController {

    @RequestMapping("/{formName}")
    public String loginForm(@PathVariable String formName){
        return formName;
    }

    @PostMapping("/register")
    public String register(@ModelAttribute Employee employee, Model model){
        model.addAttribute("emp",employee);
        return "dataBindSuccess";
    }


}

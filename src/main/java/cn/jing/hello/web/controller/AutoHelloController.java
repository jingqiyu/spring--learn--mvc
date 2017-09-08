package cn.jing.hello.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author jingqy@mail.jj.cn
 * @since 2017/9/1
 */
@Controller
public class AutoHelloController {

    @RequestMapping("/hello")
    public ModelAndView auto() throws Exception{

        ModelAndView modelAndView = new ModelAndView();
        //相当于request的setAttribute方法,在jsp页面中通过itemsList取数据
        modelAndView.addObject("message","auto Hello");
        //指定视图
        modelAndView.setViewName("hello");
        return modelAndView;
    }

}

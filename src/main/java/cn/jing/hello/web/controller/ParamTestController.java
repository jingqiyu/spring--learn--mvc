package cn.jing.hello.web.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/test")
public class ParamTestController {

    private static final Log log  = LogFactory.getLog(ParamTestController.class);

    @RequestMapping(value = "/param" , method = RequestMethod.GET)
    public ModelAndView getParam(
        // 默认情况下 如果配置了@RequestParam 则所需的id是必须的  但是可以通过如下方式指定为非强制的
        @RequestParam(name="tid",required = false) int tid
    ) {
        log.info("tid is "+ tid);
        ModelAndView mv = new ModelAndView();
        mv.addObject("tid", tid);
        mv.addObject("uid",456);
        mv.setViewName("hello");
        return mv;
    }

}

package com.test.bongu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping(value="/home")
    public ModelAndView getHomeView(ModelAndView mv){
        logger.info("home");
        mv.addObject("name", "이형구");
        mv.setViewName("/home");
        return mv;
    }
}

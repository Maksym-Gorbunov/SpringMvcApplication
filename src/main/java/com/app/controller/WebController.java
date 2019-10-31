package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {

  @RequestMapping("home")
  public ModelAndView home(){
    String name = "maks";
    ModelAndView mv = new ModelAndView();
    mv.addObject("name", name);
    mv.setViewName("home");
    return mv;
  }

  @RequestMapping("cars")
  public ModelAndView cars(){
    String name = "carrrrrs";
    ModelAndView mv = new ModelAndView();
    mv.addObject("name", name);
    mv.setViewName("pages/cars");
    return mv;
  }
}

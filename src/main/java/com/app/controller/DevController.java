package com.app.controller;

import com.app.model.developers.Developer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DevController {

  @RequestMapping("addDeveloper")
  public ModelAndView addDeveloper(Developer developer){
    ModelAndView mv = new ModelAndView();
    mv.addObject("obj", developer);
    mv.setViewName("pages/developers");
    return mv;

  }
}

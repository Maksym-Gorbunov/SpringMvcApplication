package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class ExampleController {


  //work in jsp
  @RequestMapping("example1")
  public String example1(HttpServletRequest req, HttpServletResponse res){
    HttpSession session = req.getSession();
    String name = req.getParameter("name");
    session.setAttribute("name", name);
    return "example";
  }

  //work in jsp
  @RequestMapping("example2")
  public String example12(String name, HttpSession session){
    session.setAttribute("name", name);
    System.out.println(name);
    return "example";
  }

  //http://localhost:9090/example3?name=Maks
  @RequestMapping("example3")
  public String example13(HttpServletRequest req, HttpServletResponse res){
    String name = req.getParameter("name");
    req.setAttribute("name", name);
    return "example";
  }

  //work in jsp
  @RequestMapping("example4")
  public String example14(@RequestParam("name") String myName, HttpSession session){
    session.setAttribute("name", myName);
    System.out.println(myName);
    return "example";
  }

  @RequestMapping("example5")
  public ModelAndView example15(@RequestParam("name") String myName){
    ModelAndView mv = new ModelAndView();
    mv.addObject("name", myName);
    mv.setViewName("example");
    return mv;
  }

  @RequestMapping("example6")
  public ModelAndView example16(String name){
    ModelAndView mv = new ModelAndView();
    mv.addObject("name", name);
    mv.setViewName("example");
    return mv;
  }


}

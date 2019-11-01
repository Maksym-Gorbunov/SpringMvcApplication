package com.app.controller;

import com.app.model.users.User;
import com.app.model.users.UsersModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
public class UsersController {

  @RequestMapping("users")
  public ModelAndView users(){
    List<User> users = UsersModel.users;
    ModelAndView mv = new ModelAndView();
    mv.addObject("users", users);
    mv.setViewName("pages/users");
    return mv;
  }
}

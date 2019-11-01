package com.app.controller;

import com.app.model.cars.Car;
import com.app.model.cars.CarsDBHelper;
import com.app.model.cars.CarsModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CarsController {

  @RequestMapping("cars")
  public ModelAndView cars(){
    String name = "carrrrrs";
    CarsModel model = new CarsModel(new CarsDBHelper());
    List<Car> data = model.getAllCars();

    ModelAndView mv = new ModelAndView();
    mv.addObject("name", name);
    mv.addObject("data", data.size());
    mv.setViewName("pages/cars");
    return mv;
  }
}

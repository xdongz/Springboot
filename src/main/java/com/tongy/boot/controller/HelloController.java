package com.tongy.boot.controller;

import com.tongy.boot.bean.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @Autowired
  Car car;

  @RequestMapping("/car")
  public Car getCar() {
    return car;
  }

  @RequestMapping("/photo.jpg")
  public String handle01() {
    return "Hello, Spring Boot 2!";
  }

}

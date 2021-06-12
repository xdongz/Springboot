package com.tongy.boot.controller;

import com.tongy.boot.bean.Car;
import com.tongy.boot.bean.Pet;
import com.tongy.boot.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ResponseTestController {

  @ResponseBody
  @GetMapping("/test/user")
  public User getUser() {
    User user = new User();
    user.setName("zhangsan");
    user.setAge(18);
    user.setPet(new Pet("tom"));
    return user;
  }

  @ResponseBody
  @GetMapping("/test/car")
  public Car getCar() {
    Car car = new Car();
    car.setBrand("BWM");
    car.setPrice(1000);

    return car;
  }

}

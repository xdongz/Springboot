package com.tongy.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewTestController {

  @GetMapping("/test/view")
  public String test(Model model) {
    // model中的数据会被放在请求域中
    model.addAttribute("msg", "Hello, guys");
    model.addAttribute("link", "http://wwww.tongy.com");
    return "success";
  }

}

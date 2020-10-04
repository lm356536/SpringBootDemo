package com.liming.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
  @RequestMapping("/hello")
  public String hello() {
     return  "Hello Liming!";
  }

  @RequestMapping("/excep")
  public int excep() {
    int a = 2/ 0;
    return  a;
  }
}

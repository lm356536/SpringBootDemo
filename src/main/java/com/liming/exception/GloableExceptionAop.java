package com.liming.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.management.RuntimeErrorException;

@ControllerAdvice
public class GloableExceptionAop {
  @ExceptionHandler(RuntimeException.class)
  @ResponseBody
  public  String runtimeException(){
    return "出现异常了， 这里捕获全局异常相当于aop异常";
  }
}

package com.example.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.TestService;

import java.util.Random;


@RestController
public class HelloApi {

  @Autowired
  private TestService testService;

  @PostMapping("hello/search")
  public String getHelloData() throws InterruptedException {
    Thread.sleep(2000);
    return "helloData" + new Random().nextInt(100);
  }

  @PostMapping("test")
  public String getName() {
      var name = testService.getName("1");
      return "name:" + name;
  }
  

}

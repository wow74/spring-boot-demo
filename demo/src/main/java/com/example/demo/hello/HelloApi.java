package com.example.demo.hello;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Random;

@RestController
public class HelloApi {

  @PostMapping("hello/search")
  public String getHelloData() throws InterruptedException {
    Thread.sleep(2000);
    return "helloData" + new Random().nextInt(100);
  }

}

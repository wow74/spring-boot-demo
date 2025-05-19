package com.example.demo.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

  @GetMapping("/hello")
  public String getPage() throws InterruptedException {
    Thread.sleep(1000);
    return "hello/hello";
  }

}

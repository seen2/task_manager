package com.antatrix.task_manager.home;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HomeController {

  @GetMapping("/")
  public String getMethodName() {
      return new String("Hello");
  }


}

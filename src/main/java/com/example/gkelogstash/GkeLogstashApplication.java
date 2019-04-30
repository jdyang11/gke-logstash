package com.example.gkelogstash;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GkeLogstashApplication {

  /*@Value("${spring.application.name}")
  private String appName;*/

  public static void main(String[] args) {
    SpringApplication.run(GkeLogstashApplication.class, args);
  }

  /*@GetMapping("/")
  public String index() {
    return "Hello From " + appName + "\n";
  }*/
}

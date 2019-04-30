package com.example.gkelogstash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GkeLogstashApplication {

  public static void main(String[] args) {
    SpringApplication.run(GkeLogstashApplication.class, args);
  }
}

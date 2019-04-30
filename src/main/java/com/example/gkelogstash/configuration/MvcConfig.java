package com.example.gkelogstash.configuration;

import com.example.gkelogstash.interceptor.LogInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    // LogInterceptor apply to all URLs.
    registry.addInterceptor(new LogInterceptor());
  }
}
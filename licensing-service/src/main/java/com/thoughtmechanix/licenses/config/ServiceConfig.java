package com.thoughtmechanix.licenses.config;

import org.springframework.stereotype.Component;

@Component
public class ServiceConfig{

//  @Value("${example.property}")
  private String exampleProperty="";

  public String getExampleProperty(){
    return exampleProperty;
  }
}

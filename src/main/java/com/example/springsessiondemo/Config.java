package com.example.springsessiondemo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations={"classpath:spring.xml"})
public class Config {
}

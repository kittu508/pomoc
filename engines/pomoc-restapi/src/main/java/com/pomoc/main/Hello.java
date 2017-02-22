package com.pomoc.main;

import com.pomoc.components.openapi.spring.OpenApiSpring;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@EnableAutoConfiguration
@ComponentScan("com.pomoc")
@Import({OpenApiSpring.class})
@Configuration
public class Hello {
   public static void main(String[] args) {
      SpringApplication.run(Hello.class, args);
   }
}

package com.example.HowToMake.Configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfiguration implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
      ///  registry.addMapping("/**").allowedMethods("*");
      //  registry.addMapping("/**").allowedOrigins("*");

       registry.addMapping("/**").allowedOrigins("*")
              .allowedMethods("PUT", "DELETE", "GET", "POST");

    }
}

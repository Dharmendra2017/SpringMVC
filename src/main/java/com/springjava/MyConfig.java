//replacing despatcher-servlet.xml file
//java based configuration
package com.springjava;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan("com.springjava")
public class MyConfig extends WebMvcConfigurerAdapter{

}

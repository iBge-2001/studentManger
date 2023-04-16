package com.lin.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.lin.config","com.lin.controller"})
@EnableWebMvc
public class SpringMvcConfig extends SpringMvcSupport{

}

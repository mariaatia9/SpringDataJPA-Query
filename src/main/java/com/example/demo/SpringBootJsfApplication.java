package com.example.demo;

import jakarta.faces.webapp.FacesServlet;
import jakarta.servlet.ServletContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.ServletContextAware;

@SpringBootApplication
@EntityScan(basePackages = "com.example.entity")
public class SpringBootJsfApplication extends SpringBootServletInitializer{

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJsfApplication.class, args);
    }

    @Bean
    public ServletRegistrationBean<FacesServlet> servletRegistrationBean() {
        FacesServlet servlet = new FacesServlet();
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean<>(servlet, "*.xhtml");
        servletRegistrationBean.setLoadOnStartup(1);
        return servletRegistrationBean;
    }
   

}

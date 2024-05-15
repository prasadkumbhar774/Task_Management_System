package com.odyssey.todomanagement.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;


@Configuration
public class ClientWebConfig implements WebMvcConfigurer {
	
@Bean
public ViewResolver viewResolver() {
	
   InternalResourceViewResolver bean = new InternalResourceViewResolver();
   bean.setViewClass(JstlView.class);
   bean.setPrefix("/WEB-INF/view/");
   bean.setSuffix(".jsp");
   return bean;
}

@Override
public void addResourceHandlers(ResourceHandlerRegistry registry) {
    registry.addResourceHandler("/image/**")
      .addResourceLocations("/WEB-INF/images/");
      }

@Bean
public JavaMailSender getJavaMailSender() throws Exception {
    JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
    mailSender.setHost("smtp.gmail.com");
    mailSender.setPort(587);
     
    mailSender.setUsername("daniel@gmail.com");
    mailSender.setPassword("daniel@1990");
     
    Properties props = mailSender.getJavaMailProperties();
    props.put("mail.transport.protocol", "smtp");
    props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.starttls.enable", "true");
    props.put("mail.debug", "true");
     
    return mailSender;
}
}

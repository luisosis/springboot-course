package com.course.springboot.coursespringboot.configuration;

import com.course.springboot.coursespringboot.bean.MyBeanWithProperties;
import com.course.springboot.coursespringboot.bean.MyBeanWithPropertiesImpl;
import com.course.springboot.coursespringboot.pojo.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(User.class)
public class GeneralConfiguration {
    @Value("${value.name}")
    private String name;

    @Value("${value.apellido}")
    private String apellido;

    @Value("${value.random}")
    private String random;


    @Bean
    public MyBeanWithProperties function() {
        return new MyBeanWithPropertiesImpl(name, apellido);
    }

}

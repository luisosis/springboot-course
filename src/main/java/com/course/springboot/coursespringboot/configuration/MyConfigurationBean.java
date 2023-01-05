package com.course.springboot.coursespringboot.configuration;

import com.course.springboot.coursespringboot.bean.MyBean;
import com.course.springboot.coursespringboot.bean.MyBeanImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {

    @Bean
    public MyBean getBean() {
        return new MyBeanImpl();
    }
}

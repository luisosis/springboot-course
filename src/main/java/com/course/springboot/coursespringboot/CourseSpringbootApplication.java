package com.course.springboot.coursespringboot;

import com.course.springboot.coursespringboot.bean.MyBean;
import com.course.springboot.coursespringboot.bean.MyBeanWithProperties;
import com.course.springboot.coursespringboot.component.DependencyFirst;
import com.course.springboot.coursespringboot.pojo.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseSpringbootApplication implements CommandLineRunner {

    Log LOGGER = LogFactory.getLog(CourseSpringbootApplication.class);

    private DependencyFirst dependencyFirst;

    private MyBean myBean;

    private MyBeanWithProperties myBeanWithProperties;

    private User user;

    public CourseSpringbootApplication(
            @Qualifier("dependencyFirstImpl") DependencyFirst dependencyFirst,
            MyBean myBean,
            MyBeanWithProperties myBeanWithProperties,
            User user) {
        this.dependencyFirst = dependencyFirst;
        this.myBean = myBean;
        this.myBeanWithProperties = myBeanWithProperties;
        this.user = user;
    }

    public static void main(String[] args) {
        SpringApplication.run(CourseSpringbootApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        dependencyFirst.greeting();
        myBean.print();
        System.out.println(myBeanWithProperties.function());
        System.out.println(user.toString());
        LOGGER.info("este es un log info");
        LOGGER.error("este es un log error");
        LOGGER.debug("este es un log debug");
    }
}

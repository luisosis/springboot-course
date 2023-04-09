package com.course.springboot.coursespringboot;

import com.course.springboot.coursespringboot.bean.MyBean;
import com.course.springboot.coursespringboot.bean.MyBeanWithProperties;
import com.course.springboot.coursespringboot.component.DependencyFirst;
import com.course.springboot.coursespringboot.pojo.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseSpringbootApplication implements CommandLineRunner {

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
    }
}

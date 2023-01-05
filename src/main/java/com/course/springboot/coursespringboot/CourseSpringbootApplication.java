package com.course.springboot.coursespringboot;

import com.course.springboot.coursespringboot.bean.MyBean;
import com.course.springboot.coursespringboot.component.DependencyFirst;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseSpringbootApplication implements CommandLineRunner {

    private DependencyFirst dependencyFirst;

    private MyBean myBean;

    public CourseSpringbootApplication(
            @Qualifier("dependencyFirstImpl") DependencyFirst dependencyFirst,
            MyBean myBean) {
        this.dependencyFirst = dependencyFirst;
        this.myBean = myBean;
    }

    public static void main(String[] args) {
        SpringApplication.run(CourseSpringbootApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        dependencyFirst.greeting();
        myBean.print();
    }
}

package com.course.springboot.coursespringboot;

import com.course.springboot.coursespringboot.component.DependencyFirst;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseSpringbootApplication implements CommandLineRunner {

    private DependencyFirst dependencyFirst;

    public CourseSpringbootApplication(DependencyFirst dependencyFirst) {
        this.dependencyFirst = dependencyFirst;
    }

    public static void main(String[] args) {
        SpringApplication.run(CourseSpringbootApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        dependencyFirst.greeting();
    }
}

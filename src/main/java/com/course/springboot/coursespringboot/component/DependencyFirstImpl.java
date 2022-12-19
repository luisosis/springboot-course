package com.course.springboot.coursespringboot.component;


import org.springframework.stereotype.Component;

@Component
public class DependencyFirstImpl implements DependencyFirst {
    @Override
    public void greeting() {
        System.out.println("greeting from first");
    }
}

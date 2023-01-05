package com.course.springboot.coursespringboot.component;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
@Component
public class DependencyTwoImpl implements DependencyFirst {

    @Override
    public void greeting() {
        System.out.println("greeting from two");
    }
}

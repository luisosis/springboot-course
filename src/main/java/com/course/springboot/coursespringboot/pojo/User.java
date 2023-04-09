package com.course.springboot.coursespringboot.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@Getter
@Setter
@AllArgsConstructor
@ToString
@ConstructorBinding
@ConfigurationProperties(prefix = "user")
public class User {
    private String email;
    private String password;
    private Integer age;
}

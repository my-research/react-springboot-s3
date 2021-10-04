package com.my.s3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringS3Application {
    private static final String APPLICATION_LOCATION = "spring.config.location=" +
            "classpath:application.yml," +
            "classpath:aws.yml";
    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringS3Application.class)
                .properties(APPLICATION_LOCATION)
                .run(args);
    }

}

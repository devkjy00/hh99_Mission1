package com.jy.mission1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Mission1Application {

    public static void main(String[] args) {
        SpringApplication.run(Mission1Application.class, args);
    }

}

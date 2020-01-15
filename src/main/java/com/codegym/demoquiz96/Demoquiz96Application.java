package com.codegym.demoquiz96;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.codegym.demoquiz96.repository")
@EntityScan("com.codegym.demoquiz96")
public class Demoquiz96Application {

    public static void main(String[] args) {
        SpringApplication.run(Demoquiz96Application.class, args);
    }

}

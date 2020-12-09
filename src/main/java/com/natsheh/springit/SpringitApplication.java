package com.natsheh.springit;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SpringitApplication {

    public static void main(String[] args) {
        log.debug("Welcome to Springit!");
        SpringApplication.run(SpringitApplication.class, args);
        System.out.println(("Welcome to Springit!"));
    }

}
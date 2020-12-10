package com.natsheh.springit;

import com.natsheh.springit.config.SpringitProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Slf4j
@EnableConfigurationProperties(SpringitProperties.class) // to enable custom properties.
public class SpringitApplication {

    @Autowired
    private SpringitProperties springProperties;

    public static void main(String[] args) {
        SpringApplication.run(SpringitApplication.class, args);
    }

    @Bean
    CommandLineRunner runner() {
        return args -> {
            System.out.println(springProperties.getWelcomeMessage());
        };
    }

}
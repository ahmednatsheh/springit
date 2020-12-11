package com.natsheh.springit;

import com.natsheh.springit.config.SpringitProperties;
import com.natsheh.springit.model.Comment;
import com.natsheh.springit.model.Link;
import com.natsheh.springit.repository.CommentRepository;
import com.natsheh.springit.repository.LinkRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@EnableConfigurationProperties(SpringitProperties.class)
@Slf4j
public class SpringitApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringitApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(LinkRepository linkRepository, CommentRepository commentRepository) {
        return args -> {
            Link link = new Link("Getting started with spring boot 2", "https://ahmednatsheh.com/spring-boot-2");
            linkRepository.save(link);

            Comment comment = new Comment("This spring boot 2 link is awesome!", link);
            commentRepository.save(comment);

            link.addComment(comment);
        };
    }

}
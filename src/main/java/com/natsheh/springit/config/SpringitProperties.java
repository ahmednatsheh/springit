package com.natsheh.springit.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties("springit") // prefix
public class SpringitProperties {

    /**
     *  This is my welcome message.
     */

    private String welcomeMessage;

}

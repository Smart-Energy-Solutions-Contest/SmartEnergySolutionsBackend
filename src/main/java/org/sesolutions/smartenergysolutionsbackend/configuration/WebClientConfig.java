package org.sesolutions.smartenergysolutionsbackend.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {
    @Bean
    public WebClient webClient() {
        return WebClient.builder()
                .baseUrl(System.getProperty("SOLAR_API"))
                .defaultHeader("Authorization", System.getProperty("BEARER_TOKEN"))
                .defaultHeader("Content-Type", "application/json")
                .build();
    }
}

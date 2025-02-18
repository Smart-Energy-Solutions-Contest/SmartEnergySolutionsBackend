package org.sesolutions.smartenergysolutionsbackend.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {
    @Bean
    public WebClient webClient() {
        return WebClient.builder()
                .baseUrl("https://api.solcast.com.au/data/historic/radiation_and_weather")
                .defaultHeader("Authorization", "Bearer 7FkbI7yN0lXtgvviQVvfAUlUnWoy2fFp")
                .defaultHeader("Content-Type", "application/json")
                .build();
    }
}

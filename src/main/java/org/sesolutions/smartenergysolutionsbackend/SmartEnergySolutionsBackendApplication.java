package org.sesolutions.smartenergysolutionsbackend;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmartEnergySolutionsBackendApplication {
    public static void main(String[] args) {
        Dotenv dotenv = Dotenv.load();
        System.setProperty("DATABASE_URL", dotenv.get("DATABASE_URL"));
        System.setProperty("DATABASE_USER", dotenv.get("DATABASE_USER"));
        System.setProperty("DATABASE_PASSWORD", dotenv.get("DATABASE_PASSWORD"));
        System.setProperty("SOLAR_API", dotenv.get("SOLAR_API"));
        System.setProperty("BEARER_TOKEN", dotenv.get("BEARER_TOKEN"));

        SpringApplication.run(SmartEnergySolutionsBackendApplication.class, args);
    }
}

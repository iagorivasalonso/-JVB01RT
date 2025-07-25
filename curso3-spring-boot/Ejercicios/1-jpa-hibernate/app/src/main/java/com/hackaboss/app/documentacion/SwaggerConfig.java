package com.hackaboss.app.documentacion;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenApi() {

        return new OpenAPI().info( new Info()
                .title("API de cursos")
                .version("0.0.1")
                .description("Crea curos y temas")
        );
    }

}

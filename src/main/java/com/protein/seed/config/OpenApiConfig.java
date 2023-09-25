package com.protein.seed.config;


import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.tags.Tag;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.stream.Stream;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("seed app")
                                .version("1.0.0")
                                .description("seed app part of project protein")
                                .contact(
                                        new Contact()
                                                .name("Zeeshan")
                                                .email("zeeshanshaikhonline@gmail.com")
                                                .url("https://github.com/proteinshaikh")
                                )

                )
                .components(
                        new Components()
                                .addSecuritySchemes(
                                        "bearer-jwt",
                                        new SecurityScheme()
                                                .type(SecurityScheme.Type.HTTP)
                                                .scheme("bearer")
                                                .bearerFormat("JWT")
                                                .in(SecurityScheme.In.HEADER)
                                                .name("Authorization")
                                                .description("JWT token for authentication")
                                )
                )  // add the security scheme
                .addSecurityItem(
                        new SecurityRequirement()
                                .addList("bearer-jwt")
                ) // indicate the API uses this scheme
                .tags(
                        Stream.of(
                                        new Tag().name("User").description("Operations related to User management"),
                                        new Tag().name("Product").description("Operations related to Product management")
                                )
                                .toList()
                );
    }
}


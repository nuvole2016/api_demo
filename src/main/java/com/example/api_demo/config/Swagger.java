package com.example.api_demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class Swagger {

    @Bean
    public Docket controllerApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder()
                        .title("demo api")
                        .description("demo for apis")
                        .version("0.0")
                        .build())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.api_demo.controller"))
                .paths(PathSelectors.any())
                .build();
    }


}


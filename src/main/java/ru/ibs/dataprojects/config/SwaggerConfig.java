package ru.ibs.dataprojects.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
/**
 * @author Timur Khidirov on 23.11.2021
 */

public class SwaggerConfig {
    @Configuration
    class SwaggerConfiguration {
        @Bean
        public Docket api() {
            return new Docket(DocumentationType.SWAGGER_2)
                    .select()
                    .apis(RequestHandlerSelectors.basePackage("ru.ibs.dataprojects.controller"))
                    .paths(PathSelectors.any())
                    .build();
        }
    }
}
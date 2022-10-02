package com.assignment.InstaIndex.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.auditing.DateTimeProvider;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.GregorianCalendar;
import java.util.Optional;
import java.util.TimeZone;

/**
 * This is configuration class for swagger.
 * @author Karan
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.assignment.InstaIndex.controller"))
                .paths(PathSelectors.regex("/.*"))
                .build();
    }

 /*   @Bean
    public DateTimeProvider utcDateTimeProvider() {
        return () -> Optional.of(LocalDateTime.now(ZoneOffset.UTC));
    }*/

}

package com.example.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

//    @Bean
//    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route(
//                        r -> r.path("/test").
//                        uri("http://localhost:10002/test")
//                )
//                .route(
//                        r -> r.path("/home").
//                                uri("http://localhost:10002/home")
//                )
//                .build();
//    }
}

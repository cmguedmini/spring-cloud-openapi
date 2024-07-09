package com.erkndmrl.swagger3;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "API Gateway", version = "1.0", description = "Documentation API Gateway v1.0"))
public class ApiGatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayServiceApplication.class, args);
	}


	@Bean
	public RouteLocator routeLocator(RouteLocatorBuilder builder) {
		return builder
				.routes()
				.route(r -> r.path("/v3/api-docs").and().method(HttpMethod.GET).uri("http://localhost:8080"))
				.route(r -> r.path("/category-service/v3/api-docs").and().method(HttpMethod.GET).uri("http://localhost:5000"))
				.route(r -> r.path("/product-service/v3/api-docs").and().method(HttpMethod.GET).uri("http://localhost:5001"))
				.build();
	}

}

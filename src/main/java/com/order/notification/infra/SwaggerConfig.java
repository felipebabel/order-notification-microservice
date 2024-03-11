package com.order.notification.infra;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI apiDoc() {
        return new OpenAPI()
            .info(new Info()
                .title("Order Notification Microsservice")
                .version("v1")
                .description("REST API Order Notification microsservice")
            );
    }

}

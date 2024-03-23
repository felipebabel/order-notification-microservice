package com.order.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OrderNotificationApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderNotificationApplication.class, args);
	}

}

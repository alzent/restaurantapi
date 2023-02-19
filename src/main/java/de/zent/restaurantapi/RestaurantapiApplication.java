package de.zent.restaurantapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RestaurantapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantapiApplication.class, args);
	}

	@RequestMapping("/")
	String sayHello() {
		return "Hello Azure 25!";
	}
	
	@RequestMapping("/hello")
	String sayHello2() {
		return "Hello Alex!";
	}
}

package de.zent.restaurantapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class RestaurantapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantapiApplication.class, args);
		//addShutdownHook();
	}

	/*
	
	@RequestMapping("/")
	String sayHello() {
		return "Hello Azure 25!";
	}
	
	@RequestMapping("/hello")
	String sayHello2() {
		return "Hello Alex!";
	}
	
	*/
	
	private static void addShutdownHook()
	{
		Runtime.getRuntime().addShutdownHook(new Thread() {
	        @Override
	            public void run() {
	                System.out.println("Inside Add Shutdown Hook");
	            }   
	        }); 

	        System.out.println("Shut Down Hook Attached.");	
	}
}

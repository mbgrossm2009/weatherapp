

package com.example.weatherApp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;



@SpringBootApplication
public class WeatherAppApplication {

	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(WeatherAppApplication.class, args);
	}

}














// package com.example.weatherApp;

// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication
// public class WeatherAppApplication {

// 	public static void main(String[] args) {
// 		SpringApplication.run(WeatherAppApplication.class, args);
// 	}

// }

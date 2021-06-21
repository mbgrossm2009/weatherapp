package com.example.weatherApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
public class ApiController {

    @Autowired
    private RestTemplate restTemplate;

    public static String url = "https://api.weather.gov/points/39.7456,-97.0892";

    @GetMapping("/weather")
    public List<Object> getWeather() {

        Object[] weather = restTemplate.getForObject(url, Object[].class);
        
         List<Object> obj =  Arrays.asList(weather);
         System.out.println("Result :: "+obj);
        return obj;
        // return Arrays.asList(weather);

    }
}
package edu.sjsu.assasins.hotelbooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EnableMongoRepositories
public class HotelBookingApplication {

    public static void main(String[] args) {
        SpringApplication.run(edu.sjsu.assasins.hotelbooking.HotelBookingApplication.class, args);
    }
}
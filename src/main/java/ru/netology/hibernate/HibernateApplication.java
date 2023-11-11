package ru.netology.hibernate;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(HibernateApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}

}

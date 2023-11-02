package ru.netology.Hibernate;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@SpringBootApplication
public class HibernateApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(HibernateApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}

}

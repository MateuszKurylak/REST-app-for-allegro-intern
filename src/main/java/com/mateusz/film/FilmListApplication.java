package com.mateusz.film;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.mateusz.film.repository")
@SpringBootApplication
public class FilmListApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilmListApplication.class, args);
	}
}

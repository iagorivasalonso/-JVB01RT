package com.hackaboss.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

}

/*
eventos.add(new evento(1L, "fiestaVerano", "ddd", LocalDate.of(2025, 6, 30), LocalTime.of(20, 30)));
eventos.add(new evento(2L, "conciertoRock", "música en vivo", LocalDate.of(2025, 7, 10), LocalTime.of(19, 0)));
eventos.add(new evento(3L, "feriaGastronomica", "comida internacional", LocalDate.of(2025, 8, 5), LocalTime.of(12, 0)));
eventos.add(new evento(4L, "maratonCiudad", "evento deportivo", LocalDate.of(2025, 9, 15), LocalTime.of(8, 30)));
eventos.add(new evento(5L, "nocheCine", "proyección al aire libre", LocalDate.of(2025, 7, 25), LocalTime.of(21, 15)));


 */
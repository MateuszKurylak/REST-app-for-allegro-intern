package com.mateusz.film.repository;

import com.mateusz.film.model.Films;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmsRepository extends JpaRepository<Films, Integer> {
}

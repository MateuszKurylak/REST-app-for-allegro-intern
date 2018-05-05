package com.mateusz.film.resource;

import com.mateusz.film.model.Films;
import com.mateusz.film.repository.FilmsRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/films")
public class FilmsResource {

	@Autowired
	FilmsRepository filmsRepository;
	
	@GetMapping(value = "/{id}")
	public Films getOneFilm(@PathVariable Integer id) {
		return filmsRepository.findOne(id);
	}
	
	@GetMapping(value = "/all")
	public List<Films> getAll() {
		return filmsRepository.findAll();
	}

	@PostMapping(value = "/load")
	public List<Films> persist(@RequestBody final Films films) {
		filmsRepository.save(films);
		return filmsRepository.findAll();
	}
	
}
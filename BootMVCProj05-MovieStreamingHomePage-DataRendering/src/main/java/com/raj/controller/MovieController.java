package com.raj.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.raj.model.Movie;

@Controller
public class MovieController {

	@GetMapping("/")
	public String showMovieDetails(Model model) {

		List<Movie> movieList = new ArrayList<>();

		movieList.add(new Movie(111, "Inception", "Sci-Fi", 8.8, "English"));
		movieList.add(new Movie(222, "RRR", "Action", 8.2, "Telugu"));
		movieList.add(new Movie(333, "Broder-2", "Sci-Fi", 7.8, "Hindi"));

		model.addAttribute("movies", movieList);

		return "movie-list";
	}
}

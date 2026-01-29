package com.raj.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Movie {
    
	private Integer movieId;
	private String title;
	private String genre;
	private Double rating;
	private String language;
	
}

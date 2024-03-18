package com.movieapp.service;

import java.util.Arrays;
import java.util.List;

public class MovieDetails {
	public List<String> showMovieDetails(String language) {
		
		if(language.equalsIgnoreCase("Bollwood")) return Arrays.asList("Up","Avataar");
		  else	if(language.equalsIgnoreCase("Hollywood")) return Arrays.asList("Up and Down","Avataar");
		  else	if(language.equalsIgnoreCase("Sandalwood")) return Arrays.asList("Array","Avataar");
		  else	return Arrays.asList("Down","Avataar");
	}

}

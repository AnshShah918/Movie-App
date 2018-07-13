package com.stackroute.movieapp.services;

import java.util.Optional;

import com.stackroute.movieapp.domain.Movie;

public interface MovieService {
	public Movie saveMovie(Movie movie);
	
	public Iterable<Movie> getAllMovie();
	
	public void deleteMovie(int id);
	
	public Movie updateMovie(Movie movie , int id);
	
	public Optional<Movie> getByMovieId(int id);
	
	public Iterable<Movie> getByName(String name);
}

package com.stackroute.movieapp.services;

import java.util.Optional;

import com.stackroute.movieapp.domain.Movie;
import com.stackroute.movieapp.exception.MovieAlreadyExist;
import com.stackroute.movieapp.exception.MovieNotFound;

public interface MovieService {
	public Movie saveMovie(Movie movie)throws MovieAlreadyExist;
	
	public Iterable<Movie> getAllMovie();
	
	public void deleteMovie(int id);
	
	public Movie updateMovie(Movie movie , int id);
	
	public Optional<Movie> getByMovieId(int id) throws MovieNotFound;
	
	public Iterable<Movie> getByName(String name);
}

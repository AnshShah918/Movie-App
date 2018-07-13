package com.stackroute.movieapp.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.movieapp.domain.Movie;
import com.stackroute.movieapp.repositories.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {
	
	private MovieRepository movieRepository;
	
	@Autowired
	public MovieServiceImpl(MovieRepository movieRepository) {
		this.movieRepository = movieRepository;
	}

	public Movie saveMovie(Movie movie) {
		return movieRepository.save(movie);
	}
	
	public Iterable<Movie> getAllMovie(){
		return movieRepository.findAll();
	}
	
	public void deleteMovie(int id) {
		movieRepository.deleteById(id);
	}

	public Movie updateMovie(Movie movie, int id) {
		movie.setId(id);
		movieRepository.save(movie);
		return movie;
	}

	public Optional<Movie> getByMovieId(int id) {
		return movieRepository.findById(id);
	}

	@Override
	public Iterable<Movie> getByName(String name) {
		return movieRepository.getByName(name);
	}
	
	
}

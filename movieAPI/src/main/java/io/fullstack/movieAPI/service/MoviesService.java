package io.fullstack.movieAPI.service;

import io.fullstack.movieAPI.model.Movie;

import java.util.List;

public interface MoviesService {
    List<Movie> getAllMovies();
    Movie saveMovie(Movie movie);

}

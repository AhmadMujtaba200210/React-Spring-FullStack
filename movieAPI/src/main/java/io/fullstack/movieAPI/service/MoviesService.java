package io.fullstack.movieAPI.service;

import io.fullstack.movieAPI.model.Movie;
import org.bson.types.ObjectId;

import java.util.List;
import java.util.Optional;

public interface MoviesService {
    List<Movie> getAllMovies();
    Movie saveMovie(Movie movie);
    Optional<Movie> getMovie(ObjectId movieId);

}

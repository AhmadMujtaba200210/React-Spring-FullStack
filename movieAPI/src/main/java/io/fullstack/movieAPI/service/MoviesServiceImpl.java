package io.fullstack.movieAPI.service;

import io.fullstack.movieAPI.model.Movie;
import io.fullstack.movieAPI.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MoviesServiceImpl implements MoviesService{
    private final MovieRepository movieRepository;
    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie);
    }

}

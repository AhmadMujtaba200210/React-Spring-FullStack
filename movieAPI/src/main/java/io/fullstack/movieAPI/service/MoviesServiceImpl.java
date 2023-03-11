package io.fullstack.movieAPI.service;

import io.fullstack.movieAPI.model.Movie;
import io.fullstack.movieAPI.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Optional<Movie> getMovie(ObjectId movieName) {
        return movieRepository.findById(movieName);
    }

}

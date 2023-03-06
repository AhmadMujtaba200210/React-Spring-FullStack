package io.fullstack.movieAPI.controller;

import io.fullstack.movieAPI.model.Movie;
import io.fullstack.movieAPI.service.MoviesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/movies/")
public class MovieController {
    private final MoviesService moviesService;
    @GetMapping("getAllMovies")
    public ResponseEntity<List<Movie>> allMovies(){
        return new ResponseEntity<List<Movie>>(moviesService.getAllMovies(), HttpStatus.OK);
    }

    @PostMapping("saveMovie")
    public ResponseEntity<Movie> saveMovie(@RequestBody Movie movie){
        return new ResponseEntity<Movie>(moviesService.saveMovie(movie),HttpStatus.OK);
    }
}

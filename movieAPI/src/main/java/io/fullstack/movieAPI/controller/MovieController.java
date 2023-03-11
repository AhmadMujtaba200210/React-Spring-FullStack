package io.fullstack.movieAPI.controller;

import io.fullstack.movieAPI.model.Movie;
import io.fullstack.movieAPI.service.MoviesService;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/movies/")
public class MovieController {
    private final MoviesService moviesService;
    @GetMapping("getAllMovies")
    public ResponseEntity<List<Movie>> allMovies(){
        return new ResponseEntity<>(moviesService.getAllMovies(), HttpStatus.OK);
    }

    @PostMapping("saveMovie")
    public ResponseEntity<Movie> saveMovie(@RequestBody Movie movie){
        return new ResponseEntity<>(moviesService.saveMovie(movie), HttpStatus.OK);
    }

    @GetMapping("getMovie/{objectId}")
    public ResponseEntity<Optional<Movie>> getMovie(@PathVariable ObjectId objectId){
        return new ResponseEntity<>(this.moviesService.getMovie(objectId), HttpStatus.OK);
    }
}



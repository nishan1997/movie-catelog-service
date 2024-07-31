package com.nishan1997.movie_catelog_service.contoller;

import com.nishan1997.movie_catelog_service.entity.Movie;
import com.nishan1997.movie_catelog_service.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("movie-info")
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;

    @PostMapping("/save")
    public List<Movie> createMovie(@RequestBody List<Movie> movies){
        return movieRepository.saveAll(movies);
    }

    @GetMapping("/list")
    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

    @GetMapping("/find-path-by-id/{movieInfoId}")
    public String findPathById(@PathVariable("movieInfoId") Integer movieInfoId){
     Movie m=movieRepository.findById(movieInfoId).orElseGet(null);
     return m.getPath();
    }
}

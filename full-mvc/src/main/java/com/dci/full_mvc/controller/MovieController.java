package com.dci.full_mvc.controller;

import com.dci.full_mvc.model.Movie;
import com.dci.full_mvc.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/movies")
public class MovieController {

    private final MovieRepository movieRepository;

//    dependancy injection
//    injecting the movie repository bean
    @Autowired
    public MovieController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @GetMapping
    public String allMovies(Model model){

        model.addAttribute("movies",movieRepository.findAll());
        return "movies/movies-list";
    }

    @GetMapping("/{id}")
    public String getMovieById(@PathVariable Long id,Model model){
        model.addAttribute("movie",movieRepository.findById(id));
        return "movies/movie-details";
    }


    @GetMapping("/new")
    public String createMovie(Model model){

        model.addAttribute("movie", new Movie());

        return "movies/movie-form";
    }

    @PostMapping("/create")
    public String createNewMovie(@ModelAttribute Movie movie, Model model){
        Movie createdMovie = movieRepository.save(movie);
        return "redirect:/movies/" + createdMovie.getId();
    }




}

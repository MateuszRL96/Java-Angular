package com.example.movielibrary;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieController 
{
    //C:\Users\matik\Documents\GitHub\Java-Angular\SpringCRUD

    @Autowired
    MovieRepostory movieRepostory;

    /*@GetMapping("/test")
    public int test()
    {
        return 1;
    } */
    

    @GetMapping("/students")
    public List<Movies> getAll()
    {
        return //"home";
        movieRepostory.getAll();
    }

@ModelAttribute(name= "home")

     @GetMapping("/kot")
    public String showIndex() {
        // Pobierz dane z bazy danych i przekaż do widoku Thymeleaf
       //model.addAttribute("home");
    return "home";
    }




    

	
    





    @GetMapping("/{id}")
    public Movies getById(@PathVariable("id") int id)
    {
        return movieRepostory.getById(id);
    }

    @PostMapping("")
    public int add(@RequestBody List<Movies> movies)
    {
        return movieRepostory.save(movies);
    }

    @PutMapping("/{id}")
    public int update(@PathVariable("id") int id, @RequestBody Movies updatedMovie) {
        Movies movie = movieRepostory.getById(id);

        if (movie != null) {
            movie.setMovie(updatedMovie.getMovie());
            movie.setRating(updatedMovie.getRating());

            movieRepostory.update(movie);

            return 1;
        } else {
            return -1;
        }
    }

    @PatchMapping("/{id}")
    public int partiallyUpdate(@PathVariable("id") int id, @RequestBody Movies updatedMovie) {
        Movies movie = movieRepostory.getById(id);

        if (movie != null) {
            if (updatedMovie.getMovie() != null) movie.setMovie(updatedMovie.getMovie());
            if (updatedMovie.getRating() > 0) movie.setRating(updatedMovie.getRating());

            movieRepostory.update(movie);

            return 1;
        } else {
            return -1;
        }
    }

    @DeleteMapping("/{id}")
    public int delete(@PathVariable("id") int id) {
        return movieRepostory.delete(id);
    }
}

package com.example.movielibrary.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.movielibrary.Movies;
import com.example.movielibrary.Repository.MovieRepostory;

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
    

    @GetMapping("/")
    public List<Movies> getAll()
    {
        return movieRepostory.getAll();
    }

    @GetMapping("/{id}")
    public Movies getById(@PathVariable("id") int id)
    {
        return movieRepostory.getById(id);
    }
}

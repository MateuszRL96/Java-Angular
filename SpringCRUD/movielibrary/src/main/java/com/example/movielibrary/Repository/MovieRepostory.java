package com.example.movielibrary.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.movielibrary.Movies;

@Repository
public class MovieRepostory {
    
    @Autowired
    JdbcTemplate jdbcTemplate;


    public List<Movies> getAll()
    {
        return jdbcTemplate.query("select id, movies, rating FROM movie",
        BeanPropertyRowMapper.newInstance(Movies.class));

    }

    public Movies getById(int id)
    {
        return jdbcTemplate.queryForObject("SELECT id, movies, rating FROM movie WHERE " + "id = ?",
         BeanPropertyRowMapper.newInstance(Movies.class), id);
    }
    
}

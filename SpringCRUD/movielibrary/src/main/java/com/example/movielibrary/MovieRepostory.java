package com.example.movielibrary;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

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

    public int save(List<Movies> movies) {
        movies.forEach(movie -> jdbcTemplate
        .update("INSERT INTO movie(id, movies, rating) VALUES(?, ?, ?)",
        movie.getId(),
        movie.getMovie(),
        movie.getRating()
        ));
        return 1;
    }

    
    public int update(Movies movie) {
        return jdbcTemplate.update("UPDATE movie SET movies=?, rating=? WHERE id=?",
                movie.getMovie(), movie.getRating(), movie.getId());
    }

    public int delete(int id) {
        return jdbcTemplate.update("DELETE FROM movie WHERE id=?", id);
    }
    
}

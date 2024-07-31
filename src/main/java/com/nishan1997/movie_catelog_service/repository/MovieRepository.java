package com.nishan1997.movie_catelog_service.repository;

import com.nishan1997.movie_catelog_service.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Integer> {
}

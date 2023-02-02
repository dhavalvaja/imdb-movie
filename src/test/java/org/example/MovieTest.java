package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MovieServiceTest {
    Movie kgf;
    Movie kgf2;
    Movie kgf3;
    List<Movie> movies;
    MovieService movieService;
    Director d1;
        List<String> genres;
    @Test
    void g(){
        String hello = "hello";
        assertEquals("hello", hello);
    }
    @BeforeEach
    void setUp() {
        d1 = new Director("Prashant Neel",50);
        genres = List.of("Action");
        kgf = new Movie("KGF",List.of(d1),genres,8.7);
        kgf2 = new Movie("KGF2", List.of(d1),genres,9.2);
        kgf3 = new Movie("KGF3", List.of(d1),genres,7.0);
        movies = List.of(kgf, kgf2, kgf3);
        movieService = new MovieService();
    }
    @Test
    @DisplayName("Sort by rating")
    void sort_by_rating(){
        List<Movie> sortedMovies =  movieService.sortByRating(movies);
        List<Movie> expextedList = List.of(kgf3, kgf, kgf2);
        Assertions.assertThat(sortedMovies).containsExactlyElementsOf(expextedList);
    }

    @Test
    void test_count (){
        d1 = new Director("Prashant Neel",21);
        kgf2 = new Movie("KGF2", List.of(d1), genres, 9.2);
        movies = List.of(kgf, kgf2, kgf3);
        Map<String, Long> count = movieService.getCount(movies);
        Assertions.assertThat(count.get("Prashant Neel")).isEqualTo(3);
        Assertions.assertThat(count.get("Neel")).isEqualTo(null);
        movieService.getGenresCount();
    }
}
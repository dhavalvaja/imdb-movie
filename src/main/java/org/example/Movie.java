package org.example;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Objects;

public class Movie {
    private String name;
    private List<Director> directors;
    private List<String> genres;

    private double rating;

    public Movie(String name, List<Director> directors, List<String> genres, Double aDouble) {
        this.name = name;
        this.directors = directors;
        this.genres = genres;
    }

    public Movie(String name, List<Director> directors, List<String> genres, double rating) {
        this.name = name;
        this.directors = directors;
        this.genres = genres;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Director> getDirectors() {
        return directors;
    }

    public void setDirectors(List<Director> directors) {
        this.directors = directors;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", directors=" + directors +
                ", genres=" + genres +
                ", rating=" + rating +
                '}';
    }
}

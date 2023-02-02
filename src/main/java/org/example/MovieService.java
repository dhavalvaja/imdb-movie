package org.example;

import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.stream.Collectors;

public class MovieService {

    public List<Movie> sortByRating(@NotNull List<Movie> movies) {
        Comparator<Movie> ratingComparator = Comparator.comparingDouble(Movie::getRating);
        return movies.stream().sorted(ratingComparator).toList();
    }

    public Map<String, Long> getCount(@NotNull List<Movie> movies) {
        return movies.stream()
                .map(Movie::getDirectors)
                .flatMap(List::stream)
                .collect(Collectors.groupingBy(Director::getName,Collectors.counting())
                );
    }


    public void getGenresCount() {
        throw new UnsupportedOperationException();
    }
}

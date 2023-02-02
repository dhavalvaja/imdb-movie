package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("avatar",
                List.of(new Director("a",21)),
                Arrays.asList("a","c","b"),
                4.8
        );
        System.out.println(movie);
    }
}
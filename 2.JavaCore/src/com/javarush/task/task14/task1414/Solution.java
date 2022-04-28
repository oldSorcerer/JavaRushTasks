package com.javarush.task.task14.task1414;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
MovieFactory
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
           String string;
           while ((string = reader.readLine()) != null) {
               Movie movie = MovieFactory.getMovie(string);
               if (movie == null) {
                   return;
               }
               System.out.println(movie.getClass().getSimpleName());
           }
       }
    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            return switch (key) {
                case "soapOpera" -> new SoapOpera();
                case "cartoon" -> new Cartoon();
                case "thriller" -> new Thriller();
                default -> null;
            };
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie {
    }

    static class Thriller extends Movie {
    }
}

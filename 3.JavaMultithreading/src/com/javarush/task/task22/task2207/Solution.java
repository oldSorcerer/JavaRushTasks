package com.javarush.task.task22.task2207;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Обращенные слова
*/

public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {

        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader reader = new BufferedReader(new FileReader(console.readLine()))) {

            List<String> list = new ArrayList<>();

            while (reader.ready()) {
                list.addAll(Arrays.asList(reader.readLine().split(" ")));
            }

            for (int i = 0; i < list.size(); i++) {
                for (int j = i + 1; j < list.size();j++ ) {
                    StringBuilder builder = new StringBuilder(list.get(i));
                    if (builder.reverse().toString().equals(list.get(j))) {
                        Pair pair = new Pair();
                        pair.first = list.get(i);
                        pair.second = list.get(j);

                        result.add(pair);
                        list.remove(j);
                        list.remove(i);
                        i--;
                        break;
                    }
                }
            }
        }

        result.forEach(System.out::println);
    }

    public static class Pair {
        String first;
        String second;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                    first == null ? second :
                            second == null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
/*
валидатор дятел
выпил пива
а дятел ротадилав
еще пива липыв
а валидатор всерамно летяд
азза еще

валидатор ротадилав
дятел летяд
выпил липыв
а а
еще еще
*/
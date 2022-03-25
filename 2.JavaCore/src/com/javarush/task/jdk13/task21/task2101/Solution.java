package com.javarush.task.jdk13.task21.task2101;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* 
Equals and HashCode
*/

public class Solution {
    private final String first;
    private final String last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Solution solution = (Solution) o;
        return first.equals(solution.first) && last.equals(solution.last);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, last);
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Donald", "Duck"));
        System.out.println(s.contains(new Solution("Donald", "Duck")));
    }
}

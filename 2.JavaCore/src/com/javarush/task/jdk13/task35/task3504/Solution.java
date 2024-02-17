package com.javarush.task.jdk13.task35.task3504;

import java.util.HashMap;
import java.util.LinkedHashMap;

/* 
Простой generics
*/

public class Solution<T extends HashMap<?, ?>> {

    private final T map;

    public Solution(T map) {
        this.map = map;
    }

    public T getMap() {
        return map;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("string", 4);
        Solution<HashMap<String, Integer>> solution = new Solution<>(hashMap);
        HashMap<?, ?> mapFromSolution = solution.getMap();
        System.out.println(mapFromSolution.getClass());

        LinkedHashMap<Solution<?>, Solution<?>> hashMap2 = new LinkedHashMap<>();
        hashMap2.put(solution, solution);
        Solution<?> solution2 = new Solution<>(hashMap2);
        LinkedHashMap<?, ?> mapFromSolution2 = (LinkedHashMap<?, ?>) solution2.getMap();   //need to cast  :(
        System.out.println(mapFromSolution2.getClass());
    }
}

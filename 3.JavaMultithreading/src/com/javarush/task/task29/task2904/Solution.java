package com.javarush.task.task29.task2904;

/* 
Особенности автобоксинга
*/

public class Solution {
    private final Integer[] array = new Integer[]{1, 2, 3, 4};

    public static void main(String[] args) {
        Number value1 = new Solution().getValueByIndex(5); //-1.0, class java.lang.Double expected
        Number value2 = new Solution().getValueByIndex(2); //3, class java.lang.Integer expected

        System.out.println(value1 + ", " + value1.getClass().toString());
        System.out.println(value2 + ", " + value2.getClass().toString());
    }

    Number getValueByIndex(int index) {
        if (index >= 0 && index < array.length) {
            return array[index];
        } else {
            return (double) -1;
        }
    }
}

package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private int q;
        private String q1;
        private char q2;
        private boolean q3;
        private Human q4;
        private byte q5;

        public Human() {

        }

        public Human(int q, String q1, char q2, boolean q3, Human q4, byte q5) {
            this.q = q;
            this.q1 = q1;
            this.q2 = q2;
            this.q3 = q3;
            this.q4 = q4;
            this.q5 = q5;
        }

        public Human(int q, String q1, char q2, boolean q3, Human q4) {
            this.q = q;
            this.q1 = q1;
            this.q2 = q2;
            this.q3 = q3;
            this.q4 = q4;
        }

        public Human(int q, String q1, char q2, boolean q3) {
            this.q = q;
            this.q1 = q1;
            this.q2 = q2;
            this.q3 = q3;
        }

        public Human(int q, String q1, char q2) {
            this.q = q;
            this.q1 = q1;
            this.q2 = q2;
        }

        public Human(int q, String q1) {
            this.q = q;
            this.q1 = q1;
        }

        public Human(int q) {
            this.q = q;
        }

        public Human(String q1, char q2, boolean q3, Human q4, byte q5) {
            this.q1 = q1;
            this.q2 = q2;
            this.q3 = q3;
            this.q4 = q4;
            this.q5 = q5;
        }

        public Human(String q1, char q2, boolean q3, Human q4) {
            this.q1 = q1;
            this.q2 = q2;
            this.q3 = q3;
            this.q4 = q4;
        }

        public Human(String q1, char q2, boolean q3) {
            this.q1 = q1;
            this.q2 = q2;
            this.q3 = q3;
        }
    }
}
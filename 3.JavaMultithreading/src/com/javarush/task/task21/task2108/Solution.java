package com.javarush.task.task21.task2108;

/* 
Клонирование растений
*/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Tree tree = new Tree("willow", new String[]{"s1", "s2", "s3", "s4"});
        Tree clone;
        try {
            clone = tree.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(tree);
        System.out.println(clone);

        System.out.println(Arrays.toString(tree.branches));
        System.out.println(Arrays.toString(clone.branches));
    }

    public static class Plant {
        private final String name;

        public Plant(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static class Tree extends Plant implements Cloneable {
        private final String[] branches;

        public Tree(String name, String[] branches) {
            super(name);
            this.branches = branches;
        }

        public String[] getBranches() {
            return branches;
        }

        @Override
        public Tree clone() throws CloneNotSupportedException  {
            return new Tree(getName(), Arrays.copyOf(getBranches(), getBranches().length));
        }
    }
}

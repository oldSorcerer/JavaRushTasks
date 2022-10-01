package com.javarush.task.pro.task13.task1335;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Board {
    private final List<Node> boardNodes = new LinkedList<>(
            Arrays.asList(new Node("snakeTail"), new Node("snakeBody"), new Node("board"), new Node("snakeBody"), new Node("board"),
                    new Node("snakeBody"), new Node("board"), new Node("snakeBody"), new Node("board"), new Node("snakeHead")));

    public List<Node> getBoardNodes() {
        return boardNodes;
    }

    public static class Node {
        private String data;

        public Node(String data) {
            this.data = data;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return data;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return data.equals(node.data);
        }

        @Override
        public int hashCode() {
            return Objects.hash(data);
        }
    }
}
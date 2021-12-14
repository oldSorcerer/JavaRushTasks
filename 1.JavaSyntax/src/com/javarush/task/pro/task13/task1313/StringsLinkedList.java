package com.javarush.task.pro.task13.task1313;

public class StringsLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {

        Node node = new Node();

        if (this.first == null && this.last == null) {
            node.value = value;
        }
        if (this.first != null && this.last == null) {

        }
        if (this.first == null && this.last != null) {

        }
        if (this.first != null && this.last != null) {

        }



    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}

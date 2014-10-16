package org.shekhar.algorithms.ch3.excercises;

/**
 * Created by shekhargulati on 10/16/2014.
 */
public class Problem_1_3_19 {

    private class Node<T> {
        private final T item;
        private Node<T> next;

        private Node(T item) {
            this.item = item;
        }
    }

    public static void main(String[] args) {
        Problem_1_3_19 instance = new Problem_1_3_19();
        Node<String> users = instance.new Node<>("shekhar");
        Node<String> rahul = instance.new Node("rahul");
        users.next = rahul;
        Node<String> sameer = instance.new Node("sameer");
        rahul.next = sameer;

        Node first = users;
        Node secondLast = null;
        while (first.next.next != null) {
            first = first.next;
        }
        secondLast = first;
        System.out.println(secondLast.item);
        secondLast.next = null;

    }
}

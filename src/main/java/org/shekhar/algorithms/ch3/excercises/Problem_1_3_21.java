package org.shekhar.algorithms.ch3.excercises;

/**
 * Created by shekhargulati on 10/16/2014.
 */
public class Problem_1_3_21 {

    private static class Node<T> {
        private final T item;
        private Node<T> next;

        private Node(T item) {
            this.item = item;
        }
    }

    public static <T> boolean contains(Node<T> head, T key) {
        if (head.item == key) {
            return true;
        }

        Node<T> start = head.next;
        while (start != null) {
            if (start.item == key) {
                return true;
            }
            start = start.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Node<String> users = new Node<>("shekhar");
        Node<String> rahul = new Node("rahul");
        users.next = rahul;
        Node<String> sameer = new Node("sameer");
        rahul.next = sameer;

        System.out.println(contains(users, "sameer"));

    }
}

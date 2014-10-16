package org.shekhar.algorithms.ch3.excercises;

/**
 * Created by shekhargulati on 10/16/2014.
 */
public class Problem_1_3_26 {

    private static class Node<T> {
        private T item;
        private Node<T> next;

        private Node(T item) {
            this.item = item;
        }
    }

    public static <T> Node<T> remove(Node<T> head, T key) {
        while (head != null && (head.item == key)) {
            Node<T> temp = head;
            head = head.next;
            temp = null;
        }

        return head;

    }

    public static void main(String[] args) {
        Node<String> users = new Node<>("a");
        Node<String> rahul = new Node("a");
        users.next = rahul;
        Node<String> sameer = new Node("a");
        rahul.next = sameer;
        Node<String> guneet = new Node<>("a");
        sameer.next = guneet;
        guneet.next = new Node<>("b");
        users = remove(users, "a");
        while (users != null) {
            System.out.println(users.item);
            users = users.next;

        }

    }
}

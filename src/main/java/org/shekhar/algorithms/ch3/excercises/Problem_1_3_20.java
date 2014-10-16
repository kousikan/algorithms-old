package org.shekhar.algorithms.ch3.excercises;

/**
 * Created by shekhargulati on 10/16/2014.
 */
public class Problem_1_3_20 {

    private class Node<T> {
        private final T item;
        private Node<T> next;

        private Node(T item) {
            this.item = item;
        }
    }

    public <T> void delete(Node<T> list, int k) {
        int index = 0;
        Node<T> node = list;
        while (node != null && index < k - 1) {
            node = node.next;
            index++;
        }
        if (node != null) {
            System.out.println("kthNode-1 " + node.item);
            node.next = node.next.next;
        }

    }

    public static void main(String[] args) {
        Problem_1_3_20 instance = new Problem_1_3_20();
        Node<String> users = instance.new Node<>("shekhar");
        Node<String> rahul = instance.new Node("rahul");
        users.next = rahul;
        Node<String> sameer = instance.new Node("sameer");
        rahul.next = sameer;

        instance.delete(users, 0);

        Node start = users;
        while (start != null) {
            System.out.println(start.item);
            start = start.next;

        }

    }
}

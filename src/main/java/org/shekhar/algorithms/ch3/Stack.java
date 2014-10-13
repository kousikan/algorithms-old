package org.shekhar.algorithms.ch3;

/**
 * Created by shekhargulati on 10/13/2014.
 */
public class Stack<T> {
    private Node first;
    private int N;

    public boolean isEmpty() {
        return this.N == 0;
    }

    private class Node {
        private T item;
        private Node next;

        private Node(T item) {
            this.item = item;
        }
    }

    public void push(T item) {
        Node oldFirst = this.first;
        this.first = new Node(item);
        this.first.next = oldFirst;
        N++;
    }

    public T pop() {
        T item = this.first.item;
        this.first = this.first.next;
        N--;
        return item;
    }

    public int size() {
        return this.N;
    }


}

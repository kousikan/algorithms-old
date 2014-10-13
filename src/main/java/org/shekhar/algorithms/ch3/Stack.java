package org.shekhar.algorithms.ch3;

import java.util.Iterator;

/**
 * Created by shekhargulati on 10/13/2014.
 */
public class Stack<T> implements Iterable<T> {
    private Node first;
    private int N;

    public boolean isEmpty() {
        return this.N == 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new StackIterator();
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


    private class StackIterator implements Iterator<T> {
        private Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            T item = current.item;
            current = current.next;
            return item;
        }
    }
}

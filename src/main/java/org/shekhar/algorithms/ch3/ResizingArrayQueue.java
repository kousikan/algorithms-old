package org.shekhar.algorithms.ch3;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by shekhargulati on 10/12/2014.
 */
public class ResizingArrayQueue<T> implements Iterable<T> {
    private T[] items = (T[]) new Object[1];
    private int N;

    public void enqueue(T item) {
        if (items.length == N) {
            resize(0, 2 * items.length);
        }
        items[N++] = item;
    }

    private void resize(int start, int max) {
        items = Arrays.copyOfRange(items, start, max);
    }

    public T dequeue() {
        T item = items[0];
        items[0] = null;
        N--;
        if (N > 0 && N == items.length / 4) {
            resize(1, items.length / 2);
        }
        return item;
    }

    public int size() {
        return this.N;
    }

    public boolean isEmpty() {
        return this.N == 0;
    }

    public int arraySize() {
        return this.items.length;
    }

    @Override
    public Iterator<T> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<T> {
        int i = 0;

        @Override
        public boolean hasNext() {
            return i < N;
        }

        @Override
        public T next() {
            return items[i++];
        }
    }

    public static void main(String[] args) {
        ResizingArrayQueue<String> queue = new ResizingArrayQueue<>();
        queue.enqueue("shekhar");
        queue.enqueue("rahul");
        queue.enqueue("sameer");
        queue.enqueue("sameer");
        queue.enqueue("sameer");
        queue.enqueue("sameer");
        queue.enqueue("sameer");


        for (String name : queue) {
            System.out.println(name);
        }


    }
}

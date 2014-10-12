package org.shekhar.algorithms.ch3;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by shekhargulati on 10/12/2014.
 */
public class ResizingArrayStack<T> implements Iterable<T> {
    private T[] items = (T[]) new Object[1];
    private int N;

    public void push(T item) {
        if (items.length == N) {
            resize(2 * items.length);
        }
        items[N++] = item;
    }

    private void resize(int max) {
        items = Arrays.copyOf(items, max);
    }

    public T pop() {
        T item = items[--N];
        items[N] = null;
        if (N > 0 && N == items.length / 4) {
            resize(items.length / 2);
        }
        return item;
    }

    public int size() {
        return this.N;
    }

    public boolean isEmpty() {
        return this.N == 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<T> {
        int i = N;

        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public T next() {
            return items[--i];
        }
    }

    public static void main(String[] args) {
        ResizingArrayStack<String> stack = new ResizingArrayStack<String>();
        stack.push("shekhar");
        stack.push("rahul");
        stack.push("sameer");

        for (String name : stack) {
            System.out.println(name);
        }

        while (stack.size() > 0){
            System.out.println(stack.pop());
        }

    }
}

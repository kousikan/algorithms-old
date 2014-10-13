package org.shekhar.algorithms.ch3.excercises;

/**
 * Created by shekhargulati on 10/13/2014.
 */
public class Problem_1_3_1 {

    private interface Stack<T> {
        public void push(T item);

        public T pop();

        public int size();

        public boolean isFull();
    }

    private static class FixedCapacityStack<T> implements Stack<T> {

        private final T[] items;
        private final int capacity;
        private int N;

        private FixedCapacityStack(int capacity) {
            this.capacity = capacity;
            items = (T[]) new Object[this.capacity];
        }

        public static <T> FixedCapacityStack of(int capacity) {
            return new FixedCapacityStack<T>(capacity);
        }

        @Override
        public void push(T item) {
            items[N++] = item;
        }

        @Override
        public T pop() {
            return items[--N];
        }

        @Override
        public int size() {
            return this.N;
        }

        @Override
        public boolean isFull() {
            return this.N == this.capacity;
        }
    }

    public static void main(String[] args) {
        FixedCapacityStack<String> stack = FixedCapacityStack.<String>of(3);
        stack.push("Shekhar");
        stack.push("Sameer");
        stack.push("Rahul");
        if (!stack.isFull()) {
            stack.push("Guneet");
        }

    }
}

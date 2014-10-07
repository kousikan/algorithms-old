package org.shekhar.algorithms.ch2;

/**
 * Created by shekhargulati on 10/6/2014.
 */
public class Counter {

    private String name;
    private int count;

    public Counter(String name) {
        this.name = name;
    }

    public void increment() {
        this.count++;
    }

    public int tally() {
        return this.count;
    }


    private static int compare(Counter c1, Counter c2) {
        c1.increment();
        Counter c3 = new Counter("c3");
        c1 = c3;
        return c2.tally() - c1.tally();
    }

    public static void main(String[] args) {
        Counter c1 = new Counter("c1");
        c1.increment();
        Counter c2 = new Counter("c2");
        c2.increment();
        System.out.println(compare(c1, c2));
        System.out.println(c1.toString());

    }

    @Override
    public String toString() {
        return this.name + " : " + tally();
    }
}

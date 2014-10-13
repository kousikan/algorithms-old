package org.shekhar.algorithms.ch3;

import java.util.Iterator;

/**
 * Created by shekhargulati on 10/13/2014.
 */
public class Strings implements Iterable<String> {

    private final String input;

    private Strings(String input) {
        this.input = input;
    }

    public static Strings iter(String input) {
        return new Strings(input);
    }


    @Override
    public Iterator<String> iterator() {
        return new StringCharacterIterator();
    }

    private class StringCharacterIterator implements Iterator<String> {

        int length = 0;

        @Override
        public boolean hasNext() {
            return length < input.length();
        }

        @Override
        public String next() {
            return String.valueOf(input.charAt(length++));
        }
    }

    public static void main(String[] args) {
        Strings myString = iter("SHEKHAR");
        for (String s : myString) {
            System.out.println(s);
        }
    }
}

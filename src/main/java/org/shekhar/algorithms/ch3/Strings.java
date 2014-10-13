package org.shekhar.algorithms.ch3;

import java.util.Iterator;

/**
 * Created by shekhargulati on 10/13/2014.
 */
public class Strings implements Iterable<String> {

    private final String input;

    public Strings(String input) {
        this.input = input;
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
        Strings myString = new Strings("SHEKHAR");
        for (String s : myString) {
            System.out.println(s);
        }
    }
}

package Filters.classes;

import Filters.Filter;

public class SecondStringFilter implements Filter {
    private char pattern;
    private int n;

    public SecondStringFilter(char pattern, int n) {
        this.pattern = pattern;
        this.n = n;
    }

    @Override
    public boolean apply(String s) {
        int count = 0;
        char[] m = s.toCharArray();
        for (char c : m) {
            if (c == pattern) {
                count++;
            }
        }
        return count == n;
    }

    public char getPattern() {
        return pattern;
    }

    public int getN() {
        return n;
    }
}

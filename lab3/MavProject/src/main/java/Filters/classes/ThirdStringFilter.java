package Filters.classes;

import Filters.Filter;

public class ThirdStringFilter implements Filter {

    private String pattern;
    private int n;

    public ThirdStringFilter(String pattern, int n) {
        this.pattern = pattern;
        this.n = n;
    }

    @Override
    public boolean apply(String s) {
        int count = 0;
        int i = 0;
        while (s.indexOf(pattern, i) != -1) {
            count++;
            i++;
        }
        return count == n;
    }

    public int getN() {
        return n;
    }
}

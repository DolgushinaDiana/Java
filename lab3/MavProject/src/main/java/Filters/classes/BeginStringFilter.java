package Filters.classes;

import Filters.Filter;

public class BeginStringFilter implements Filter {
    private String pattern;

    public BeginStringFilter(String s) {
        this.pattern = s;
    }

    public boolean apply(String s) {
        return s.indexOf(getPattern()) == 0;
    }

    public String getPattern() {
        return pattern;
    }

}

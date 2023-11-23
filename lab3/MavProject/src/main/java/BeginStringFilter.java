public class BeginStringFilter implements Filter {
    private String pattern;

    public BeginStringFilter(String s){
        this.pattern = s;
    }       // самое адекватное что тут есть
    public boolean apply(String s){
        return s.indexOf(getPattern())==0;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
}

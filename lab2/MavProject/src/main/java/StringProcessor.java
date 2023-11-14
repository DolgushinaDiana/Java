public class StringProcessor {

    public static String copyes(String s, int n) {          // +
        if (n < 0) throw new IllegalArgumentException("отрицательное число");
        if (s == null) throw new NullPointerException("link is null");
        if (n == 0) return "";
        return s.repeat(n);
    }

    public static int second(String one, String two) {
        int n = 0, i = 0;
        if (one == null) throw new NullPointerException("link is null");
        if ("".equals(two) && !"".equals(one)) throw new NullPointerException("пустая строка");
        if ("".equals(two) && "".equals(one)) return 1;
        while (i != -1 && i < one.length()) {                                                    // +
            n++;
            i = one.indexOf(two, i + 1);
        }
        return n;
    }

    public static String replace123(String s) {
        if (s == null) throw new NullPointerException("link is null");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if ('1' == (s.charAt(i))) {
                res.append("один");
            } else if ('2' == (s.charAt(i))) {
                res.append("два");
            } else if ('3' == (s.charAt(i))) {
                res.append("три");
            } else {
                res.append(s.charAt(i));
            }

        }
        return res.toString();
    }

    public static String everSecond(StringBuilder s) {               // +
        if (s == null) throw new NullPointerException("link is null");
        if ("".contentEquals(s)) throw new NullPointerException("пустая строка");
        for (int i = 1; i < s.length(); i++) {
            s.deleteCharAt(i);
        }
        return s.toString();
    }
}

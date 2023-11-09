public class StringProcessor {


    public String copyes(String s, int n) {          // +
        String res = new String();
        for (int i = 0; i < n; i++) {
            res = res.concat(s);
        }
        return res;
    }

    public int second(String set, String gor) {
        int n = 0, i = 0;
        if (set == null) throw new NullPointerException("link is null");
        if ("".equals(gor) && !"".equals(set)) throw new RuntimeException("пустая строка");
        while (i != -1 && i < set.length()) {                                 // ~
            n++;
            System.out.println(i);
            i = set.indexOf(gor, i + 1);

        }
        return n;
    }

    public String replace123(String s) {
        String res = s.replace("1", "один");           // +
        res = res.replace("2", "два");
        res = res.replace("3", "три");
        return res;
    }

    public StringBuilder everSecond(StringBuilder s) {               // +
        for (int i = 1; i < s.length(); i++) {
            s.deleteCharAt(i);
        }
        return s;
    }
}

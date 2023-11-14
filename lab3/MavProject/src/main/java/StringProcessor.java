public class StringProcessor {

    public String copyes(String s, int n) {          // +
        if (n<0) throw new IllegalArgumentException("отрицательное число");
        if (n==0) return "";
        return s.repeat(n);
    }

    public int second(String set, String gor) {
        int n = 0, i = 0;
        if (set == null) throw new NullPointerException("link is null");
        if ("".equals(gor) && !"".equals(set)) throw new RuntimeException("пустая строка");
        if ("".equals(gor) && "".equals(set)) return 1;
        while (i != -1 && i < set.length()) {                                                    // +
            n++;
            i = set.indexOf(gor, i + 1);
        }
        return n;
    }

    public String replace123(String s) {
        if (s == null) throw new NullPointerException("link is null");
        StringBuilder res=new StringBuilder();
        for (int i=0;i<s.length();i++){
            if ('1'==(s.charAt(i))){
                res.append("один");
            }else
            if ('2'==(s.charAt(i))){
                res.append("два");
            }else
            if ('3'==(s.charAt(i))){
                res.append("три");
            }else{
                res.append(s.charAt(i));
            }

        }
        /*String res = s.replace("1", "один");           // +
        res = res.replace("2", "два");
        res = res.replace("3", "три");*/
        return res.toString();
    }

    public String everSecond(StringBuilder s) {               // +
        if (s == null) throw new NullPointerException("link is null");
        if ("".equals(s.toString())) throw new NullPointerException("null");
        for (int i = 1; i < s.length(); i++) {
            s.deleteCharAt(i);
        }
        return s.toString();
    }
}


public class Main {

    public static void main(String[] args) {
        /*String str=new String("арр");
        String res=new String();
        res.first(str,3);*/
        String st=new String("lol");
        String sttr;
        sttr=st.repeat(3);
        System.out.println(st);
        System.out.println(sttr);
        sttr="lo";
        System.out.println(sttr);
        System.out.println(st);
        sttr=sttr.concat(st);
        System.out.println(sttr);
        String res=StringProcessor.third("1263781");
        System.out.println(res);
        System.out.println(sttr.charAt(2));
    }
}

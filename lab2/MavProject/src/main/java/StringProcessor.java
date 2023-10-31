public class StringProcessor {
    public String first(String s, int n){
        String res=new String();
        for (int i=0;i<n;i++){
            res=res.concat(s);
        }
        return res;
    }
    public int second(String set,String gor){
        int n=0;
        for (int i=0;i<set.length();i++){
            if ((set.indexOf(gor,i)!=-1)&&(!"".equals(gor))){
                n++;
                System.out.println(i);
                i+=set.indexOf(gor,i);

            }
        }
        return n;
    }
    public String third(String s){
        String res=s.replace("1","один");
        res=res.replace("2","два");
        res=res.replace("3","три");
        return res;
    }
}

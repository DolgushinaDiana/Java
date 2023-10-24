public class StringProcessor {

    public String first(String str, int N){
        String str2=new String();
        for (int i=0;i<N;i++){
            str2=str2.concat(str);
        }
        return str2;
    }

    /*public int second(String str,String st){
        int n=0;
        for (int i =str.length();i<str.length();i++){
            while(){

            }
        }
        return n;
    }*/

    public static String third(String str){
        String res=new String();
        int i=0;
        while (i<str.length()){
            char c=str.charAt(i);
            if (c==1){

                res+="один";
            }else if (c==2){
                res+="два";
            } else if (c==3) {
                res+="три";
            }else{
                res+=c;
            }
            i++;
        }
        System.out.println(res);
        return res;
        /*str=str.replace("1","один");
        str=str.replace("2","два");
        str=str.replace("3","три");
        return str;*/
    }
}

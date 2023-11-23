import java.util.Arrays;

public class Partia{

    private String opisanie;
    private Packing[] pac;

    public Partia(String s,Packing... pack) {
        int i=0;
        opisanie=s;
        pac=pack;
        for (Packing p:pack){
            pac[i++]=p;
        }
    }
    /*public int massaPartia(){
        int m=0;
        for (PackProduct p: pac){
            m+=p.findBrutto();
        }
        return m;
    }*/

    @Override
    public String toString() {
        StringBuilder st = new StringBuilder(String.format("партия %s упакованные товары:\n",opisanie));
        for (Packing p:pac) {
            st.append("\t").append(p.toString());
        }
        return st.toString();
    }

    public Packing[] getPac() {
        return pac;
    }
}

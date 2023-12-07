public class Partia {

    private String describe;
    private Packing[] pac;

    public Partia(String s, Packing... pack) {
        int i = 0;
        describe = s;
        pac = pack;
        for (Packing p : pack) {
            pac[i++] = p;
        }
    }

    public int bruttoPartia() {
        int m = 0;
        for (Packing p : pac) {
            m += p.findBrutto();
        }
        return m;
    }

    @Override
    public String toString() {
        StringBuilder st = new StringBuilder(String.format("партия %s\n упакованные товары:\n", describe));
        for (Packing p : pac) {
            st.append("\t").append(p.toString());
        }
        return st.toString();
    }

    public Packing[] getPac() {
        return pac;
    }
}

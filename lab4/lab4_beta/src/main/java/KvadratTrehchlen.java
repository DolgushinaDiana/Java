public class KvadratTrehchlen {
    private int a;
    private int b;
    private int c;

    public KvadratTrehchlen(int a,int b, int c) {
        this.a = a;
        this.b=b;
        this.c=c;
    }

    public double[] solve(){
        double d=Math.sqrt(getB()*getB()-4*getA()*getC());
        double[] mas={(-getB()+d)/2/getA(),(-getB()-d)/2/getA()};
        return mas;
    }

    @Override
    public String toString() {
        return "KvadratTrehchlen{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getA() {
        return a;
    }
}

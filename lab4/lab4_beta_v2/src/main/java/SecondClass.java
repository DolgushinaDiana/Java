public class SecondClass {
    private KvadratTrehchlen ochko;

    public SecondClass(KvadratTrehchlen ochko) {
        this.ochko = ochko;
    }

    public double TheBiggestHuy(){
        return Math.max(ochko.solve()[0], ochko.solve()[1]);
    }

    public int getA(){
        return ochko.getA();
    }
    public KvadratTrehchlen getOchko() {
        return ochko;
    }
}

public class SecondClass {

    private KvadratTrehchlen root;

    public SecondClass(KvadratTrehchlen kt) {
        this.root = kt;
    }

    public double maxRoot() {
        if (root.solve() == null) throw new NullPointerException();
        return (root.solve().length == 2 ? Math.max(root.solve()[0], root.solve()[1]) : root.solve()[0]);
    }

    public double getA() {
        return root.getA();
    }

    public KvadratTrehchlen getRoot() {
        return root;
    }
}

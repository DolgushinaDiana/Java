public class KvadratTrehchlen {
    private double a;
    private double b;
    private double c;

    public KvadratTrehchlen(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double[] solve() {
        double d;
        double[] mas;
        if (a != 0) {
            d = Math.sqrt(b * b - 4 * a * c);
            if (d >= 0) {
                mas = new double[]{(-b - d) / 2 / a, (-b + d) / 2 / a};
            } else {
                mas = null;
            }
        } else if (b != 0) {
            mas = new double[]{-c / b};
        } else {
            mas = null;
        }
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

    public double getC() {
        return c;
    }

    public double getB() {
        return b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }
}

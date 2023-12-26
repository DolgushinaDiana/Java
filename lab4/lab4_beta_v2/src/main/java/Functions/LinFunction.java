package Functions;

public class LinFunction implements IOneArgumentFunction {
    private double a;
    private double b;
    private double r;
    private double l;

    public LinFunction(double a, double b, double r, double l) {
        this.a = a;
        this.b = b;
        this.r = Math.max(r, l);
        this.l = Math.min(r, l);
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    @Override
    public double getR() {
        return r;
    }

    @Override
    public double getL() {
        return l;
    }

    @Override
    public double calculate(double x) {
        if (x > r || x < l) throw new IllegalArgumentException();
        return a * x + b;
    }
}

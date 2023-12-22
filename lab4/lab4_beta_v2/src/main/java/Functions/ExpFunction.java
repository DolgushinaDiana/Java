package Functions;

public class ExpFunction implements IOneArgumentFunction {
    private double a;
    private double b;
    private double r;
    private double l;

    public ExpFunction(double a, double b, double r, double l) {
        this.a = a;
        this.b = b;
        this.r=Math.max(r,l);
        this.l=Math.min(r,l);
    }

    public double getA() {
        return 0;
    }

    public double getB() {
        return 0;
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
        return a * Math.exp(x) + b;
    }
}

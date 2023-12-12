public class ExpFunction implements IOneArgumentFunction {
    private double a;
    private double b;
    public double getA() {
        return 0;
    }

    public double getB() {
        return 0;
    }

    public double calculate(double x) {
        return a*Math.exp(x)+b;
    }
}

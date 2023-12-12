public class DivFunction implements IOneArgumentFunction {
    private double a;
    private double b;
    private double c;
    private double d;

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getA() {
        return 0;
    }

    public double getB() {
        return 0;
    }

    public double calculate(double x) {
        return (a*x+b)/(c*x+d);
    }
}

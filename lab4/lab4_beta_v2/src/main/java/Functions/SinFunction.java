package Functions;

public class SinFunction implements IOneArgumentFunction {
    private double a;
    private double b;
    private double r;
    private double l;
    public SinFunction(double a, double b){
        this.a=a;
        this.b=b;
        this.r=r;
        this.l=l;
    }
    public double getA() {
        return 0;
    }

    public double getB() {
        return 0;
    }

    public double getR() {
        return r;
    }

    public double getL() {
        return l;
    }

    public double calculate(double x) {
        return a*Math.sin(b*x);
    }
}

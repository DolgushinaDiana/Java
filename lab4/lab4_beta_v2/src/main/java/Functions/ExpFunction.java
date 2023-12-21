package Functions;

public class ExpFunction implements IOneArgumentFunction {
    private double a;
    private double b;
    private double r;
    private double l;
    public ExpFunction(double a, double b,double r,double l){
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
        return a*Math.exp(x)+b;
    }
}

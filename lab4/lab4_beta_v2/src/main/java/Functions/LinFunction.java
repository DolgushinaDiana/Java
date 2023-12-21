package Functions;

public class LinFunction implements IOneArgumentFunction {
    private double a;
    private double b;
    private double r;
    private double l;
    public LinFunction(double a, double b,double r,double l){
        this.a=a;
        this.b=b;
        this.r=r;
        this.l=l;
    }
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getR() {
        return r;
    }

    public double getL() {
        return l;
    }

    @Override
    public double calculate(double x) {
        return a*x+b;
    }
}

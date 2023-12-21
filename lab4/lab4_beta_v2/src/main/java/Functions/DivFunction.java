package Functions;

public class DivFunction implements IOneArgumentFunction {
    private double a;
    private double b;
    private double c;
    private double d;
    private double r;
    private double l;
    public DivFunction(double a, double b,double c, double d,double r,double l){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.r=r;
        this.l=l;
    }
    public double getC() {
        return c;
    }
    public double getD() {
        return d;
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

    public double calculate(double x) {
        return (a*x+b)/(c*x+d);
    }
}

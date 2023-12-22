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
        this.r=Math.max(r,l);
        this.l=Math.min(r,l);
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


    @Override
    public double getR() {
        return r;
    }

    @Override
    public double getL() {
        return l;
    }

    public double calculate(double x) {
        return (a*x+b)/(c*x+d);
    }
}

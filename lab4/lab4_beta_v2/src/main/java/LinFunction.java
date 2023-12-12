public class LinFunction implements IOneArgumentFunction{
    private double a;
    private double b;
    public LinFunction(double a, double b){
        this.a=a;
        this.b=b;
    }
    public double getA() {
        return 0;
    }

    public double getB() {
        return 0;
    }

    @Override
    public double calculate(double x) {
        return a*x+b;
    }
}

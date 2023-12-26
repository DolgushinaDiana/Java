package Functionals;
import Functions.IOneArgumentFunction;

public class Integral<T extends IOneArgumentFunction> implements IFunctional<T> {
    private double left;
    private double right;
    private double n;

    public Integral(double right, double left, double n) {
        this.right = Math.max(right, left);
        this.left = Math.min(right, left);
        this.n = n;
    }

    @Override
    public double functional(T f) {
        if (f.getR() < right || f.getL() > left) throw new IndexOutOfBoundsException();
        double d = Math.abs(right - left) / n;
        double res = 0;
        for (int i = 0; i < n; i++) {
            res += f.calculate(left + d * (i + 0.5));
        }
        return res * d;
    }
}

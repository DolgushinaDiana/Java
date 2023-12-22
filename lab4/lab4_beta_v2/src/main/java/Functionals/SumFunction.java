package Functionals;

import Functions.IOneArgumentFunction;

public class SumFunction<T extends IOneArgumentFunction> implements IFunctional<T> {

    private double r;
    private double l;

    public SumFunction(double r, double l) {
        this.r = r;
        this.l = l;
    }

    @Override
    public double functional(T f) {
        return f.calculate(f.getR()) + f.calculate(f.getL()) + f.calculate((f.getL() - f.getR()) / 2);
    }
}

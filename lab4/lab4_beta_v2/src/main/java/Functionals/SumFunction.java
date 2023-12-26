package Functionals;

import Functions.IOneArgumentFunction;

public class SumFunction<T extends IOneArgumentFunction> implements IFunctional<T> {
    @Override
    public double functional(T f) {
        return f.calculate(f.getR()) + f.calculate(f.getL()) + f.calculate(f.getL()+Math.abs(f.getL() - f.getR()) / 2);
    }
}

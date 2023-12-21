package Functionals;

import Functions.IOneArgumentFunction;

public interface IFunctional <T extends IOneArgumentFunction>{
    double functional(T f);
}

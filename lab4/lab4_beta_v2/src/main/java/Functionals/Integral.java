package Functionals;

import Functionals.IFunctional;
import Functions.IOneArgumentFunction;

public class Integral <T extends IOneArgumentFunction> implements IFunctional<T> {
    private double left;
    private double right;
    private double n;
    public Integral(double right,double left,double n){
        this.right=right;
        this.left=left;
        this.n=n;
    }
    @Override
    public double functional(T f) {
        double d=Math.abs(right-left)/n;
        double x=left;
        double res=0/*f.calculate(left)*/;
        for (int i=0;i<n;i++){
            /*System.out.println(d);*/
            System.out.println(f.calculate(left+d*i));
            res+=f.calculate(left+d*i);
            System.out.println(res);
        }
        /*while (x<right){
            x+=d;
            System.out.println(x);
            res+=f.calculate(x);
            System.out.println(res);
        }*/
        return res*d;
    }
}

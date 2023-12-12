
public class SumFunction <T extends IOneArgumentFunction> implements IFunctional<T> {

    private double r;
    private double l;
    private T a;
    private T b;

    public SumFunction(double r,double l,T a, T b){
        this.a=a;
        this.r=r;
        this.l=l;
        this.b=b;
    }

    public double functional(T f) {
        return f.calculate(r)+f.calculate(l)+f.calculate((l-r)/2);
    }

}

import Functionals.Integral;
import Functionals.SumFunction;
import Functions.LinFunction;
import Functions.SinFunction;
import org.junit.Test;



public class FinctionalTest {

    @Test
    public void sumTest(){
        LinFunction f1=new LinFunction(2,5,-1,4);
        SumFunction fun=new SumFunction(2,8);
        System.out.println(fun.functional(f1));
    }
    @Test
    public void integralTest(){
        Integral in=new Integral(2,0,5);
        System.out.println(in.functional(new LinFunction(1,1,-5,5)));

    }
}

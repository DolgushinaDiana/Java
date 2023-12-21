import Functions.DivFunction;
import Functions.ExpFunction;
import Functions.LinFunction;
import Functions.SinFunction;
import org.junit.Test;

import static org.junit.Assert.*;

public class FunctionTest {
    @Test
    public void linCalcTest(){
        LinFunction fun=new LinFunction(2,3,4,6);
        assertEquals(9,fun.calculate(3),0.001);
    }
    @Test
    public void sinCalcTest(){
        SinFunction fun=new SinFunction(2,4);
        System.out.println(fun.calculate(3));
    }
    @Test
    public void expCalcTest(){
        ExpFunction fun=new ExpFunction(2,3,2,6);
        System.out.println(fun.calculate(3));
    }
    @Test
    public void divCalcTest(){
        DivFunction fun=new DivFunction(2,4,5,6,1,7);
        System.out.println(fun.calculate(4));
    }
}

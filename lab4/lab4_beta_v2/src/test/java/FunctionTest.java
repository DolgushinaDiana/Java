
import Functions.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class FunctionTest {
    @Test
    public void linCalcTest() {
        LinFunction fun = new LinFunction(2, 3, 1, 6);
        assertEquals(9, fun.calculate(3), 0.0001);
    }
    @Test(expected = IllegalArgumentException.class)
    public void linException(){
        LinFunction fun = new LinFunction(2, 3, 0, 2);
        System.out.println(fun.calculate(3));
    }

    @Test
    public void sinCalcTest() {
        SinFunction fun = new SinFunction(2, 4,1,6);
        assertEquals(2*Math.sin(4*3),fun.calculate(3),0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void sinException(){
        SinFunction fun = new SinFunction(2, 4,1,6);
        System.out.println(fun.calculate(0));
    }
    @Test
    public void expCalcTest() {
        ExpFunction fun = new ExpFunction(2, 3, 2, 6);
        assertEquals(2*Math.exp(3)+3,fun.calculate(3),0.001);
    }
    @Test(expected = IllegalArgumentException.class)
    public void expException(){
        ExpFunction fun = new ExpFunction(2, 3, 2, 6);
        System.out.println(fun.calculate(1));
    }
    @Test
    public void divCalcTest() {
        DivFunction fun = new DivFunction(3, 4, 5, -16, 1, 7);
        assertEquals(4,fun.calculate(4),0.001);
    }
    @Test(expected = IllegalArgumentException.class)
    public void divException(){
        DivFunction fun = new DivFunction(3, 4, 5, -16, 1, 7);
        System.out.println(fun.calculate(9));
    }
}

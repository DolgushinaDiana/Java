
import Functionals.Integral;
import Functionals.SumFunction;
import Functions.DivFunction;
import Functions.ExpFunction;
import Functions.LinFunction;
import Functions.SinFunction;
import org.junit.Test;

import static org.junit.Assert.*;

public class FunctionalTest {

    @Test
    public void sumTest() {
        LinFunction fun = new LinFunction(2, 3, 2, 4);
        SumFunction sum = new SumFunction();
        assertEquals(27, sum.functional(fun), 0.1);
    }

    @Test
    public void integralLinTest() {
        LinFunction fun = new LinFunction(2, 3, 2, -2);
        Integral in = new Integral(2, -2, 5);
        assertEquals(12, in.functional(fun), 0.01);
    }

    @Test
    public void integralSinTest() {
        SinFunction fun = new SinFunction(2, 4, 3, -3);
        Integral in = new Integral(2, -2, 5);
        assertEquals(0, in.functional(fun), 0.01);
    }

    @Test
    public void integralDivTest() {
        DivFunction fun = new DivFunction(2, 0, 1, 0, 3, -2);
        Integral in = new Integral(2, -2, 10);
        assertEquals(8, in.functional(fun), 0.01);
    }

    @Test
    public void integralExpTest() {
        ExpFunction fun = new ExpFunction(2, 3, 2, -3);
        Integral in = new Integral(2, -2, 10);
        assertEquals(26.5, in.functional(fun), 0.1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void Exepstion1() {
        LinFunction fun = new LinFunction(2, 3, 4, 1);
        Integral in = new Integral(2, -2, 5);
        assertEquals(12, in.functional(fun), 0.1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void Exepstion2() {
        SinFunction fun = new SinFunction(2, 4, 1, 5);
        Integral in = new Integral(2, -2, 5);
        assertEquals(12, in.functional(fun), 0.1);
    }
}

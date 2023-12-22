import Functions.DivFunction;
import Functions.ExpFunction;
import Functions.LinFunction;
import Functions.SinFunction;
import org.junit.Test;

import static org.junit.Assert.*;

public class FunctionTest {
    @Test
    public void linCalcTest() {
        LinFunction fun = new LinFunction(2, 3, 4, 6);
        assertEquals(9, fun.calculate(3), 0.0001);
    }

    @Test
    public void sinCalcTest() {
        SinFunction fun = new SinFunction(2, 4,1,2);
        assertEquals(2*Math.sin(4*3),fun.calculate(3),0.001);
    }

    @Test
    public void expCalcTest() {
        ExpFunction fun = new ExpFunction(2, 3, 2, 6);
        assertEquals(2*Math.exp(3)+3,fun.calculate(3),0.001);
    }

    @Test
    public void divCalcTest() {
        DivFunction fun = new DivFunction(3, 4, 5, -16, 1, 7);
        assertEquals(4,fun.calculate(4),0.001);
    }
}

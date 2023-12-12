import org.junit.Test;

import static org.junit.Assert.*;

public class LinFunctionTest {
    @Test
    public void calcTest(){
        LinFunction fun1=new LinFunction(2,3);
        assertEquals(9,fun1.calculate(3));

    }
}

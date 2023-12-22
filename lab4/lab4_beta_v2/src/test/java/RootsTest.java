import org.junit.Test;

import static org.junit.Assert.*;

public class RootsTest {
    @Test
    public void maxRootTest() {
        KvadratTrehchlen op = new KvadratTrehchlen(4, 6, 0);
        KvadratTrehchlen op2 = new KvadratTrehchlen(1, 6, 9);
        SecondClass on3 = new SecondClass(new KvadratTrehchlen(0, 4, 8));
        SecondClass on = new SecondClass(op);
        SecondClass on2 = new SecondClass(op2);
        assertEquals(0, on.maxRoot(), 0.1);
        assertEquals(-3, on2.maxRoot(), 0.1);
        assertEquals(-2, on3.maxRoot(), 0.1);

    }

    @Test(expected = NullPointerException.class)
    public void Expection() {
        KvadratTrehchlen op2 = new KvadratTrehchlen(3, 0, 9);
        SecondClass on2 = new SecondClass(op2);
        assertNull(on2.maxRoot());
        assertNull(new KvadratTrehchlen(0, 0, 0).solve());
    }
}

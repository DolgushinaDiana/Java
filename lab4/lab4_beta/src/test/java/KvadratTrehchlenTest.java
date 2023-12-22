import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class KvadratTrehchlenTest {

    @Test
    public void solveTest() {
        double[] mas1 = {-3, -3};
        double[] mas2 = {0, 3};
        double[] mas3 = {0};
        assertNull(new KvadratTrehchlen(0, 0, 0).solve());
        assertArrayEquals(mas1, new KvadratTrehchlen(1, 6, 9).solve(), 0.1);
        assertArrayEquals(mas2, new KvadratTrehchlen(2, -6, 0).solve(), 0.1);
        assertArrayEquals(mas3, new KvadratTrehchlen(0, 2, 0).solve(), 0.1);
        assertArrayEquals(null, new KvadratTrehchlen(3, 0, 9).solve(), 0.1);
    }

    @Test
    public void Test1() {
        System.out.println(Arrays.toString(new KvadratTrehchlen(1, 6, 9).solve()));
        System.out.println(Arrays.toString(new KvadratTrehchlen(2, -6, 0).solve()));
        System.out.println(Arrays.toString(new KvadratTrehchlen(0, 0, 0).solve()));
        System.out.println(Arrays.toString(new KvadratTrehchlen(0, 2, 0).solve()));
        System.out.println(Arrays.toString(new KvadratTrehchlen(3, 0, 9).solve()));

    }
}

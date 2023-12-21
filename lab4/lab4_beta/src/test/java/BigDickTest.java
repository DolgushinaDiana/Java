import org.junit.Test;

import java.util.Arrays;

public class BigDickTest {
    @Test
    public void Test1(){
        KvadratTrehchlen on=new KvadratTrehchlen(1,6,9);
        System.out.println(Arrays.toString(on.solve()));
        System.out.println(Arrays.toString(new KvadratTrehchlen(2,-6,0).solve()));
        System.out.println(Arrays.toString(new KvadratTrehchlen(0, 0, 0).solve()));
        System.out.println(Arrays.toString(new KvadratTrehchlen(0, 2, 0).solve()));
        System.out.println(Arrays.toString(new KvadratTrehchlen(3, 0, 9).solve()));

    }
}

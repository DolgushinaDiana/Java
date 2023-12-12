import org.junit.Test;

public class SecondClassTest {

    @Test
    public void Test(){
        KvadratTrehchlen op=new KvadratTrehchlen(4,6,8);
        SecondClass on=new SecondClass(op);
        System.out.println(on.TheBiggestHuy());
    }
}

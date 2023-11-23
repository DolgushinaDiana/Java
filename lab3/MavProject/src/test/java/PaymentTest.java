import org.junit.Test;
import static org.junit.Assert.*;

public class PaymentTest {
    Product p=new WeightProduct("apple","fruit");
    WeightProduct product1=new WeightProduct("dgdf","sdf");
    OneProduct product2=new OneProduct("sdef","dfed",3);
    Product[] products={new Product("fuck","you"),new WeightProduct("app","fuck")};
    Product pro=new OneProduct("nut","oreh",3);

    @Test           // +
    public void equalsTest(){
        Product pay=new Product("happy birthday","ddd");
        assertNotEquals(pay, new Product(" ", "sdsd"));
        assertEquals(pay, new Product("happy birthday", "ddd"));

    }
    @Test           // +
    public void hashcodeTest(){
        Product pay=new Product("happy birthday","dhf");
        Product pay2=new Product("happy birthday","dhf");
        System.out.println(pay.hashCode());
        assertEquals(pay.hashCode(),pay2.hashCode());
    }

    @Test
    public void toStringTest(){
        System.out.println(p);
        System.out.println(products[0]);
        System.out.println(products[1]);
        System.out.println(product1);
        System.out.println(product2);
    }

}

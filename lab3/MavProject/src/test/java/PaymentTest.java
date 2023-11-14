import org.junit.Test;
import static org.junit.Assert.*;

public class PaymentTest {
    @Test           // +
    public void equalsTest(){
        Product pay=new Product("happy birthday",26,2,2004,0);
        assertNotEquals(pay, new Product(" ", 20, 3, 2004, 0));
        assertEquals(pay, new Product("happy birthday", 26, 2, 2004, 0));

    }
    @Test           // +
    public void hashcodeTest(){
        Product pay=new Product("happy birthday",26,2,2004,0);
        System.out.println(pay.hashCode());
    }
    @Test           // +
    public void toStringTest(){
        assertEquals("\tПлательщик: фабио, дата: 23.5.34, сумма: 1000 руб. 0 коп.\n",new Product("фабио",23,5,34,100000).toString());
        assertEquals("\tПлательщик: Fio, дата: 23.5.34, сумма: 1234 руб. 56 коп.\n",new Product("Fio",23,5,34,123456).toString());
    }
    /*@Test
    public void */
}

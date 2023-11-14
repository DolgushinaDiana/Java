import org.junit.Test;
import static org.junit.Assert.*;

public class PaymentTest {
    @Test           // +
    public void equalsTest(){
        Payment pay=new Payment("happy birthday",26,2,2004,0);
        assertNotEquals(pay, new Payment(" ", 20, 3, 2004, 0));
        assertEquals(pay, new Payment("happy birthday", 26, 2, 2004, 0));
        assertTrue(pay.equals(pay));
        assertFalse(pay.equals(null));

    }
    @Test           // +
    public void hashcodeTest(){
        Payment pay=new Payment("happy birthday",26,2,2004,0);
        Payment pay2=new Payment("happy birthday",26,2,2004,0);
        assertEquals(pay.hashCode(),pay.hashCode());
        assertEquals(pay.hashCode(),pay2.hashCode());
        assertNotEquals(pay.hashCode(),new Payment("happy",3,4,5,100).hashCode());
    }
    @Test           // +
    public void toStringTest(){
        System.out.println(new Payment("фабио",23,5,34,100000).toString());
        assertEquals("\tПлательщик: фабио, дата: 23.05.34, сумма: 1000 руб. 0 коп.\n",new Payment("фабио",23,5,34,100000).toString());
        assertEquals("\tПлательщик: Fio, дата: 23.05.34, сумма: 1234 руб. 56 коп.\n",new Payment("Fio",23,5,34,123456).toString());
    }
}

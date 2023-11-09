import org.junit.Test;
import static org.junit.Assert.*;

public class PaymentTest {
    @Test           // +
    public void equalsTest(){
        Payment pay=new Payment("happy birthday",26,2,2004,0);
        assertNotEquals(pay, new Payment(" ", 20, 3, 2004, 0));
        assertEquals(pay, new Payment("happy birthday", 26, 2, 2004, 0));

    }
    @Test           // +
    public void hashcodeTest(){
        Payment pay=new Payment("happy birthday",26,2,2004,0);
        System.out.println(pay.hashCode());
    }
    @Test           // +
    public void toStringTest(){

        assertEquals("Плательщик: Fio, дата: 23.5.34, сумма: 1000 руб. 0 коп.\n",new Payment("Fio",23,5,34,100000).toString());
        assertEquals("Плательщик: Fio, дата: 23.5.34, сумма: 1234 руб. 56 коп.\n",new Payment("Fio",23,5,34,123456).toString());


    }
    /*@Test
    public void */
}

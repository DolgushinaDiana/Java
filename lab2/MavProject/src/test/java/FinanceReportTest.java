import org.junit.Test;
import static org.junit.Assert.*;
public class FinanceReportTest {
    @Test
    public void quanityTest(){
        FinanceReport report=new FinanceReport(4);
        assertEquals(4,report.quantity());
        assertNotEquals(0, new FinanceReport(4).quantity());
    }
    @Test
    public void iPayReadTest(){

    }
    @Test
    public void iPayChangeTest(){

    }
    @Test
    public void toStringTest(){
        System.out.println(new FinanceReport(4).toStringReport(4));

    }
    @Test
    public void cloneTest(){

    }
}

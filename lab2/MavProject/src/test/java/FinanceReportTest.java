import org.junit.Test;
import static org.junit.Assert.*;
public class FinanceReportTest {
    Payment[] pay={new Payment("мари", 2,4,12,100),
            new Payment("mary",23,11,12,1222),
            new Payment("клара",10,10,10,10),
            new Payment("карл",20,2,20,202)};
    @Test
    public void reportCountTest(){
        FinanceReport report=new FinanceReport("di",10,11,23,pay);
        assertEquals(4,report.reportCount());
        assertNotEquals(0, new FinanceReport("di",10,11,23,pay).reportCount());
    }

    @Test
    public void toStringTest(){
        System.out.println(new FinanceReport("di",10,11,23,pay).toStringReport(4));

    }
    @Test
    public void cloneTest(){

    }
}

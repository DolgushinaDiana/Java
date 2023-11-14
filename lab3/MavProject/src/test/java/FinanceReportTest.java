import org.junit.Test;
import static org.junit.Assert.*;
public class FinanceReportTest {
    Payment[] pay={new Payment("Глазкова Алена Игоревна", 2,4,12,200),
            new Payment("Долина Валерия",13,11,2015,30),
            new Payment("Глазкова Алена Игоревна",10,10,10,4000),
            new Payment("Долина Валерия ",20,2,20,500),
            new Payment("Глазкова Алена Игоревна",20,2,20,6027),
            new Payment("Глинин Василий Павлович",20,2,20,202)};
    @Test
    public void reportCountTest(){
        FinanceReport report=new FinanceReport("Дин",10,11,23,pay);
        assertEquals(6,report.reportCount());
        assertNotEquals(0, new FinanceReport("Дин",10,11,23,pay).reportCount());
    }

    @Test
    public void toStringTest(){
        System.out.println(new FinanceReport("Дин",10,11,23,pay).toStringReport());

    }
    @Test
    public void FinanceReportCopesTest(){
        FinanceReport orig=new FinanceReport("Дин Дан Дон",10,11,23,pay);
        FinanceReport copy=new FinanceReport(orig);
        Payment p=new Payment("Глазкова Алена Игоревна",22,9,78,5397);
        Payment s=new Payment("Лени Ник ",0,0,0,0);

        copy.setFullName("Юзик");
        copy.setPayment(0,p);
        orig.setPayment(1,s);

        System.out.println(copy.toStringReport());
        System.out.println(orig.toStringReport());
    }
}

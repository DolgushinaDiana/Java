import org.junit.Test;
import static org.junit.Assert.*;

public class FinanceReportProcessorTest {

    Product[] pay={new Product("Глазкова Алена Игоревна", 2,4,12,200),
            new Product("Долина Валерия",13,11,2015,30),
            new Product("Глазкова Алена Игоревна",10,10,10,4000),
            new Product("Долина Валерия ",20,2,20,500),
            new Product("Глазкова Алена Игоревна",20,2,20,6027),
            new Product("Глинин Василий Павлович",20,2,20,202)};

    @Test(expected = Exception.class)
    public void taxesTest(){

        assertEquals("неверное значение символа",FinanceReportProcessor.taxes(new FinanceReport("di",10,11,23,pay),' '));
        assertEquals("link is null",FinanceReportProcessor.taxes(null,'c'));
        assertEquals("""
                Автор: di, дата: 10.11.23, Платежи:\s
                \tПлательщик: Lera, дата: 13.11.2015, сумма: 0 руб. 30 коп.
                \tПлательщик: Lena, дата: 20.2.20, сумма: 5 руб. 0 коп.
                \tПлательщик: Leo, дата: 20.2.20, сумма: 0 руб. 16 коп.
                """,FinanceReportProcessor.taxes(new FinanceReport("di",10,11,23,pay),'L').toStringReport());

        assertEquals("""
                Автор: di, дата: 10.11.23, Платежи:\s
                \tПлательщик: piter, дата: 20.2.20, сумма: 2 руб. 2 коп.
                \tПлательщик: pier, дата: 20.2.20, сумма: 2 руб. 2 коп.
                """,FinanceReportProcessor.taxes(new FinanceReport("di",10,11,23,pay),'p').toStringReport());

    }
    @Test
    public void taxesOnSumTest(){

        assertEquals("неверное значение вводимого числа",FinanceReportProcessor.taxesOnSum(new FinanceReport("di",10,11,23,pay),-10));
        assertEquals("link is null",FinanceReportProcessor.taxesOnSum(null,1000));
        assertEquals("""
                Автор: di, дата: 10.11.23, Платежи:\s
                \tПлательщик: dia, дата: 2.4.12, сумма: 1 руб. 0 коп.
                \tПлательщик: Lera, дата: 13.11.2015, сумма: 0 руб. 30 коп.
                \tПлательщик: marc, дата: 10.10.10, сумма: 0 руб. 10 коп.
                \tПлательщик: Leo, дата: 20.2.20, сумма: 0 руб. 16 коп.
                """,FinanceReportProcessor.taxesOnSum(new FinanceReport("di",10,11,23,pay),100).toStringReport());

    }

}

import org.junit.Test;

import static org.junit.Assert.*;

public class FinanceReportTest {
    Payment[] pay = {new Payment("Глазкова Алена Игоревна", 2, 4, 12, 200),
            new Payment("Долина Валерия", 13, 11, 2015, 30),
            new Payment("Глазкова Алена Игоревна", 10, 10, 10, 4000),
            new Payment("Долина Валерия ", 20, 2, 20, 500),
            new Payment("Глазкова Алена Игоревна", 20, 2, 20, 6027),
            new Payment("Глинин Василий Павлович", 20, 2, 20, 202)};

    @Test
    public void reportCountTest() {
        FinanceReport report = new FinanceReport("Дин", 10, 11, 23, pay);
        assertEquals(6, report.reportCount());
        assertNotEquals(0, new FinanceReport("Дин", 10, 11, 23, pay).reportCount());
    }

    @Test
    public void toStringTest() {
        System.out.println(new FinanceReport("Дин", 10, 11, 23, pay));
        assertEquals("[Автор: Дин, дата: 10.11.23, Платежи:[\n" +
                "\tПлательщик: Глазкова Алена Игоревна, дата: 2.04.12, сумма: 2 руб. 0 коп.\n" +
                "\tПлательщик: Долина Валерия, дата: 13.11.2015, сумма: 0 руб. 30 коп.\n" +
                "\tПлательщик: Глазкова Алена Игоревна, дата: 10.10.10, сумма: 40 руб. 0 коп.\n" +
                "\tПлательщик: Долина Валерия , дата: 20.02.20, сумма: 5 руб. 0 коп.\n" +
                "\tПлательщик: Глазкова Алена Игоревна, дата: 20.02.20, сумма: 60 руб. 27 коп.\n" +
                "\tПлательщик: Глинин Василий Павлович, дата: 20.02.20, сумма: 2 руб. 2 коп.\n]]", new FinanceReport("Дин", 10, 11, 23, pay).toString());

    }

    @Test
    public void FinanceReportCopesTest() {
        FinanceReport orig = new FinanceReport("Дин Дан Дон", 10, 11, 23, pay);
        FinanceReport copy = new FinanceReport(orig);
        assertEquals(orig, copy);

        Payment p = new Payment("Глазкова Алена Игоревна", 22, 9, 78, 5397);
        copy.setPayment(0, p);

        assertNotEquals(orig, copy);
    }

    @Test
    public void setPaymentTest() {
        FinanceReport report = new FinanceReport("Дин", 10, 11, 23, pay);
        Payment p = new Payment("Глинина Марла Павловна", 20, 2, 20, 202);
        report.setPayment(1, p);
        assertEquals(new Payment("Глинина Марла Павловна", 20, 2, 20, 202), report.getPayment(1));
    }
}

import org.junit.Test;

import static org.junit.Assert.*;

public class FinanceReportProcessorTest {

    Payment[] pay = {
            new Payment("Глазкова Алена Игоревна", 2, 4, 12, 200),
            new Payment("Долина Валерия", 13, 11, 2015, 30),
            new Payment("Глазкова Алена Игоревна", 10, 10, 10, 4000),
            new Payment("Долина Валерия ", 20, 2, 20, 500),
            new Payment("Глазкова Алена Игоревна", 20, 2, 20, 6027),
            new Payment("Глинин Василий Павлович", 20, 2, 20, 202)};


    @Test
    public void taxesTest() {
        FinanceReport rep = new FinanceReport("di", 10, 11, 23, pay);
        FinanceReport repResult = new FinanceReport(rep);
        Payment[] payments = {
                new Payment("Глазкова Алена Игоревна", 2, 4, 12, 200),
                new Payment("Глазкова Алена Игоревна", 10, 10, 10, 4000),
                new Payment("Глазкова Алена Игоревна", 20, 2, 20, 6027),
                new Payment("Глинин Василий Павлович", 20, 2, 20, 202)
        };
        repResult.setPayment(payments);
        assertEquals(repResult, FinanceReportProcessor.taxes(rep, 'Г'));
    }

    @Test(expected = NumberFormatException.class)
    public void taxesCaseException() {
        System.out.println(FinanceReportProcessor.taxes(new FinanceReport("di", 10, 11, 23, pay), 'v'));
    }

    @Test(expected = NullPointerException.class)
    public void taxesCaseException2() {
        System.out.println(FinanceReportProcessor.taxes(null, 'l'));
    }

    @Test(expected = IllegalArgumentException.class)
    public void taxesCaseException3() {
        System.out.println(FinanceReportProcessor.taxes(new FinanceReport("di", 10, 11, 23, pay), ' '));
    }

    @Test
    public void taxesTest2() {
        FinanceReport rep = new FinanceReport("di", 10, 11, 23, pay);
        FinanceReport repResult = new FinanceReport(rep);
        Payment[] payments = {
                new Payment("Глазкова Алена Игоревна", 2, 4, 12, 200),
                new Payment("Долина Валерия", 13, 11, 2015, 30),
                new Payment("Глинин Василий Павлович", 20, 2, 20, 202)
        };
        repResult.setPayment(payments);
        assertEquals(repResult, FinanceReportProcessor.taxesOnSum(rep, 500));
    }


    @Test(expected = Exception.class)           // обработать ошибки
    public void taxesOnSumTest() {
        FinanceReport rep = new FinanceReport("di", 10, 11, 23, pay);
        System.out.println(rep);
        System.out.println(FinanceReportProcessor.taxesOnSum(rep, 100));
        System.out.println(FinanceReportProcessor.taxesOnSum(rep, 100));

        assertEquals("неверное значение вводимого числа", FinanceReportProcessor.taxesOnSum(new FinanceReport("di", 10, 11, 23, pay), -10));
        assertEquals("link is null", FinanceReportProcessor.taxesOnSum(null, 1000));
        assertEquals("""
                Автор: di, дата: 10.11.23, Платежи:\s
                \tПлательщик: dia, дата: 2.4.12, сумма: 1 руб. 0 коп.
                \tПлательщик: Lera, дата: 13.11.2015, сумма: 0 руб. 30 коп.
                \tПлательщик: marc, дата: 10.10.10, сумма: 0 руб. 10 коп.
                \tПлательщик: Leo, дата: 20.2.20, сумма: 0 руб. 16 коп.
                """, FinanceReportProcessor.taxesOnSum(new FinanceReport("di", 10, 11, 23, pay), 100).toString());

    }

}

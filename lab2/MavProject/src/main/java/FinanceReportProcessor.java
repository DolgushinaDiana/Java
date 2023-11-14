public class FinanceReportProcessor {

    public static FinanceReport taxes(FinanceReport orig, char c) {
        if (orig == null ) throw new NullPointerException("link is null");
        if (c==' ') throw new IllegalArgumentException("неверное значение символа");
        int i=0,size = 0;
        for (Payment pay : orig.getPayment()) {
            if (pay.getFio().charAt(0) == c) {
                size++;
            }
        }
        if (size==0) throw new NumberFormatException("размер создаваемого массива = 0");
        Payment[] p = new Payment[size];
        for (Payment pay : orig.getPayment()) {
            if (pay.getFio().charAt(0) == c) {
                p[i++]=new Payment(pay.getFio(), pay.getDay(), pay.getMonth(), pay.getYear(), pay.getCache());
            }
        }
        return new FinanceReport(orig.getFullName(), orig.getDay(),orig.getMonth(), orig.getYear(), p);
    }


    public static FinanceReport taxesOnSum(FinanceReport orig, int n) {
        if (orig == null) throw new NullPointerException("link is null");
        if (n<=0) throw new IllegalArgumentException("неверное значение вводимого числа");
        int i=0,size = 0;

        for (Payment pay : orig.getPayment()) {
            if (pay.getCache() < n) {
                size++;
            }
        }
        if (size==0) throw new NumberFormatException("размер создаваемого массива = 0");
        Payment[] p = new Payment[size];
        for (Payment pay : orig.getPayment()) {
            if (pay.getCache()<n) {
                p[i++]=new Payment(pay.getFio(), pay.getDay(), pay.getMonth(), pay.getYear(), pay.getCache());
            }
        }
        return new FinanceReport(orig.getFullName(), orig.getDay(),orig.getMonth(), orig.getYear(), p);
    }
}

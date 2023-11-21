public class FinanceReportProcessor {
    /*public static FinanceReport taxes(FinanceReport orig, char c) {
        if (orig == null) throw new NullPointerException("link is null");
        if (c==' ') throw new IllegalArgumentException("неверное значение символа");
        int i=0,size = 0;
        // размер массива для нового отчета
        for (Product pay : orig.getPayment()) {
            if (pay.getName().charAt(0) == c) {
                size++;
            }
        }
        // новый массив
        Product[] p = new Product[size];
        for (Product pay : orig.getPayment()) {
            if (pay.getName().charAt(0) == c) {
                p[i++]=new Product(pay.getName(), pay.getThat();
            }
        }
        return new FinanceReport(orig.getFullName(), orig.getDay(),orig.getMonth(), orig.getYear(), p);
    }


    public static FinanceReport taxesOnSum(FinanceReport orig, int n) {
        if (orig == null) throw new NullPointerException("link is null");
        if (n<=0) throw new IllegalArgumentException("неверное значение вводимого числа");
        int i=0,size = 0;
        // размер массива для нового отчета
        for (Product pay : orig.getPayment()) {
            if (pay.getCache()<=n) {
                size++;
            }
        }
        // новый массив
        Product[] p = new Product[size];
        for (Product pay : orig.getPayment()) {
            if (pay.getCache()<=n) {
                p[i++]=new Product(pay.getName(), pay.getThat());
            }
        }
        return new FinanceReport(orig.getFullName(), orig.getDay(),orig.getMonth(), orig.getYear(), p);
    }*/
}

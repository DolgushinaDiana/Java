import java.util.Arrays;
import java.util.Objects;

public class FinanceReport {
    private String fullName;
    private int day;
    private int month;
    private int year;
    private Payment[] payments;

    // конструктор
    public FinanceReport(String s, int day, int month, int year, Payment[] payment) {
        this.fullName = s;
        this.day = day;
        this.month = month;
        this.year = year;
        this.payments = payment;
    }

    // конструктор копирования
    public FinanceReport(FinanceReport orig) {
        if (orig==null) throw new NullPointerException("нет ссылки оригинала");
        fullName = orig.getFullName();
        day = orig.getDay();
        month = orig.getMonth();
        year = orig.getYear();
        payments = new Payment[orig.reportCount()];
        for (int i = 0; i < orig.reportCount(); i++) {
            payments[i] = new Payment(orig.getPayment(i).getFio(),
                    orig.getPayment(i).getDay(),
                    orig.getPayment(i).getMonth(),
                    orig.getPayment(i).getYear(),
                    orig.getPayment(i).getCache());
        }
    }

    //количество платежей
    public int reportCount() {
        return payments.length;
    }

    // отчет
    @Override
    public String toString() {
        if (getPayment() == null) throw new NullPointerException("link is null");
        StringBuilder st = new StringBuilder(String.format("[Автор: %s, дата: %d.%d.%d, Платежи:[\n", getFullName(), getDay(), getMonth(), getYear()));
        for (Payment payment : payments) {
            st.append(payment.toString());
        }
        st.append("]]");
        return st.toString();
    }

    // геттеры и сеттеры
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Payment getPayment(int i) {
        return payments[i];
    }

    public void setPayment(Payment[] payment) {
        this.payments = payment;
    }

    public Payment[] getPayment() {
        return payments;
    }

    public void setPayment(int i, Payment p) {
        payments[i].setFio(p.getFio());
        payments[i].setDay(p.getDay());
        payments[i].setMonth(p.getMonth());
        payments[i].setYear(p.getYear());
        payments[i].setCache(p.getCache());
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FinanceReport that = (FinanceReport) o;
        return day == that.day && month == that.month && year == that.year && Objects.equals(fullName, that.fullName) && Arrays.equals(payments, that.payments);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(fullName, day, month, year);
        result = 31 * result + Arrays.hashCode(payments);
        return result;
    }
}

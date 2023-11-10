public class FinanceReport {

    private String fullName;
    private int day;
    private int month;
    private int year;
    private Payment[] payment;

    // конструктор
    public FinanceReport(String s,int day,int month, int year, Payment[] payment) {
        this.fullName=s;
        this.day=day;
        this.month=month;
        this.year=year;
        this.payment=payment;

    }


    //количество платежей
    public int reportCount() {
        return payment.length;
    }

    // отчет
    public String toStringReport(int n) {
        String st=String.format("Автор: %s, дата: %d.%d.%d, Платежи: \n", getFullName(), getDay(), getMonth(), getYear());
        for (int i=0;i<n;i++){
            st+=payment[i].toString();
        }
        return st;
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
        return payment[i];
    }

    public void setPayment(Payment[] payment) {
        this.payment = payment;
    }

    public Payment[] getPayment() {
        return payment;
    }

    public void setPayment(int i,Payment p){
        payment[i].setFio(p.getFio());
        payment[i].setDay(p.getDay());
        payment[i].setMonth(p.getMonth());
        payment[i].setYear(p.getYear());
        payment[i].setCache(p.getCache());
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}

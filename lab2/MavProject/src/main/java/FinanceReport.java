public class FinanceReport {
    private String fullName;
    private int day;
    private int month;
    private int year;
    private Payment[] payment;


    public FinanceReport(int i) {
        payment = new Payment[i];

        for (int i = 0; i < payment.length; i++) {
            payment[i]=new int;
        }
    }

    public int quantity() {
        return payment.length;
    }

    public Payment iPayRead(int i){
        return payment[i];
    }
    public Payment iPayWright(int i){
        return payment[i];
    }

    public String toString() {
        return String.format("Плательщик: %s, дата: %d.%d.%d, Платежи: %d", getFullName(), getDay(), getMonth(), getYear());
    }
    /*@Override
    public Object clone(){
        return new FinanceReport(fullName,day,month,year,payment);
    }*/

    /*public int[] getPayment() {
        return payment;
    }*/

    /*public void setPayment(int[] payment) {
        this.payment = payment;
    }*/

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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}

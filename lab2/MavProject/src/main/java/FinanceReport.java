public class FinanceReport {
    private String fullName;
    private int day;
    private int month;
    private int year;
    private Payment[] payment;
    public FinanceReport(int n) {
        payment = new Payment[n];
        for (int i = 0; i < payment.length; i++) {
            payment[i]=new Payment("",0,0,0,0);
        }
    }
    public int quantity() {
        return payment.length;
    }

    public Payment iPayRead(int i){
        System.out.println(payment[i].toString());
        return payment[i];
    }

    /*public Payment iPayChange(int i){
        payment[i].setFIO();
        payment[i].setDay(int d);
        return payment[i];
    }*/

    public String toStringReport(int n) {
        String st=String.format("[Автор: %s, дата: %d.%d.%d, Платежи: \n [", getFullName(), getDay(), getMonth(), getYear());
        for (int i=0;i<n;i++){
            st+=payment[i].toString();
        }
        st+="]]";
        return st;
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

    public Payment getPayment(int i) {
        return payment[i];
    }

    public void setPayment(Payment[] payment) {
        this.payment = payment;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}

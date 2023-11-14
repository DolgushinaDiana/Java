import java.util.Objects;

public class Payment {
    private String fio;
    private int day;
    private int month;
    private int year;
    private int cache;

    public Payment(String FIO, int day, int month, int year, int cache) {
        this.fio = FIO;
        this.day = day;
        this.month = month;
        this.year = year;
        this.cache = cache;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFio(), getDay(), getMonth(), getYear(), getCache());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Payment payment = (Payment) obj;
        return getDay() == payment.getDay() &&
                getMonth() == payment.getMonth() &&
                getYear() == payment.getYear() &&
                getCache() == payment.getCache() &&
                Objects.equals(getFio(), payment.getFio());
    }

    @Override
    public String toString() {
        return String.format("\tПлательщик: %s, дата: %d.%d%d.%d, сумма: %d руб. %d коп.\n", getFio(), getDay(), getMonth()/10,getMonth()%10, getYear(), (getCache() / 100), getCache() % 100);
    }

    public int getCache() {
        return cache;
    }

    public void setCache(int cache) {
        this.cache = cache;
    }

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

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

}

public class FinanceReport {
    private String fullName;
    private int day;
    private int month;
    private int year;
    private Product[] Products;

    // конструктор
    public FinanceReport(String s, int day, int month, int year, Product[] Product) {
        this.fullName = s;
        this.day = day;
        this.month = month;
        this.year = year;
        this.Products = Product;
    }
    // конструктор копирования   Как тебя сука делать?!
    public FinanceReport(FinanceReport orig) {
        fullName = orig.getFullName();
        day = orig.getDay();
        month = orig.getMonth();
        year = orig.getYear();
        Products = new Product[orig.reportCount()];
        for (int i = 0; i < orig.reportCount(); i++) {
            Products[i] = new Product(orig.getPayment(i).getName(),
                    orig.getPayment(i).getThat());

        }
    }
    //количество платежей
    public int reportCount() {
        return Products.length;
    }
    // отчет
    public String toStringReport() {
        if (getPayment() == null) throw new NullPointerException("link is null");
        StringBuilder st = new StringBuilder(String.format("Автор: %s, дата: %d.%d.%d, Платежи: \n", getFullName(), getDay(), getMonth(), getYear()));
        for (Product Product : Products) {
            st.append(Product.toString());
        }
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

    public Product getPayment(int i) {
        return Products[i];
    }

    public void setPayment(Product[] Product) {
        this.Products = Product;
    }

    public Product[] getPayment() {
        return Products;
    }

    public void setPayment(int i, Product p) {
        Products[i].setName(p.getName());
        Products[i].setThat(p.getThat());

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}

import java.util.Objects;

public class Product {
    private String name;
    private String that;

    public Product(String name, String that) {
        this.name = name;
        this.that = that;

    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getThat());
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Product Product = (Product) obj;
        return getThat() == Product.getThat() &&
                Objects.equals(getName(), Product.getName());
    }
    @Override
    public String toString() {
        return String.format("\tПлательщик: %s, дата: %d.%d.%d, сумма: %d руб. %d коп.\n", getName(), getThat());
    }
    public String getThat() {
        return that;
    }
    public void setThat(String that) {
        this.that = that;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
class WeightProduct extends Product {
    public WeightProduct(String name, String that) {
        super(name, that);
    }
}
class OneProduct extends Product{

    public OneProduct(String name, String that) {
        super(name, that);
    }
}
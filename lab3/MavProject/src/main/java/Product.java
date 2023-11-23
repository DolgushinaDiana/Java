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
    public String toString() {
        return String.format("название %s\n описание %s\n", getName(), getThat());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(getName(), product.getName()) && Objects.equals(getThat(), product.getThat());
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


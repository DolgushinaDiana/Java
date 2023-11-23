import java.util.Objects;

public class PackProduct {
    private Package pac;
    private Product product;

    public PackProduct(Product product,Package pac){
        this.product=product;
        this.pac=pac;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return String.format("");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PackProduct that = (PackProduct) o;
        return Objects.equals(getPac(), that.getPac()) && Objects.equals(getProduct(), that.getProduct());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPac(), getProduct());
    }

    public Package getPac() {
        return pac;
    }

}

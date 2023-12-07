import java.util.Objects;

public class WeightProduct extends Product {

    public WeightProduct(String name, String that) {       // constructor
        super(name, that);
    }

    public String toString() {
        return String.format("название весового товара %s\nописание %s\n", getName(), getThat());
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getThat() {
        return super.getThat();
    }
}
package Products;

import java.util.Objects;

public class OneProduct extends Product {
    private int mass;

    public OneProduct(String name, String that, int mass) {
        super(name, that);
        this.mass = mass;
    }

    public int getMass() {
        return mass;
    }

    @Override
    public String getThat() {
        return super.getThat();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String toString() {
        return String.format("название штучного товара %s\n описание %s\n вес одной штуки %d\n", getName(), getThat(), getMass());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        OneProduct that = (OneProduct) o;
        return getMass() == that.getMass();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getMass());
    }
}

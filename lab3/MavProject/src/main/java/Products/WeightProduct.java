package Products;

import Products.Product;

public class WeightProduct extends Product {

    public WeightProduct(String name, String description) {       // constructor
        super(name, description);
    }

    public String toString() {
        return String.format("название весового товара %s\nописание %s\n", getName(), getDescription());
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
    public String getDescription() {
        return super.getDescription();
    }
}
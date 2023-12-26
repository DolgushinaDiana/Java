package Packages.classes;

import Packages.Packing;
import Packages.classes.Package;
import Products.WeightProduct;

public class PackWeightProduct extends WeightProduct implements Packing {
    private Package pac;
    private int weight;

    public PackWeightProduct(WeightProduct product, Package pac, int weight) {
        super(product.getName(), product.getDescription());
        this.pac = pac;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public Package getPac() {
        return pac;
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String toString() {
        return String.format("упаковка весового товара %s \nвес %d\n", getName(), getWeight());
    }

    @Override
    public int findNetto() {
        return weight;
    }

    @Override
    public int findBrutto() {
        return weight + pac.getMass();
    }
}

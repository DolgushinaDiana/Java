package PackProducts.packages;

import PackProducts.Packing;
import PackProducts.packages.Package;
import Products.OneProduct;

public class PackOneProduct extends OneProduct implements Packing {
    private int count;
    private Package pac;

    public PackOneProduct(OneProduct product, Package pac, int count) {
        super(product.getName(), product.getThat(), product.getMass());
        this.pac = pac;
        this.count = count;
    }

    public int findNetto() {
        return count * getMass();
    }

    public int findBrutto() {
        return count * getMass() + pac.getMass();
    }

    @Override
    public String toString() {
        return String.format("упаковка штучного товара %s \nколичество %d\n", getName(), count);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public int getMass() {
        return super.getMass();
    }

    @Override
    public String getThat() {
        return super.getThat();
    }

    public Package getPac() {
        return pac;
    }

    public int getCount() {
        return count;
    }
}

import org.junit.Test;


import static org.junit.Assert.*;

public class ProductTest {
    Package pac1 = new Package("dfg", 2);
    Package pac2 = new Package("dfghhh", 4);
    Product p1 = new WeightProduct("apple", "fruit");
    Product p2 = new OneProduct("nut", "oreh", 3);
    WeightProduct product1 = new WeightProduct("dgdf", "sdf");
    OneProduct product2 = new OneProduct("meat", "meat", 3);
    Packing packing1 = new PackOneProduct(product2, pac1, 3);
    Packing packing2 = new PackWeightProduct(product1, pac1, 7);
    Product[] products = {new Product("fuck", "you"), new WeightProduct("app", "fuck")};

    @Test
    public void equalsTest() {
        Product p = new OneProduct("beet", "veg", 2);
        Packing packing = new PackOneProduct(product2, pac2, 3);
        assertTrue(p.equals(new OneProduct("beet", "veg", 2)));
        assertFalse(p.equals(new OneProduct("sd", "fd", 3)));
        assertTrue(packing.equals(new PackOneProduct(product2, pac2, 3)));
    }

    @Test
    public void nettoAndBruttoTest() {
        PackOneProduct packOneProduct = new PackOneProduct(product2, pac1, 4);
        PackWeightProduct packWeightProduct = new PackWeightProduct(product1, pac2, 6);
        assertEquals(12, packOneProduct.findNetto());
        assertEquals(14, packOneProduct.findBrutto());
        assertEquals(6, packWeightProduct.findNetto());
        assertEquals(10, packWeightProduct.findBrutto());

    }
    @Test           // +
    public void hashcodeTest(){
        Product pay=new Product("carrot","veg");
        Product pay2=new Product("carrot","veg");
        assertEquals(pay.hashCode(),pay2.hashCode());
    }


}

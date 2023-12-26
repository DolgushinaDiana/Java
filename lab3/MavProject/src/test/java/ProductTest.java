
import Packages.classes.PackOneProduct;
import Packages.classes.PackWeightProduct;
import Packages.classes.Package;
import Packages.Packing;
import Products.OneProduct;
import Products.Product;
import Products.WeightProduct;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProductTest {
    Package pac1 = new Package("упаковка 1", 2);
    Package pac2 = new Package("упаковка 2", 4);
    Product p1 = new WeightProduct("яблоки", "фрукты");
    Product p2 = new OneProduct("орех", "орехи", 3);
    WeightProduct product1 = new WeightProduct("арбуз", "ягоды");
    OneProduct product2 = new OneProduct("мясо", "мясо", 3);

    Product[] products = {new Product("кабачок", "овощи"), new WeightProduct("яблоки", "фрукты")};

    @Test
    public void equalsTest() {
        Product p = new OneProduct("морковь", "овощи", 2);
        Packing packing = new PackOneProduct(product2, pac2, 3);
        assertTrue(p.equals(new OneProduct("морковь", "овощи", 2)));
        assertFalse(p.equals(new OneProduct("вишня", "ягоды", 3)));
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
        Product pay=new Product("морковь","овощ");
        Product pay2=new Product("морковь","овощ");
        assertEquals(pay.hashCode(),pay2.hashCode());
    }


}

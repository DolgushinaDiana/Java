
import Filters.classes.BeginStringFilter;
import Packages.classes.PackOneProduct;
import Packages.classes.PackWeightProduct;
import Packages.classes.Package;
import Packages.Packing;
import Products.OneProduct;
import Products.WeightProduct;
import org.junit.Test;
import static org.junit.Assert.*;

public class ServiceProductTest {
    @Test
    public void Test() {
        Package pac1=new Package("Упаковка 1",1);
        Package pac2=new Package("Упаковка 2",3);
        OneProduct product1=new OneProduct("картофель","корнеплод",2);
        WeightProduct product2=new WeightProduct("лук","овощ");
        WeightProduct product3=new WeightProduct("лук","овощ");
        Packing[] pack={new PackOneProduct(product1,pac1,4),new PackWeightProduct(product2,pac2,4),new PackWeightProduct(product3,pac1,7)};
        Partia partia=new Partia("первая партия",pack);
        BeginStringFilter fil=new BeginStringFilter("картофель");
        BeginStringFilter fil1=new BeginStringFilter("лук");
        assertEquals(1,ServiceProduct.countByFilter(partia,fil));
        assertEquals(2,ServiceProduct.countByFilter(partia,fil1));
    }
}

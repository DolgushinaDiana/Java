import org.junit.Test;
import static org.junit.Assert.*;
public class ServiceProductTest {
    @Test
    public void Test() {
        Package pac1=new Package("Упаковка 1",1);
        Package pac2=new Package("Упаковка 2",3);
        OneProduct product1=new OneProduct("potato","vegetbles",2);
        WeightProduct product2=new WeightProduct("onion","vegetbles");
        WeightProduct product3=new WeightProduct("garlikc","vegetbles");
        Packing[] pack={new PackOneProduct(product1,pac1,4),new PackWeightProduct(product2,pac2,4),new PackWeightProduct(product3,pac1,7)};
        Partia partia=new Partia("первая партия",pack);
        BeginStringFilter fil=new BeginStringFilter("Упаковка 1");
        assertEquals(2,ServiceProduct.countByFilter(partia,fil));
    }
}

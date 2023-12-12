import org.junit.Test;
import static org.junit.Assert.*;
public class PartiaTest {
    @Test
    public void bruttoTest(){
        Package pac1=new Package("Упаковка 1",1);
        Package pac2=new Package("Упаковка 2",3);
        OneProduct product1=new OneProduct("картофель","корнеплод",2);
        WeightProduct product2=new WeightProduct("лук","овощ");
        WeightProduct product3=new WeightProduct("чеснок","овощ");
        Packing[] pack={new PackOneProduct(product1,pac1,4),new PackWeightProduct(product2,pac2,4),new PackWeightProduct(product3,pac1,7)};
        Partia partia=new Partia("первая партия",pack);
        Partia partia1=new Partia("вторая",new PackOneProduct(product1,pac1,5),new PackOneProduct(product1,pac2,0));
        assertEquals(24,partia.bruttoPartia());
        assertEquals(14,partia1.bruttoPartia());

    }

}

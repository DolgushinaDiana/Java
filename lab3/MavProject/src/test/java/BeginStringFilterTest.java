import org.junit.Test;

import java.util.Arrays;

public class BeginStringFilterTest {
    String str = "мама мыла раму";
    @Test
    public void applyTest(){
        BeginStringFilter fil=new BeginStringFilter("мама");
        BeginStringFilter fil2=new BeginStringFilter("мыла");
        System.out.println(fil.apply(str));
        System.out.println(fil2.apply(str));

    }
    @Test
    public void Test() {
        OneProduct product1=new OneProduct("potato","vegetbles",1);
        WeightProduct product2=new WeightProduct("tomat","vegetbles");
        Package pa=new Package("упаковка",1);
        WeightProduct[] wei={new WeightProduct("po","ta"),new WeightProduct("to","ma")};
        Packing[] pac={new PackWeightProduct(product2,pa,2),new PackOneProduct(product1,pa,6)};
        /*System.out.println(Arrays.toString(pac));*/
        /*System.out.println(Arrays.toString(wei));*/
        Partia p=new Partia("первая партия",pac);
        System.out.println(p.getPac()[0]);
        System.out.println(p);

    }
}
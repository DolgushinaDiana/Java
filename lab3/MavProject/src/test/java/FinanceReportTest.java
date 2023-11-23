import org.junit.Test;
import static org.junit.Assert.*;
public class FinanceReportTest {

    OneProduct product1=new OneProduct("potato","vegetbles",1);
    WeightProduct product2=new WeightProduct("tomat","vegetbles");

    Package pa=new Package("упаковка",1);
    Product product3=new PackOneProduct(product1,pa,4);
    WeightProduct[] wei={new WeightProduct("po","ta"),new WeightProduct("to","ma")};
    Packing[] pac={new PackWeightProduct(product2,pa,2),new PackOneProduct(product1,pa,6)};
    Partia p=new Partia("первая партия",pac);
    BeginStringFilter fil=new BeginStringFilter("potato");
/*
    @Test
    public void Test(){
        System.out.println(ServiceProduct.countByFilter(p,fil));
    }*/
}

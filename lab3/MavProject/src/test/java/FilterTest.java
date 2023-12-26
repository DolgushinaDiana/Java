
import Filters.classes.BeginStringFilter;
import Filters.classes.SecondStringFilter;
import Filters.classes.ThirdStringFilter;
import org.junit.Test;
import static org.junit.Assert.*;

public class FilterTest {

    @Test
    public void secondApplyTest(){          // проверяет что строка содержится n раз
        String str="abcdcba";
        SecondStringFilter fil1=new SecondStringFilter('c',2);
        SecondStringFilter fil2=new SecondStringFilter('c',3);
        assertTrue(fil1.apply(str));
        assertFalse(fil2.apply(str));
    }
    @Test
    public void thirdApplyTest(){           // проверяет что индекс первого вхождения строки равен n
        String str="abcdcba";
        String str2="ababssddd";
        ThirdStringFilter fil1=new ThirdStringFilter("ab",1);
        ThirdStringFilter fil3=new ThirdStringFilter("ab",2);
        ThirdStringFilter fil2=new ThirdStringFilter("a",2);
        assertTrue(fil1.apply(str));
        assertFalse(fil3.apply(str2));
        assertFalse(fil2.apply(str));
    }
    @Test
    public void beginApplyTest(){
        String str = "мама мыла раму";
        BeginStringFilter fil=new BeginStringFilter("мама");
        BeginStringFilter fil2=new BeginStringFilter("мыла");
        assertTrue(fil.apply(str));
        assertFalse(fil2.apply(str));
    }
    @Test(expected = NullPointerException.class)
    public void taxesCaseException() {
        BeginStringFilter fil=new BeginStringFilter("мама");
        System.out.println(fil.apply(null));
    }
}
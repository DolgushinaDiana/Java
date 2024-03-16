import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ListDemoTest {
    @Test
    public void Test() {
        Human obg = new Human(" 1", "", "", 10);
        ArrayList<Human> list = new ArrayList<>();
        list.add(new Human(" 1", "", "", 10));
        list.add(new Human(" 2", "", "", 10));
        list.add(new Human(" 3", "", "", 10));
        list.add(new Human(" 1", "", "", 10));
        ArrayList<Human> fin = new ArrayList<>();
        fin.add(new Human(" 1", "", "", 10));
        fin.add(new Human(" 1", "", "", 10));
        List<Human> same = ListDemo.sameSecondName(list, obg);
        for (Human human : same) {
            System.out.println(human.getSecondName());
        }
    }
    @Test
    public void agesTest(){
        ArrayList<Human> list = new ArrayList<>();
        list.add(new Student("din","","",3,""));
        list.add(new Human("dan","","",30));
        list.add(new Student("don","","",30,""));
        list.add(new Student("din","","",3,""));
        list.add(new Human("dun","","",35));

        List<Human> fin=ListDemo.maxAges(list);
        for (Human human : fin) {
            System.out.println(human.getSecondName());
        }
    }
}
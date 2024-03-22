import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class ListDemoTest {
    @Test
    public void sameAgeTest1() {
        Human obg = new Human("Глазкова", "Юлия", "", 10);
        ArrayList<Human> list = new ArrayList<>();
        Collections.addAll(list,
                new Human("Глазкова", "Мария", "", 10),
                new Human("Ковш", "Игорь", "", 10),
                new Human("Глазкова", "София", "", 10),
                new Human("Минин", "Василий", "", 10));

        List<Human> same = new ArrayList<>();
        Collections.addAll(same,
                new Human("Глазкова", "Мария", "", 10),
                new Human("Глазкова", "София", "", 10));
        assertEquals(same, ListDemo.sameSecondName(list, obg));
    }
    @Test(expected = NullPointerException.class)
    public void sameAgeException() {
        ListDemo.sameSecondName(null, new Human("Глазкова", "Юлия", "", 10));
    }

    @Test
    public void sameAgeTest2() {
        Human obg = new Human("Глазкова", "Юлия", "", 10);
        List<Human> list = new ArrayList<>();
        Collections.addAll(list,
                new Human("Гагарина", "Мария", "", 10),
                new Human("Ковш", "Игорь", "", 10),
                new Human("Голубь", "София", "", 10),
                new Human("Минин", "Василий", "", 10));
        List<Human> same = new ArrayList<>();
        assertEquals(same, ListDemo.sameSecondName(list, obg));
    }

    @Test
    public void agesTest() {
        List<Human> list = new ArrayList<>();
        list.add(new Student("din", "", "", 3, "math"));
        list.add(new Human("dan", "", "", 30));
        list.add(new Student("don", "", "", 35, "language"));
        list.add(new Student("din", "", "", 3, "phylosofy"));
        list.add(new Human("dun", "", "", 35));
        Set<Human> fin = new HashSet<>();
        Collections.addAll(fin,
                new Student("don", "", "", 35, "language"),
                new Human("dun", "", "", 35));
        assertEquals(fin, ListDemo.maxAges(list));
    }
}
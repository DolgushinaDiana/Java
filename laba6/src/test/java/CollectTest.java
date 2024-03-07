import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class CollectTest {
    @Test
    public void firstCharTest1() {           // 1 +
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "faaaa", "afffa", "Faaa", "");
        char c = 'f';

        assertEquals(1, CollectionsDemo.firstChar(c, list));
    }

    @Test
    public void firstCharTest2() {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "faaaa", "afffa", "Faaa", "", "  ", " aa");
        char c = ' ';
        assertEquals(2, CollectionsDemo.firstChar(c, list));
    }

    @Test(expected = NullPointerException.class)
    public void Exception1() {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "faaaa", null, "");
        char c = 'f';
        CollectionsDemo.firstChar(c, list);
    }

    @Test(expected = NullPointerException.class)
    public void Exception2() {
        List<String> list = null;
        list.add("faaaaaaaa");
        char c = 'f';
        CollectionsDemo.firstChar(c, list);
    }


    @Test
    public void copyListTest1() {          // 3 +
        List<Human> list = new ArrayList<>();
        Collections.addAll(list,
                new Human(" 1", "", "", 10),
                new Human("pol", "dol", "sol", 20),
                new Human(" 2", "", "", 10),
                new Human(" 3", "", "", 10),
                new Human("pol", "dol", "sol", 20),
                new Human(" 1", "", "", 10));
        List<Human> fin = new ArrayList<>();
        Collections.addAll(fin,
                new Human(" 1", "", "", 10),
                new Human(" 2", "", "", 10),
                new Human(" 3", "", "", 10),
                new Human(" 1", "", "", 10));
        assertEquals(fin,CollectionsDemo.copyList(new Human("pol", "dol", "sol", 20), list));
    }
    @Test
    public void copyListTest2() {          // 3 +
        List<Human> list = new ArrayList<>();
        Collections.addAll(list,
                new Human(" 1", "", "", 10),
                new Human("pol", "dol", "sol", 20),
                new Human(" 2", "", "", 10));
        List<Human> list2=CollectionsDemo.copyList(new Human("pol", "dol", "sol", 20), list);
        List<Human> fin = new ArrayList<>();
        Collections.addAll(fin,
                new Human(" 1", "", "", 10),
                new Human(" 2", "", "", 10));
        list.add(new Human());
        assertEquals(fin,list2);
    }
    @Test(expected = NullPointerException.class)
    public void Exception3() {
        List<Human> list = new ArrayList<>();
        Collections.addAll(list,
                null,
                new Human("pol", "dol", "sol", 20),
                new Human(" 2", "", "", 10),
                new Human(" 3", "", "", 10),
                new Human("pol", "dol", "sol", 20),
                new Human(" 1", "", "", 10));
        CollectionsDemo.copyList(new Human("pol", "dol", "sol", 20), list);
    }
    @Test(expected = NullPointerException.class)
    public void Exception4() {
        CollectionsDemo.copyList(new Human("pol", "dol", "sol", 20), null);
    }
    @Test(expected = NullPointerException.class)
    public void Exception5() {
        List<Human> list = new ArrayList<>();
        Collections.addAll(list,
                new Human("pol", "dol", "sol", 20),
                new Human(" 2", "", "", 10));
        CollectionsDemo.copyList(null, list);
    }

    @Test
    public void noIntersectionTest1() {       // 4
        List<Set<Integer>> list = new ArrayList<>();
        Set<Integer> mas = new HashSet<>();
        Set<Integer> mas1 = new HashSet<>();
        Set<Integer> mas2 = new HashSet<>();
        Collections.addAll(mas, 1, 2, 30, 4);
        Collections.addAll(mas1, 5, 6, 7, 8);
        Collections.addAll(mas2, 9, 12, 4, 7, 23, 1);
        Collections.addAll(list, mas, mas1, mas2);
        Set<Integer> m = new HashSet<>();
        Collections.addAll(m, 2);
        List<Set<Integer>> res=new ArrayList<>();
        Collections.addAll(res,mas2,mas1);
        List<Set<Integer>> fin = CollectionsDemo.noIntersections(m, list);
        assertEquals(res,fin);
        
        for (Set<Integer> h : fin) {
            for (int i : h) {
                System.out.printf(i + " ");
            }
            System.out.println();
        }
    }
    @Test
    public void noIntersectionTest2() {       // 4
        List<Set<Integer>> list = new ArrayList<>();
        Set<Integer> mas = new HashSet<>();
        Set<Integer> mas1 = new HashSet<>();
        Set<Integer> mas2 = new HashSet<>();
        Collections.addAll(list, mas);

        Set<Integer> m = new HashSet<>();
        Collections.addAll(m, 2, 9);
        List<Set<Integer>> fin = CollectionsDemo.noIntersections(m, list);
        for (Set<Integer> h : fin) {
            for (int i : h) {
                System.out.printf(i + " ");
            }
            System.out.println();
        }
    }

    @Test           // 7
    public void mapsTest() {
        HashMap<Integer, Human> map = new HashMap<>();
        map.put(1, new Human());
        map.put(2, new Human("fox", "", "", 8));
        map.put(3, new Human("tox", "", "", 7));
        map.put(4, new Human());
        HashSet<Integer> num = new HashSet<>();
        num.add(1);
        num.add(3);
        /*num.add(4);*/
        List<Human> fin = CollectionsDemo.setOfHuman(map, num);
        for (Human h : fin) {
            System.out.println(h.getFamil());
        }
    }

    @Test           // 9
    public void mapsTest1() {
        HashMap<Integer, Human> map = new HashMap<>();
        map.put(1, new Human());
        map.put(2, new Human("fox", "", "", 8));
        map.put(3, new Human("tox", "", "", 7));
        map.put(4, new Human(" joel", "", "", 12));
        HashSet<Integer> num = new HashSet<>();

        Map<Integer, Integer> fin = CollectionsDemo.mapByAge(map);
        for (Map.Entry h : fin.entrySet()) {
            System.out.println(h.getKey() + " " + h.getValue());
        }
    }

    @Test           // 8
    public void mapsTest2() {
        HashMap<Integer, Human> map = new HashMap<>();
        map.put(1, new Human());
        map.put(2, new Human("fox", "", "", 8));
        map.put(3, new Human("tox", "", "", 7));
        map.put(4, new Human(" joel", "", "", 12));
        List<Integer> fin = CollectionsDemo.ageFrom19(map);
        for (int h : fin) {
            System.out.println(h);
        }
    }

    @Test           // 10
    public void mapsTest3() {
        HashSet<Human> map = new HashSet<>();
        map.add(new Human());
        map.add(new Human("fox", "", "", 8));
        map.add(new Human("tox", "", "", 8));
        map.add(new Human(" joel", "", "", 12));
        Map<Integer, Set<Human>> fin = CollectionsDemo.fun3(map);
        for (int i : fin.keySet()) {
            System.out.println(i);
            for (Human h : fin.get(i)) {
                System.out.printf(h.getFamil() + " ");
            }
            System.out.println();
        }
    }
}
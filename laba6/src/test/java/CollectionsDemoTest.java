import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class CollectionsDemoTest {
    @Test
    public void firstCharTest1() {           // 1 +
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "faaaa", "afffa", "Faaa", "", "  ", " aa");
        assertEquals(2, CollectionsDemo.firstChar(' ', list));
    }

    @Test
    public void firstCharTest2() {           // 1 +
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "faaaa", "afffa", "Faaa", "", "  ", " aa");
        assertEquals(1, CollectionsDemo.firstChar('f', list));
    }

    @Test
    public void firstCharTest3() {           // 1 +
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "faaaa", "afffa", "Faaa", "", "  ", " aa");
        assertEquals(0, CollectionsDemo.firstChar('h', list));
    }

    @Test(expected = NullPointerException.class)
    public void Exception1() {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "faaaa", null, "");
        CollectionsDemo.firstChar('f', list);
    }

    @Test(expected = NullPointerException.class)
    public void Exception2() {
        CollectionsDemo.firstChar('f', null);
    }

    @Test
    public void copyListTest1() {          // 3 +
        List<Human> list = new ArrayList<>();
        Collections.addAll(list,
                new Human("flora", "", "", 10),
                new Human("pol", "dol", "sol", 20),
                new Human("kandy", "", "", 10),
                new Human("dolly", "", "", 10),
                new Human("pol", "dol", "sol", 20),
                new Human("flora", "", "", 10));
        List<Human> fin = new ArrayList<>();
        Collections.addAll(fin,
                new Human("flora", "", "", 10),
                new Human("kandy", "", "", 10),
                new Human("dolly", "", "", 10),
                new Human("flora", "", "", 10));
        assertEquals(fin, CollectionsDemo.copyList(new Human("pol", "dol", "sol", 20), list));
    }

    @Test
    public void copyListTest2() {          // 3 +
        List<Human> list = new ArrayList<>();
        Collections.addAll(list,
                new Human(" 1", "", "", 10),
                new Human(" 1", "", "", 10));
        assertEquals(new ArrayList<Human>(), CollectionsDemo.copyList(new Human(" 1", "", "", 10), list));
    }

    @Test
    public void copyListTest3() {          // 3 +
        List<Human> list = new ArrayList<>();
        Collections.addAll(list,
                new Human(" 1", "", "", 10),
                new Human("pol", "dol", "sol", 20),
                new Human(" 2", "", "", 10));

        List<Human> list2 = CollectionsDemo.copyList(new Human("pol", "dol", "sol", 20), list);
                // печатаем оба списка
        for (Human h:list){
            System.out.printf(h.getSecondName()+" ");
        }
        System.out.println();
        for (Human h:list2){
            System.out.printf(h.getSecondName()+" ");
        }
        List<Human> fin = new ArrayList<>();
        Collections.addAll(fin,
                new Human(" 1", "", "", 10),
                new Human(" 2", "", "", 10));

        list.add(new Human());              // изменяем изначчальный список

                // печатаем списки еще раз
        System.out.println();
        for (Human h:list){
            System.out.printf(h.getSecondName()+" ");
        }
        System.out.println();
        for (Human h:list2){
            System.out.printf(h.getSecondName()+" ");
        }
        assertEquals(fin, list2);
    }

    @Test(expected = NullPointerException.class)
    public void Exception3() {
        List<Human> list = new ArrayList<>();
        Collections.addAll(list,
                null,
                new Human("pol", "dol", "sol", 20),
                new Human(" 2", "", "", 10));
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
        Collections.addAll(mas, 1, 2, 3);
        Collections.addAll(mas1, 5, 6, 7, 8);
        Collections.addAll(mas2, 4, 5, 0, 11, 12, 33);
        Collections.addAll(list, mas, mas1, mas2);

        Set<Integer> m = new HashSet<>();
        Collections.addAll(m, 2, 3);

        List<Set<Integer>> res = new ArrayList<>();
        Collections.addAll(res, mas1, mas2);

        assertEquals(res, CollectionsDemo.noIntersections(m, list));
        
        /*for (Set<Integer> h : CollectionsDemo.noIntersections(m, list)) {
            for (int i : h) {
                System.out.printf(i + " ");
            }
            System.out.println();
        }*/
    }

    @Test
    public void noIntersectionTest2() {       // 4
        List<Set<Integer>> list = new ArrayList<>();
        Set<Integer> mas = new HashSet<>();
        Set<Integer> mas1 = new HashSet<>();
        Set<Integer> mas2 = new HashSet<>();
        Collections.addAll(mas, 1, 2, 3);
        Collections.addAll(mas1, 5, 6);
        Collections.addAll(mas2, 4, 5, 0);
        Collections.addAll(list, mas, mas1, mas2);
        Set<Integer> m = new HashSet<>();
        Collections.addAll(m, 2, 9, 5);
        List<Set<Integer>> fin = CollectionsDemo.noIntersections(m, list);
        assertEquals(new ArrayList<>(), fin);
    }

    @Test(expected = NullPointerException.class)
    public void noIntersectionTestException1() {       // 4
        CollectionsDemo.noIntersections(new HashSet<>(), null);
    }

    @Test(expected = NullPointerException.class)
    public void noIntersectionTestException2() {       // 4
        List<Set<Integer>> list = new ArrayList<>();
        Set<Integer> mas1 = new HashSet<>();
        Set<Integer> mas2 = new HashSet<>();
        Collections.addAll(mas1, 5, 6);
        Collections.addAll(mas2, 4, 5, 0);
        Collections.addAll(list, mas1, mas2);
        CollectionsDemo.noIntersections(null, list);
    }

    @Test(expected = IllegalArgumentException.class)
    public void noIntersectionTestException3() {       // 4
        List<Set<Integer>> list = new ArrayList<>();
        Collections.addAll(list, new HashSet<>());
        CollectionsDemo.noIntersections(new HashSet<>(), list);
    }

    @Test           // 7
    public void mapsTest() {
        HashMap<Integer, Human> map = new HashMap<>();
        map.put(1, new Human());
        map.put(2, new Human("fox", "", "", 8));
        map.put(3, new Human("tox", "", "", 7));
        map.put(4, new Human());
        Set<Integer> num = new HashSet<>();
        num.add(1);
        num.add(3);
        Set<Human> fin = new HashSet<>();
        Collections.addAll(fin, new Human(), new Human("tox", "", "", 7));
        assertEquals(fin, CollectionsDemo.setOfHuman(map, num));
    }

    @Test(expected = NullPointerException.class)           // 7
    public void mapsException1() {
        HashMap<Integer, Human> map = new HashMap<>();
        map.put(1, new Human());
        map.put(2, new Human("fox", "", "", 8));
        Set<Integer> num = new HashSet<>();
        Collections.addAll(num, 5, 6);
        CollectionsDemo.setOfHuman(map, num);
    }

    @Test(expected = IllegalArgumentException.class)          // 7
    public void mapsException2() {
        HashMap<Integer, Human> map = new HashMap<>();
        map.put(1, new Human());
        map.put(2, new Human("fox", "", "", 8));
        map.put(4, new Human());
        HashSet<Integer> num = new HashSet<>();
        assertEquals(new HashSet<>(), CollectionsDemo.setOfHuman(map, num));
    }

    @Test(expected = NullPointerException.class)          // 7
    public void mapsException3() {
        CollectionsDemo.setOfHuman(null, new HashSet<>());
    }

    @Test(expected = NullPointerException.class)          // 7
    public void mapsException4() {
        HashMap<Integer, Human> map = new HashMap<>();
        map.put(1, new Human());
        CollectionsDemo.setOfHuman(map, null);
    }

    @Test           // 8
    public void ageFrom19Test1() {
        HashMap<Integer, Human> map = new HashMap<>();
        map.put(1, new Human("karol", "marcy", "", 5));
        map.put(2, new Human("fox", "", "", 8));
        map.put(3, new Human("tox", "", "", 18));
        map.put(4, new Human(" joel", "", "", 12));
        List<Integer> fin = new ArrayList<>();
        assertEquals(fin, CollectionsDemo.ageFrom19(map));
    }

    @Test           // 8
    public void ageFrom19Test2() {
        HashMap<Integer, Human> map = new HashMap<>();
        map.put(1, new Human("karol", "marcy", "", 50));
        map.put(2, new Human("fox", "", "", 8));
        map.put(3, new Human("tox", "", "", 50));
        map.put(4, new Human(" joel", "", "", 18));
        List<Integer> fin = new ArrayList<>();
        Collections.addAll(fin, 1, 3);
        assertEquals(fin, CollectionsDemo.ageFrom19(map));
    }

    @Test(expected = NullPointerException.class)          // 8
    public void ageFrom19Exception1() {
        CollectionsDemo.ageFrom19(null);
    }

    @Test(expected = NullPointerException.class)           // 8
    public void ageFrom19Exception2() {
        HashMap<Integer, Human> map = new HashMap<>();
        map.put(1, null);
        map.put(2, new Human("fox", "", "", 8));
        CollectionsDemo.ageFrom19(map);
    }

    @Test           // 9
    public void mapByAgeTest1() {
        Map<Integer, Human> map = new HashMap<>();
        map.put(1, new Human("karol", "marcy", "", 55));
        map.put(2, new Human("fox", "", "", 8));
        map.put(3, new Human("tox", "", "", 8));
        map.put(4, new Human(" joel", "", "", 12));
        Map<Integer, Integer> num = new HashMap<>();
        num.put(1, 55);
        num.put(2, 8);
        num.put(3, 8);
        num.put(4, 12);

        assertEquals(num, CollectionsDemo.mapByAge(map));
        /*Map<Integer, Integer> fin = CollectionsDemo.mapByAge(map);
        for (Map.Entry h : fin.entrySet()) {
            System.out.println(h.getKey() + " " + h.getValue());
        }*/
    }

    @Test(expected = NullPointerException.class)           // 9
    public void mapByAgeException1() {
        Map<Integer, Human> map = new HashMap<>();
        map.put(1, new Human("karol", "marcy", "", 55));
        map.put(2, new Human("fox", "", "", 8));
        map.put(3, new Human("tox", "", "", 8));
        map.put(4, new Human(" joel", "", "", 12));
        Map<Integer, Integer> num = new HashMap<>();
        num.put(1, 55);
        num.put(2, 8);
        num.put(3, 8);
        num.put(4, 12);

        assertEquals(num, CollectionsDemo.mapByAge(map));
        CollectionsDemo.mapByAge(null);

    }

    @Test(expected = NullPointerException.class)           // 9
    public void mapByAgeException2() {
        Map<Integer, Human> map = new HashMap<>();
        map.put(1, null);
        map.put(2, new Human("петя", "", "", 8));
        map.put(3, new Human("вася", "", "", 18));
        CollectionsDemo.mapByAge(map);

    }

    @Test(expected = IllegalArgumentException.class)           // 9
    public void mapByAgeException3() {
        Map<Integer, Human> map = new HashMap<>();
        CollectionsDemo.mapByAge(map);
    }

    @Test           // 10
    public void newMapsTest1() {
        HashSet<Human> map = new HashSet<>();
        map.add(new Human("karol", "marcy", "", 50));
        map.add(new Human("sunny", "", "", 8));
        map.add(new Human("folder", "", "", 8));
        map.add(new Human("joel", "", "", 12));
        Map<Integer, Set<Human>> fin = new HashMap<>();
        Set<Human> list1 = new HashSet<>();
        Set<Human> list2 = new HashSet<>();
        Set<Human> list3 = new HashSet<>();
        Collections.addAll(list1, new Human("karol", "marcy", "", 50));
        Collections.addAll(
                list2,
                new Human("sunny", "", "", 8),
                new Human("folder", "", "", 8));
        Collections.addAll(list3, new Human("joel", "", "", 12));
        fin.put(50, list1);
        fin.put(8, list2);
        fin.put(12, list3);
        assertEquals(fin, CollectionsDemo.newMap(map));
       /* for (int i : fin.keySet()) {
            System.out.printf(i+" ");
            for (Human h : fin.get(i)) {
                System.out.printf(h.getSecondName() + " ");
            }
            System.out.println();
        }*/
    }

    @Test(expected = NullPointerException.class)           // 10
    public void newMapsException1() {
        CollectionsDemo.newMap(null);
    }

    @Test(expected = NullPointerException.class)           // 10
    public void newMapsException2() {
        HashSet<Human> map = new HashSet<>();
        Collections.addAll(map,
                null,
                new Human("sunny", "", "", 8),
                new Human("sunny", "", "", 8));
        CollectionsDemo.newMap(map);
    }
}
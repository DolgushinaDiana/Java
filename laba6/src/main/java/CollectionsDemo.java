import java.util.*;

public class CollectionsDemo {
    // 1 +
    public static int firstChar(char c, List<String> list) {
        if (list == null) throw new NullPointerException();
        if (list.isEmpty()) throw new IllegalArgumentException("list is empty");
        int f = 0;
        for (String str : list) {
            if (str == null) throw new NullPointerException();
            if (str.indexOf(c) == 0) f++;
        }
        return f;
    }

    // 3 +
    public static List<Human> copyList(Human obj, List<Human> list) {
        if (list == null || obj == null) throw new NullPointerException();
        if (list.isEmpty()) throw new IllegalArgumentException();
        List<Human> fin = new ArrayList<>();
        for (Human h : list) {
            if (h == null) throw new NullPointerException();
            if (!h.equals(obj)) fin.add(h);
        }
        return fin;
    }

    // fuck you asshole
    // 4
    public static List<Set<Integer>> noIntersections(Set<Integer> set, List<Set<Integer>> arr) {
        if (set == null || arr == null) throw new NullPointerException();
        if (set.isEmpty() || arr.isEmpty()) throw new IllegalArgumentException();

        List<Set<Integer>> fin = new ArrayList<>();
        boolean tr;

        for (Set<Integer> s : arr) {
            if (s == null) throw new NullPointerException();
            tr = true;
            for (int i:set){
                if (s.contains(i)) {
                    tr = false;
                    break;
                }
            }
            if (tr) fin.add(s);
        }
        return fin;
    }

    // 7 + множество людей с индеф-ми из вход. множества
    public static Set<Human> setOfHuman(Map<Integer, Human> map, Set<Integer> num) {
        if (num == null) throw new NullPointerException("set is null");
        if (map == null) throw new NullPointerException("map is null");
        if (map.isEmpty() || num.isEmpty()) throw new IllegalArgumentException("map is empty");
        Set<Human> fin = new HashSet<>();
        for (int i : num) {
            if (map.get(i) == null) throw new NullPointerException("");
            if (map.containsKey(i)) fin.add(map.get(i));
        }
        return fin;
    }

    // 8 постр. список инд-в людей менее 19 лет
    public static List<Integer> ageFrom19(Map<Integer, Human> map) {
        if (map == null) throw new NullPointerException("map is null");
        if (map.isEmpty()) throw new IllegalArgumentException();
        List<Integer> fin = new ArrayList<>();
        for (/*int i=0;i<map.size();i++*/ int k : map.keySet()) {
            /*if (map.get(i).getAge()<=18)
                fin.add(map);*/
            if (map.get(k).getAge() <= 18) fin.add(k);
        }
        return fin;
    }

    // 9 нов. отоб.: инден-ру сопост возраст чела
    public static Map<Integer, Integer> mapByAge(Map<Integer, Human> map) {
        if (map == null) throw new NullPointerException("map is null");
        if (map.isEmpty()) throw new IllegalArgumentException();
        Map<Integer, Integer> fin = new HashMap<>();
        for (int k : map.keySet()) {
            fin.put(k, map.get(k).getAge());
        }
        return fin;
    }

    // 10 + по мн. людей постр. отобр: возрасту сопоставляет список всех людей данного возраста из входного
    //множества.
    public static Map<Integer, Set<Human>> fun3(Set<Human> set) {
        if (set == null) throw new NullPointerException("map is null");
        if (set.isEmpty()) throw new IllegalArgumentException("set is empty");
        Map<Integer, Set<Human>> fin = new HashMap<>();
        for (Human h : set) {
            if (h == null) throw new NullPointerException();
            fin.computeIfAbsent(h.getAge(), k -> new HashSet<>());
            fin.get(h.getAge()).add(h);
        }
        return fin;
    }
}

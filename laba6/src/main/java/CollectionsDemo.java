import java.util.*;

public class CollectionsDemo {

            // 1 +
    public static int firstChar(char c, List<String> list) {
        if (list.isEmpty()) throw new NullPointerException("loh");
        int f = 0;
        for (String str : list) {
            if (str == null) throw new NullPointerException("loh x2");
            if (str.indexOf(c) == 0) f++;
        }
        return f;
    }

            // 3 +
    public static List<Human> copyList(Human obj, List<Human> list) {
        if (list.isEmpty() || obj==null) throw new NullPointerException("loh");
        List<Human> fin = new ArrayList<>();
        for (Human h : list) {
            if (h==null) throw new NullPointerException("loh");
            if (!h.equals(obj)) fin.add(h);
        }
        return fin;
    }
            // fuck you asshole
            // 4
    public static List<Set<Integer>> noIntersections(Set<Integer> set, List<Set<Integer>> arr) {
        if (set==null||arr==null) throw new NullPointerException();
        List<Set<Integer>> fin = new ArrayList<>();
        Iterator<Integer> it;
        boolean tr;
        for (Set<Integer> s: arr){
            if (s==null) throw new NullPointerException();
            tr=true;
            it= set.iterator();
            while (it.hasNext()&& tr){
                if (s.contains(it.next())) tr=false;
            }
            if (tr) fin.add(set);
        }
        return fin;
    }

            // 7 + множество людей с индеф-ми из вход. множества
    public static List<Human> setOfHuman(Map<Integer,Human> map, Set<Integer> num){
        List<Human> fin=new ArrayList<>();
        for (int i: num){
            if (map.containsKey(i)) fin.add(map.get(i));
        }
        return fin;
    }
            // 8 постр. список инд-в людей менее 19 лет
    public static List<Integer> ageFrom19(Map<Integer,Human> map){
        List<Integer> fin=new ArrayList<>();
        for (/*int i=0;i<map.size();i++*/ int k:map.keySet()){
            /*if (map.get(i).getAge()<=18)
                fin.add(map);*/
            if (map.get(k).getAge()<=18) fin.add(k);
        }
        return fin;
    }
            // 9 нов. отоб.: инден-ру сопост возраст чела
    public static Map<Integer,Integer> mapByAge(Map<Integer,Human> map){
        Map<Integer,Integer> fin=new HashMap<>();
        for (int k:map.keySet()){
            fin.put(k,map.get(k).getAge());
        }
        return fin;
    }

            // 10 + по мн. людей постр. отобр: возрасту сопоставляет список всех людей данного возраста из входного
            //множества.
    public static Map<Integer,Set<Human>> fun3(Set<Human> list){
        Map<Integer,Set<Human>> fin=new HashMap<>();
        for (Human h:list){
            fin.computeIfAbsent(h.getAge(), k -> new HashSet<>());
            fin.get(h.getAge()).add(h);
        }
        for (Human h:list){
            if (!fin.containsKey(h.getAge())){
                fin.put(h.getAge(),new HashSet<Human>());
                Set<Human> arr=new HashSet<>();
                arr.add(h);
                fin.put(h.getAge(),arr);
            }else {
                fin.get(h.getAge()).add(h);
            }
        }
        return fin;
    }
}

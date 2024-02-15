import java.util.*;

public class CollectionsDemo {

            // 1 +
    public static int quation(char c, ArrayList<String> list) {
        if (list.isEmpty()) throw new NullPointerException("loh");
        int f = 0;
        for (String str : list) {
            if (str == null) throw new NullPointerException("loh x2");
            if (str.indexOf(c) == 0) f++;
        }
        return f;
    }

            // 3 +
    public static ArrayList<Human> copy(Human obj, ArrayList<Human> list) {
        ArrayList<Human> fin = new ArrayList<>();
        for (Human h : list) {
            if (!h.equals(obj)) fin.add(h);
        }
        return fin;
    }
            // fuck you asshole
            // 4
    public static ArrayList<HashSet<Integer>> noTouch(HashSet<Integer> list, ArrayList<HashSet<Integer>> arr) {
        ArrayList<HashSet<Integer>> fin = new ArrayList<>();
        HashSet<Integer> h=new HashSet<>(list);
        for (HashSet<Integer> f: arr) {
            HashSet<Integer> c=new HashSet<>(f);
            /*c= (HashSet<Integer>) f.clone();*/
            if (!c.retainAll(list)) fin.add(h);
            /*if (h.retainAll(f)) fin.add(h);*/
        }
        return fin;
    }

            // 7 + множество людей с индеф-ми из вход. множества
    public static ArrayList<Human> func(HashMap<Integer,Human> map, HashSet<Integer> num){
        ArrayList<Human> fin=new ArrayList<>();
        for (int i: num){
            if (map.containsKey(i)) fin.add(map.get(i));
        }
        return fin;
    }
            // 8 постр. список инд-в людей менее 19 лет
    public static ArrayList<Integer> fun1(HashMap<Integer,Human> map){
        ArrayList<Integer> fin=new ArrayList<>();
        for (/*int i=0;i<map.size();i++*/ int k:map.keySet()){
            /*if (map.get(i).getAge()<=18)
                fin.add(map);*/
            if (map.get(k).getAge()<=18) fin.add(k);
        }
        return fin;
    }
            // 9 нов. отоб.: инден-ру сопост возраст чела
    public static HashMap<Integer,Integer> fun2(HashMap<Integer,Human> map){
        HashMap<Integer,Integer> fin=new HashMap<>();
        for (int k:map.keySet()){
            fin.put(map.get(k).getAge(),k);
        }
        return fin;
    }

            // 10 + по мн. людей постр. отобр: возрасту сопоставляет список всех людей данного возраста из входного
            //множества.
    public static HashMap<Integer,HashSet<Human>> fun3(HashSet<Human> list){
        HashMap<Integer,HashSet<Human>> fin=new HashMap<>();
        for (Human h:list){
            if (!fin.containsKey(h.getAge())){
                fin.put(h.getAge(),new HashSet<Human>());
                HashSet<Human> arr=new HashSet<>();
                arr.add(h);
                fin.put(h.getAge(),arr);
            }else {
                fin.get(h.getAge()).add(h);
            }
        }
        return fin;
    }
}

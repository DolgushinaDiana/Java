import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;
import java.util.function.Consumer;

public class CollectTest {
    @Test
    public void Test1() {           // 1 +
        ArrayList<String> list = new ArrayList<>();
        list.add("faaaaaaaa");
        list.add("afaaaaaaa");
        list.add("aaaaaa");
        list.add("faaaaaaaa");
        list.add("");
        char c = 'f';
        int fin= CollectionsDemo.quation(c, list);
        System.out.println(fin);
    }
    @Test
    public void Test2() {
        ArrayList<Human> list = new ArrayList<>();          // 3 +
        list.add(new Human(" 1", "", "", 10));
        list.add(new Human("pol","dol","sol", 20));
        list.add(new Human(" 2", "", "", 10));
        list.add(new Human(" 3", "", "", 10));
        list.add(new Human(" 1", "", "", 10));
        list.add(new Human("pol","dol","sol", 20));
        ArrayList<Human> fin=  CollectionsDemo.copy(new Human("pol","dol","sol", 20), list);
        for (Human h:fin){
            System.out.println(h.getFamil());
        }
        fin.forEach(new Consumer<Human>() {
            @Override
            public void accept(Human human) {
                System.out.println(human.getFamil());
            }
        });
    }
    @Test
    public void Test3() {       // 4
        ArrayList<HashSet<Integer>> list = new ArrayList<>();
        HashSet<Integer> mas=new HashSet<>();
        HashSet<Integer> mas1=new HashSet<>();
        mas.add(1);
        mas.add(2);
        mas.add(4);
        mas.add(6);
        mas1.add(3);
        mas1.add(5);
        mas1.add(7);
        /*mas1.add(4);*/
        list.add(mas);
        list.add(mas1);

        HashSet<Integer> m=new HashSet<>();
        m.add(1);
        m.add(4);
        ArrayList<HashSet<Integer>> fin= CollectionsDemo.noTouch(m, list);
        for (HashSet<Integer> h:fin){
            for (int i:h){
                System.out.println(i);
            }
        }
    }
    @Test           // 7
    public void mapsTest(){
        HashMap<Integer,Human> map=new HashMap<>();
        map.put(1,new Human());
        map.put(2,new Human("fox","","",8));
        map.put(3,new Human("tox","","",7));
        map.put(4,new Human());
        HashSet<Integer> num=new HashSet<>();
        num.add(1);
        num.add(3);
        /*num.add(4);*/
        ArrayList<Human> fin= CollectionsDemo.func(map,num);
        for (Human h: fin) {
            System.out.println(h.getFamil());
        }
    }
    @Test           // 9
    public void mapsTest1(){
        HashMap<Integer,Human> map=new HashMap<>();
        map.put(1,new Human());
        map.put(2,new Human("fox","","",8));
        map.put(3,new Human("tox","","",7));
        map.put(4,new Human(" joel","","",12));
        HashSet<Integer> num=new HashSet<>();

        HashMap<Integer,Integer> fin= CollectionsDemo.fun2(map);
        for (Map.Entry h: fin.entrySet()) {
            System.out.println(h.getKey()+" "+h.getValue());
        }
    }@Test           // 8
    public void mapsTest2(){
        HashMap<Integer,Human> map=new HashMap<>();
        map.put(1,new Human());
        map.put(2,new Human("fox","","",8));
        map.put(3,new Human("tox","","",7));
        map.put(4,new Human(" joel","","",12));
        ArrayList<Integer> fin= CollectionsDemo.fun1(map);
        for (int h: fin) {
            System.out.println(h);
        }
    }
    @Test           // 10
    public void mapsTest3(){
        HashSet<Human> map=new HashSet<>();
        map.add(new Human());
        map.add(new Human("fox","","",8));
        map.add(new Human("tox","","",8));
        map.add(new Human(" joel","","",12));
        HashMap<Integer,HashSet<Human>> fin= CollectionsDemo.fun3(map);
        for (int i:fin.keySet()){
            System.out.println(i);
            for (Human h:fin.get(i)){
                System.out.printf(h.getFamil()+" ");
            }
            System.out.println();
        }
    }
}
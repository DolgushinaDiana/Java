import java.util.ArrayList;
import java.util.*;

public class ListDemo {

            // 2 +
    public static List<Human> sameFamil(List<Human> list, Human obj) {
        List<Human> mas = new ArrayList<>();
        for (Human h : list) {
            if (h.getFamil().equals(obj.famil)) {
                mas.add(h);
            }
        }
        return mas;
    }

            // 5 +
    public static List<Human> ages(List<Human> list){
        List<Human> fin=new ArrayList<>();
        int maxage=-1;
        for (Human h: list){
            if (h.getAge()>maxage) {
                fin.clear();
                fin.add(h);
                maxage=h.getAge();
            }
            else if (h.getAge()==maxage) {
                fin.add(h);
            }
        }
        /*int ma=0;
        for (Human h:list){
            if (h.getAge()>ma) {
                ma=h.getAge();
            }
        }
        for (Human h:list){
            if (h.getAge()==ma) {
                fin.add(h);
            }
        }*/
        return fin;
    }

}

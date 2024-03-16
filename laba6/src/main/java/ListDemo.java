import java.util.ArrayList;
import java.util.*;

public class ListDemo {

    // 2 +
    public static List<Human> sameSecondName(List<Human> list, Human obj) {
        if (list == null) throw new NullPointerException();
        if (list.isEmpty()) throw new IllegalArgumentException();
        List<Human> mas = new ArrayList<>();
        for (Human h : list) {
            if (h == null) throw new NullPointerException();
            if (h.getSecondName().equals(obj.getSecondName())) {
                mas.add(h);
            }
        }
        return mas;
    }

    // 5 +
    public static List<Human> maxAges(List<Human> list) {
        if (list == null) throw new NullPointerException();
        if (list.isEmpty()) throw new IllegalArgumentException();
        List<Human> fin = new ArrayList<>();
        int maxage = -1;
        for (Human h : list) {
            if (h == null) throw new NullPointerException();
            if (h.getAge() > maxage) {
                fin.clear();
                fin.add(h);
                maxage = h.getAge();
            } else if (h.getAge() == maxage) {
                fin.add(h);
            }
        }
        return fin;
    }

}

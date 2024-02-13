import java.util.ArrayList;

public class ListDemo {

            // 2 +
    public static ArrayList<Human> sameFamil(ArrayList<Human> list, Human obj) {
        ArrayList<Human> mas = new ArrayList<>();
        for (Human h : list) {
            if (h.getFamil().equals(obj.famil)) {
                mas.add(h);
            }
        }
        return mas;
    }

            // 5 +
    public static ArrayList<Human> ages(ArrayList<Human> list){
        ArrayList<Human> fin=new ArrayList<>();
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

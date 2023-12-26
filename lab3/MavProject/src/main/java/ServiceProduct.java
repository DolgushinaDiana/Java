import Filters.classes.BeginStringFilter;
import Packages.Packing;

public class ServiceProduct {
    public static int countByFilter(Partia pac, BeginStringFilter fil) {
        int count = 0;
        for (Packing p : pac.getPacking()) {
            if (fil.apply(p.getName())) {
                count++;
            }
        }
        return count;
    }
}

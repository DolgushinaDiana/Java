public class ServiceProduct {
    public static int countByFilter(Partia pac, BeginStringFilter fil) {
        int count = 0;
        for (Packing p : pac.getPac()) {
            if (fil.apply(p.getPac().getName())) {
                count++;
            }
        }
        return count;
    }
}

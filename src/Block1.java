public class Block1 {
    public static void tabulSin(double l, double r, double h) {
        System.out.println("значение синуса");
        for (double x=l;(x<r)||((x+h)<=r); x+=h){
            System.out.println(Math.sin(x));
        }
    }
    public static void solveEquation(double a11,double a12, double b1,double a21,double a22,double b2,double[] solve){
        solve[0]=(b1*a22-b2*a12)/(a11*a22-a12*a21);
        solve[1]=(b2*a11-b1*a21)/(a11*a22-a12*a21);
    }

    public static double seriesTailor(double esp, double x) {
        double sum = 1;
        int n = 1;
        double e = 1;
        while (e > esp) {
            e = e * (x / n++);
            sum += e;
        }
        return sum;
    }
}

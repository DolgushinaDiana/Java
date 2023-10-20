import java.util.Scanner;

public class Block2 {
    public Block2() {
    }

    public static void printMas(double[] arr) {
        double[] var1 = arr;
        int var2 = arr.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            double item = var1[var3];
            System.out.println(item);
        }

    }

    public static void vvodMas(double[] arr, int n) {
        new Scanner(System.in);

        for(int i = 0; i < n; ++i) {
            arr[i] = (double)(i * 3 % 10 - 2);
        }

    }

    public static double sumElem(double[] arr, double sum) {
        double[] var3 = arr;
        int var4 = arr.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            double elem = var3[var5];
            sum += elem;
        }

        return sum;
    }

    public static int evenNumber(double[] arr, int count) {
        double[] var2 = arr;
        int var3 = arr.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            double elem = var2[var4];
            if (elem % 2.0 == 0.0) {
                ++count;
            }
        }

        return count;
    }

    public static int tvelve(double[] arr, double l, double r) {
        int count = 0;
        double[] var6 = arr;
        int var7 = arr.length;

        for(int var8 = 0; var8 < var7; ++var8) {
            double elem = var6[var8];
            if (l < elem && elem < r) {
                ++count;
            }
        }

        return count;
    }

    public static boolean thirteen(double[] arr, boolean t) {
        double[] var2 = arr;
        int var3 = arr.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            double elem = var2[var4];
            if (elem < 0.0) {
                t = false;
            }
        }

        return t;
    }

    public static void reverse(double[] arr) {
        for(int i = 0; i < arr.length / 2; ++i) {
            double temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

    }
}

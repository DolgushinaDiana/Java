public class Vector3DArray {

    public static int lenMas(Vector3D[] arr) {        // N2
        int count = 0;
        for (Vector3D item : arr) {
            count++;
        }
        return count;
    }

    public static void printArray(Vector3D[] arr) {
        for(Vector3D item: arr) {
            item.printVec();
        }
    }

    public static void replace(Vector3D[] arr,Vector3D c, int i) {
        arr[i].setX(c.getX());
        arr[i].setY(c.getY());
        arr[i].setZ(c.getZ());
    }

    public static double maxLen(Vector3D[] arr) {   // N4
        double maxL = 0;
        for (Vector3D elem : arr) {
            if (elem.lenghtVec() > maxL) {
                maxL = elem.lenghtVec();
            }
        }
        return maxL;
    }

    public static int findVec(Vector3D[] arr,Vector3D a) {
        int ind = -1;
        double x = a.getX();
        double y = a.getY();
        double z = a.getZ();

        for(int i = 0; i < arr.length; ++i) {
            if (arr[i].getX() == x && arr[i].getY() == y && arr[i].getZ() == z) {
                ind = i;
            }
        }

        return ind;
    }

    public static Vector3D sumVector(Vector3D[] arr) {
        Vector3D summa = new Vector3D();

        for(int i = 0; i < arr.length; ++i) {
            Vector3DProcessor.sumVec(summa, arr[i], summa);
        }

        return summa;
    }

    public static Vector3D linKom(Vector3D[] arr,double[] mas, Vector3D v) {
        if (lenMas(arr) == mas.length) {
            for(int i = 0; i < lenMas(arr); ++i) {
                v.setX(v.getX() + arr[i].getX() * mas[i]);
                v.setY(v.getY() + arr[i].getY() * mas[i]);
                v.setZ(v.getZ() + arr[i].getZ() * mas[i]);
            }
        }

        return v;
    }

    public static Point3D[] eighteen(Vector3D[] arr,Point3D p, Point3D[] mas) {
        for(int i = 0; i < lenMas(arr); ++i) {
            mas[i].setX(p.getX() + arr[i].getX());
            mas[i].setY(p.getY() + arr[i].getY());
            mas[i].setZ(p.getZ() + arr[i].getZ());
        }
        return mas;
    }
}

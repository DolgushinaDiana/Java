public class Vector3DArray {

    private Vector3D[] arr;

    public Vector3DArray(int n){
        arr = new Vector3D[n];
        for (int i=0;i<n;i++){
            arr[i]=new Vector3D();
        }
    }
    public int lenMas() {
        return arr.length;
    }

    public void printArray() {
        for(Vector3D item: arr) {
            item.printVec();
        }
    }

    public void replace(Vector3D c, int i) {
        arr[i].setX(c.getX());
        arr[i].setY(c.getY());
        arr[i].setZ(c.getZ());
    }

    public double maxLen() {   // N4
        double maxL = 0;
        for (Vector3D elem : arr) {
            if (elem.lenghtVec() > maxL) {
                maxL = elem.lenghtVec();
            }
        }
        return maxL;
    }

    public int findVec(Vector3D a) {
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

    public Vector3D sumVector() {
        Vector3D summa = new Vector3D();

        for(int i = 0; i < arr.length; ++i) {
            summa=Vector3DProcessor.sumVec(summa, arr[i]);
        }

        return summa;
    }

    public Vector3D linKom(double[] mas) {
        Vector3D v=new Vector3D();
        if (lenMas() == mas.length) {
            for(int i = 0; i < lenMas(); ++i) {
                v.setX(v.getX() + arr[i].getX() * mas[i]);
                v.setY(v.getY() + arr[i].getY() * mas[i]);
                v.setZ(v.getZ() + arr[i].getZ() * mas[i]);
            }
        }

        return v;
    }

    public Point3D[] eighteen(Point3D p) {
        Point3D[] mas = new Point3D[arr.length];
        for(int i = 0; i < arr.length; i++) {
            mas[i] = new Point3D(
                    p.getX() + arr[i].getX(),
                    p.getY() + arr[i].getY(),
                    p.getZ() + arr[i].getZ());
        }
        return mas;
    }
}

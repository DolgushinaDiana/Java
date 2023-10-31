public class Vector3DProcessor {


    public static Vector3D sumVec(Vector3D a, Vector3D b) {
        Vector3D c = new Vector3D();
        c.setX(a.getX() + b.getX());
        c.setY(a.getY() + b.getY());
        c.setZ(a.getZ() + b.getZ());
        return c;
    }

    public static Vector3D rasVec(Vector3D a, Vector3D b) {
        Vector3D c = new Vector3D();
        c.setX(a.getX() - b.getX());
        c.setY(a.getY() - b.getY());
        c.setZ(a.getZ() - b.getZ());
        return c;
    }

    public static double skalar(Vector3D a, Vector3D b) {
        return a.getX() * b.getX() + a.getY() * b.getY() + a.getZ() * b.getZ();
    }

    public static Vector3D vecPro(Vector3D a, Vector3D b) {
        Vector3D c = new Vector3D();
        c.setX(a.getY() * b.getZ() - a.getZ() * b.getY());
        c.setY(a.getX() * b.getZ() - a.getZ() * b.getX());
        c.setZ(a.getX() * b.getY() - a.getY() * b.getX());
        return c;
    }

    public static boolean kolPro(Vector3D a, Vector3D b) {
        return a.getY() * b.getZ() - a.getZ() * b.getY() == 0.0 && a.getX() * b.getZ() - a.getZ() * b.getX() == 0.0 && a.getX() * b.getY() - a.getY() * b.getX() == 0.0;
    }
}

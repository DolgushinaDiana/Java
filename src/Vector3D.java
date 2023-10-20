public class Vector3D {
    private double x;
    private double y;
    private double z;

    Vector3D() {
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
    }

    Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    Vector3D(Point3D a, Point3D b) {
        this.x = b.getX() - a.getX();
        this.y = b.getY() - a.getY();
        this.z = b.getZ() - a.getZ();
    }

    public double lenghtVec() {
        return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }

    void printVec() {
        System.out.println(this.x + " " + this.y + " " + this.z);
    }

    public boolean ravenstvoVecrorov(Vector3D a) {
        return a.getX() == this.x && a.getY() == this.y && a.getZ() == this.z;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getZ() {
        return this.z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }
}

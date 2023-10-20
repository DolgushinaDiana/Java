public class Point3D {
    private double x;
    private double y;
    private double z;

    Point3D() {
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
    }

    Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void printPoint() {
        System.out.println("x = " + this.x + " y = " + this.y + " z = " + this.z);
    }

    public boolean equality(Point3D a) {
        return this.x == a.getX() && this.y == a.getY() && this.z == a.getZ();
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

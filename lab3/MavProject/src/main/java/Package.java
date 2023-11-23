import java.util.Objects;

public class Package {
    private String name;
    private int mass;

    public Package(String name,int mass) {
        this.mass = mass;
        this.name=name;
    }

    @Override
    public String toString() {
        return String.format("упаковка %s с массой %d\n",getName(),getMass());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Package aPackage = (Package) o;
        return getMass() == aPackage.getMass() && Objects.equals(getName(), aPackage.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getMass());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }
}
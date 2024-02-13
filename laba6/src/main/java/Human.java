import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class Human {
    String famil;
    String name;
    String otche;
    int age;

    public Human(){
        famil="dim";
        name="dan";
        otche="don";
        age=55;
    }

    public Human(String famil, String name, String otche, int age) {
        this.famil = famil;
        this.name = name;
        this.otche = otche;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOtche() {
        return otche;
    }

    public void setOtche(String otche) {
        this.otche = otche;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFamil() {
        return famil;
    }

    public void setFamil(String famil) {
        this.famil = famil;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return getAge() == human.getAge() && Objects.equals(getFamil(), human.getFamil()) && Objects.equals(getName(), human.getName()) && Objects.equals(getOtche(), human.getOtche());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFamil(), getName(), getOtche(), getAge());
    }
}

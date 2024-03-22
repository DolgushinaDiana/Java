import java.util.Objects;

public class Human {
    private String secondName;
    private String name;
    private String fathersName;
    private int age;

    public Human() {
        secondName = "dim";
        name = "dan";
        fathersName = "don";
        age = 55;
    }

    public Human(String secondName, String name, String fathersName, int age) {
        this.secondName = secondName;
        this.name = name;
        this.fathersName = fathersName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return getAge() == human.getAge() && Objects.equals(getSecondName(), human.getSecondName()) && Objects.equals(getName(), human.getName()) && Objects.equals(getFathersName(), human.getFathersName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSecondName(), getName(), getFathersName(), getAge());
    }
}

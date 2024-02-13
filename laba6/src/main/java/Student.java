import java.util.Objects;

public class Student extends Human{

    private String fucult;

    public Student(String famil, String name, String otche, int age,String fuc) {
        super(famil, name, otche, age);
        this.fucult=fuc;
    }

    public String getFucult() {
        return fucult;
    }

    public void setFucult(String fucult) {
        this.fucult = fucult;
    }


    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getFucult());
    }
}

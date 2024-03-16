import java.util.Objects;

public class Student extends Human {

    private String faculty;

    public Student(String famil, String name, String otche, int age, String fuc) {
        super(famil, name, otche, age);
        this.faculty = fuc;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(faculty, student.faculty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getFaculty());
    }
}

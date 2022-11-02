import java.util.LinkedList;
import java.util.List;

public class Teacher extends Person {

    LinkedList<String> subjects = new LinkedList<>();
    String initials;
    double salary;


    public Teacher(int id, String name, String initials){
        super(id, name);
        this.initials = initials;
    }

    public String getSubjects(){
        return this.subjects.get(0);
    }

    public String getInitials() {
        return initials;
    }

    public double getSalary() {
        return salary;
    }

    public void addSubjects(String subject){
        this.subjects.add(subject);
    }

    public void setSalary(double salary){
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Teacher{" +
                "subjects=" + subjects +
                ", initials='" + initials + '\'' +
                ", salary=" + salary +
                '}';
    }
}

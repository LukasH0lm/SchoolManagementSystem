import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Teacher extends Person {

    private LinkedList<String> subjects = new LinkedList<>();
    private String initials;
    private double salary;


    public Teacher(int id, String name, String initials){
        super(id, name);
        this.initials = initials;
    }

    public String getSubjects(){
        return this.subjects.toString();
    }

    public String getInitials() {
        return initials;
    }

    public double getSalary() {
        return salary;
    }

    public void addSubjects(String subject){

        for (String sub:
                subjects) {
            if (Objects.equals(sub.toLowerCase(), subject.toLowerCase())){
                this.subjects.remove(subject);
            }
        }

        this.subjects.add(subject);
    }

    public void setSalary(double salary){
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Teacher{" +
                "iD=" + getId() +
                "\tname='" + getName() + '\'' +
                "\tsubjects=" + subjects +
                ",\tinitials='" + initials + '\'' +
                ", \tsalary=" + salary +
                '}';
    }
}

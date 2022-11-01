public class Student extends Person {

    private String education;
    private double grade;
    public Student(int id, String name){
        super(id, name);

    }

    public String getEducation() {
        return education;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return this.getId() + "\t" + this.getName() + "\t" +  this.getEmail() + "\t" +  this.getGrade();
    }
}

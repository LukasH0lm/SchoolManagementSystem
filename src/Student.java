import java.util.LinkedList;

public class Student extends Person {

    private String education;
    private LinkedList<GradeInfo> gradeReport;
    public Student(int id, String name){
        super(id, name);
        this.gradeReport = new LinkedList<>();

    }

    public void getGradeReport(){
        for (GradeInfo grade : gradeReport) {
            System.out.println(grade.getSubject() + " : " + grade.getGrade());
        }
        System.out.println();
    }

    public String getEducation() {
        return education;
    }

    public double getAverageGrade(){
        double average = 0;
        double subjects = 0;
        for (GradeInfo grade:
                gradeReport) {
            subjects++;
            average += grade.getGrade();
        }
        average = average / subjects;
        return average;
    }

    public int getGrade(String subject) {
        for (GradeInfo gradeInfo : this.gradeReport) {
            if (gradeInfo.getSubject() == subject) {
                return gradeInfo.getGrade();
            }
        }
        return -1;
    }

    public void addGrade(GradeInfo grade) {
        this.gradeReport.add(grade);
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID='" + getId() + '\'' +
                "name='" + getName() + '\'' +
                "education='" + education + '\'' +
                '}';
    }
}



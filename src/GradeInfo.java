public class GradeInfo {

    String subject;
    int grade;

    GradeInfo(String subject, int grade){

    }

    public String getSubject() {
        return subject;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "GradeInfo{" +
                "subject='" + subject + '\'' +
                ", grade=" + grade +
                '}';
    }
}

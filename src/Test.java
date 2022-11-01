
import java.util.LinkedList;

public class Test {

    public static void personListTest() {




        LinkedList<Teacher> teacherList = new LinkedList<Teacher>();
        Teacher teacher1 = new Teacher(202, "Bent H. Pedersen", "bhp");
        teacher1.setEmail("bhp@easv.dk");
        teacher1.addSubjects("Programming");


        Teacher teacher2 = new Teacher(203, "Lukas V. Holm", "lvh");
        teacher2.setEmail("lukhol01@easv.dk");
        teacher2.addSubjects("Programming");


        teacherList.add(teacher1);
        teacherList.add(teacher2);

        for (Teacher teach : teacherList) {
            System.out.println(teach.toString());

        }

        LinkedList<Student> StudentList = new LinkedList<Student>();
        Student Student1 = new Student(202, "Bent H. Pedersen");
        Student1.setEmail("bhp@easv.dk");
        Student1.setGrade(10);



        Student Student2 = new Student(203, "Lukas V. Holm");
        Student2.setEmail("lukhol01@easv.dk");
        Student2.setGrade(50);


        StudentList.add(Student1);
        StudentList.add(Student2);

        for (Student teach : StudentList) {
            System.out.println(teach.toString());

        }



    }
}

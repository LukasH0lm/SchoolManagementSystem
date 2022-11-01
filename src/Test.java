
import java.util.LinkedList;

public class Test {

    public static void personListTest() {

        LinkedList<Person> personList = new LinkedList<Person>();
        Person HansNielsen = new Person(100, "Hans Nielsen");
        System.out.println();


        LinkedList<Teacher> teacherList = new LinkedList<Teacher>();
        Teacher teacher1 = new Teacher(202, "Bent H. Pedersen", "bhp");
        teacher1.setEmail("bhp@easv.dk");
        teacher1.addSubjects("Programming");


        Teacher teacher2 = new Teacher(203, "Lukas V. Holm", "lvh");
        teacher2.setEmail("lukhol01@easv.dk");
        teacher2.addSubjects("Programming");


        teacherList.add(teacher1);
        teacherList.add(teacher1);

        for (Teacher teach : teacherList) {
            System.out.println(teach.toString());

        }
    }
}

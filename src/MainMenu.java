import java.util.Objects;
import java.util.Scanner;

public class MainMenu{

    protected int EXIT_OPTION = 0;

    private String header;

    private String[] menuItems;

    private String[] studentMenuItems = {"review grades","add grade","show education"};

    private String[] teacherMenuItems = {"set salary","add subjects"};

    Scanner scanner = new Scanner(System.in);
    public MainMenu(String header, String[] menuItems)
    {
        this.header = header;
        this.menuItems = menuItems;

    }

    int getOption()
    {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public void run(PersonManager manager)
    {
        System.out.println("---------------------------------------");
        System.out.println("    EASV School management program");
        System.out.println("---------------------------------------");

        boolean done = false;
        while (!done)
        {
            showMenu();
            int option = getOption();
            doAction(option, manager);
            if (option == EXIT_OPTION)
            {
                done = true;
            }
        }
    }

    void showMenu()
    {
        System.out.println();
        int i = 1;
        for (String item:
                menuItems) {
            System.out.println(item + ": " + i );
            i++;

        }
    }

    void showStudentMenu(Person person)
    {
        System.out.println();
        int i = 1;
        for (String item:
                studentMenuItems) {
            System.out.println(item + ": " + i );
            i++;

        }
        int option = getOption();
        doStudentAction(option, (Student) person);
    }

    void showTeacherMenu(Person person)
    {
        System.out.println();
        int i = 1;
        for (String item:
                teacherMenuItems) {
            System.out.println(item + ": " + i );
            i++;

        }
        int option = getOption();
        doTeacherAction(option, (Teacher) person);
    }


    protected void doAction(int option,PersonManager manager) {

        //doAction needs A PersonManager to know what manager is

        if (option == 1){
            //Get person
            System.out.println("Enter id: ");
            int id = scanner.nextInt();
            Person person = manager.getPerson(id);
            System.out.println(person);
            if (person.getClass() == Student.class){
            showStudentMenu(person);
            }else{
                showTeacherMenu(person);
            }

        }
        if (option == 2){
            //add person
            System.out.println("Enter id: ");
            int id = scanner.nextInt();

            System.out.println("Enter Name: ");
            String name = scanner.next();

            System.out.println("Is the person a teacher? (Y/N)");
            String position = scanner.next();

            if (Objects.equals(position, "y") || Objects.equals(position, "Y")){
                System.out.println("initials: ");
                String initials = scanner.next();
                Teacher teach = new Teacher(id, name, initials);
                manager.addPerson(teach);
            }else{
                Student stud = new Student(id,name);
                manager.addPerson(stud);
            }

        }
        if (option == 3){
            //Remove person
            System.out.println("Enter id: ");
            int id = scanner.nextInt();
            manager.removePerson(id);

        }
        if (option == 4){
            //get all persons
            for (Person pers:
                    manager.getAllPersons()) {
                System.out.println(pers);
            }


        }
        if (option == 5){
            //get all students
            for (Person pers:
                    manager.getAllStudents()) {
                System.out.println(pers);
            }

        }
        if (option == 6){
            //get all teachers
            for (Person pers:
                    manager.getAllTeachers()) {
                System.out.println(pers);
            }


        }

    }

    protected void doStudentAction(int option,Student stud){
        switch (option){
            case 1 -> stud.getGradeReport();
            case 2 -> {
                System.out.println("Enter subject: ");
                String subject = scanner.next();
                System.out.println("Enter grade: ");
                int grade = scanner.nextInt();
                GradeInfo grad = new GradeInfo(subject, grade);
                stud.addGrade(grad);
                System.out.println("grade added");
            }
            case 3 -> System.out.println(stud.getEducation());

        }

    }

    protected void doTeacherAction(int option,Teacher teach){

        switch (option){
            case 1 -> {
                System.out.println("Enter salary: ");
                int salary = scanner.nextInt();
                teach.setSalary(salary);

            }
            case 2 -> {
                System.out.println("Enter subject: ");
                String subject = scanner.next();
                teach.addSubjects(subject);
            }
        }

    }

}

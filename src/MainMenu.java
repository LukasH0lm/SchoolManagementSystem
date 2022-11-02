import java.util.Objects;
import java.util.Scanner;

public class MainMenu{

    protected int EXIT_OPTION = 0;

    // The menu header text
    private String header;

    // The list of menu options texts.
    private String[] menuItems;

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
        int i = 1;
        for (String item:
                menuItems) {
            System.out.println(item + ": " + i );
            i++;

        }
    }


    protected void doAction(int option,PersonManager manager) {

        //doAction needs A PersonManager to know what manager is

        Scanner scanner = new Scanner(System.in);
        if (option == 1){
            System.out.println("Enter id: ");
            int id = scanner.nextInt();
            Person person = manager.getPerson(id);
            System.out.println(person);
        }
        if (option == 2){
            System.out.println("Enter id: ");
            int id = scanner.nextInt();

            System.out.println("Enter Name: ");
            String name = scanner.next();

            System.out.println("Is the person a teacher? (Y/N)");
            String position = scanner.next();

            if (Objects.equals(position, "y") || Objects.equals(position, "Y")){
                System.out.println("initials ");
                String initials = scanner.nextLine();
                Teacher teach = new Teacher(id, name, initials);
                manager.addPerson(teach);
            }else{
                Student stud = new Student(id,name);
                manager.addPerson(stud);
            }

        }
        if (option == 3){
            System.out.println("Enter id: ");
            int id = scanner.nextInt();
            manager.removePerson(id);

        }
        if (option == 4){

            for (Person pers:
                    manager.getAllPersons()) {
                System.out.println(pers);
            }


        }
        if (option == 5){
            for (Person pers:
                    manager.getAllStudents()) {
                System.out.println(pers);
            }

        }
        if (option == 6){
            for (Person pers:
                    manager.getAllTeachers()) {
                System.out.println(pers);
            }


        }

    }
}

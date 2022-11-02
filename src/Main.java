public class Main {
    public static void main(String[] args) {
        setup();

    }


    public static void setup(){
        String[] options = {"Get person", "Add person", "Remove person", "Get all Persons", "Get all students", "Get all Teachers"};

        MainMenu menu = new MainMenu("header text",options);

        PersonManager manager = new PersonManager();

        Student stud1 = new Student(101, "Lukas Holm");
        stud1.setEmail("lukhol01@easv365.dk");
        GradeInfo grade11 = new GradeInfo("SCO",10);
        GradeInfo grade12 = new GradeInfo("ITO",2);

        stud1.addGrade(grade11);
        stud1.addGrade(grade12);
        manager.addPerson(stud1);

        Student stud2 = new Student(102, "Chris Sutherland");
        stud2.setEmail("chrsut01@easv365.dk");
        GradeInfo grade21 = new GradeInfo("SCO",4);
        GradeInfo grade22 = new GradeInfo("ITO",7);

        stud2.addGrade(grade21);
        stud2.addGrade(grade22);
        manager.addPerson(stud2);

        Teacher teach1 = new Teacher(201,"Erik Kristiansen","E.K.");
        teach1.setEmail("ERKR@easv.dk");
        teach1.setSalary(6000);
        teach1.addSubjects("SCO");
        manager.addPerson(teach1);

        Teacher teach2 = new Teacher(202,"Tommy Haugaard","T.H.");
        teach2.setEmail("ERKR@easv.dk");
        teach2.setSalary(10);
        teach2.addSubjects("SDE");
        manager.addPerson(teach2);

        menu.run(manager);

    }

}
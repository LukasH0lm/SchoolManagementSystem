import java.util.LinkedList;

public class PersonManager {

    private LinkedList<Person> persons = new LinkedList<>();

    public PersonManager(){

    }

    public Person getPerson(int id){

        for (Person pers:
                persons) {
            if (pers.getId() == id) {
                return pers;

            }
        }
        return null;
    }

    public void addPerson(Person p){
        boolean isDuplicate = false;

        for (Person pers:
             persons) {
        if (p.getId() == pers.getId()){
            System.out.println("Duplicate ID: entry not added");
            isDuplicate = true;
        }
        }
        if (!isDuplicate){
            persons.add(p);
        }
    }

    void removePerson(int id){
        persons.removeIf(p -> p.getId() == id);

    }

    LinkedList<Person> getAllPersons(){
        return persons;
    }

    LinkedList<Student> getAllStudents(){
        LinkedList<Student> returnList = new LinkedList<>();
        for (Person p:
             persons) {

            if (p.getClass() == Student.class){
                returnList.add((Student) p);
            }

        }
        return returnList;
    }

    LinkedList<Teacher> getAllTeachers(){
        LinkedList<Teacher> returnList = new LinkedList<>();
        for (Person p:
                persons) {

            if (p.getClass() == Teacher.class){
                returnList.add((Teacher) p);
            }

        }
        return returnList;
    }

}

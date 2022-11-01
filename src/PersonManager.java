import java.util.LinkedList;

public class PersonManager {

    LinkedList<Person> personList = new LinkedList<>();

    public void addToList(Person person){
        boolean isDuplicate = false;

        for (Person pers:
             personList) {
        if (person.getId() == pers.getId()){
            System.out.println("Duplicate ID: entry not added");
            isDuplicate = true;
        }
        }
        if (!isDuplicate){
            personList.add(person);
        }
    }

}

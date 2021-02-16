package Behaviors;

import Entities.Person;

import java.util.ArrayList;

public class PersonManagement {
    ArrayList<Person> personArrayList = new ArrayList<>();

    public void addPerson(Person person){
        personArrayList.add(person);
    }
    public void updatePerson(Person person){
        for (Person ePerson:personArrayList) {
            if(ePerson.getIdentity() == person.getIdentity()){
                ePerson.setName(person.getName());
                ePerson.setDOB(person.getDOB());
                ePerson.setJob(person.getJob());
            }
        }
    }
    public void removePerson(int identity){
        for (int i = 0; i < personArrayList.size(); i++) {
            if(personArrayList.get(i).getIdentity() == identity){
                personArrayList.remove(personArrayList.get(i));
            }
        }
    }
    public void showPersonInfo(){
        for (Person ePerson:personArrayList) {
            System.out.println(ePerson.toString());
        }
    }
    public Person getPersonByIdentity(int identity){
        Person person = new Person();
        for (Person ePerson: personArrayList) {
            if(ePerson.getIdentity() == identity){
                person = ePerson;
            }
        }
        return person;
    }
}

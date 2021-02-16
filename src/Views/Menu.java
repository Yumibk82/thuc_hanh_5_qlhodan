package Views;

import Entities.Households;
import Entities.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    static Scanner input = new Scanner(System.in);

    public static Person getPerson(){
        Person person = new Person();
        System.out.println("Enter identity");
            int identity = Integer.parseInt(input.nextLine());
            person.setIdentity(identity);
        System.out.println("Enter name");
            String name = input.nextLine();
            person.setName(name);
        System.out.println("Enter date of birth");
            String DOB = input.nextLine();
            person.setDOB(DOB);
        System.out.println("Enter job");
            String job = input.nextLine();
            person.setJob(job);
        return person;
    }
    public static Households getHouseHolds(){
        Households households = new Households();
        ArrayList<Person> personArrayList = new ArrayList<>();
        System.out.println("Enter households identity");
        int houseHoldsIdentity = Integer.parseInt(input.nextLine());
        households.setHouseHoldsIdentity(houseHoldsIdentity);
        System.out.println("Enter households member quantity");
        int member = Integer.parseInt(input.nextLine());
        households.setMember(member);
        System.out.println("Enter households address number");
        int addressNo = Integer.parseInt(input.nextLine());
        households.setAddressNo(addressNo);
        System.out.println("Enter person list of this households");
        for (int i = 0; i < member; i++) {
            Person person = Menu.getPerson();
            personArrayList.add(person);
        }
        return households;
    }
}

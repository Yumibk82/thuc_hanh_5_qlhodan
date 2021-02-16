package Entities;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Households extends Person {

    private int houseHoldsIdentity;
    private int member;
    private int addressNo;
    private List<Person> persons;

    public Households() {

    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    public int getHouseHoldsIdentity() {
        return houseHoldsIdentity;
    }

    public void setHouseHoldsIdentity(int houseHoldsIdentity) {
        this.houseHoldsIdentity = houseHoldsIdentity;
    }

    public int getMember() {
        return member;
    }

    public void setMember(int member) {
        this.member = member;
    }

    public int getAddressNo() {
        return addressNo;
    }

    public void setAddressNo(int addressNo) {
        this.addressNo = addressNo;
    }

    @Override
    public String toString() {
        String info = houseHoldsIdentity + " " +
                member + " " +
                addressNo + " ";
        for (Person person : persons) {
            info += person.toString();
        }
        return info;
    }
    }

//        StringBuilder info = new StringBuilder("Households{" +
//                "houseHoldsIdentity=" + houseHoldsIdentity + " " +
//                "member=" + member + " " +
//                ", addressNo=" + addressNo + " ");
//        for (Person ePerson: persons) {
//            info.append(ePerson.toString());
//        }
//    return info.toString();
//    }
//    public String toString() {
////        StringBuilder info = new StringBuilder();
//        String info = null;
//        for (Person ePerson: persons)
//        info = ePerson.toString();
//        String info1 = "Households:  "+
//                "1. Identity: "+houseHoldsIdentity+" "+
//                "2. Member: "+member+" "+
//                "3. Address number: "+addressNo+" ";
//        ;
//        final String s = info1 + info;
//        return s;
//        StringBuilder result = new StringBuilder();
//        String newLine = System.getProperty("line.separator");
//        result.append( this.getClass().getName() );
//        result.append( " Object {" );
//        result.append(newLine);
//
//        //determine fields declared in this class only (no fields of superclass)
////        Field[] fields = this.getClass().getDeclaredFields();
//
//        //print field names paired with their values
//        for ( Person person : persons  ) {
//            result.append("  ");
//            try {
//                result.append( person.getName() );
//                result.append(": ");
//                //requires access to private field:
//                result.append( person.get(this) );
//            } catch ( IllegalAccessException ex ) {
//                System.out.println(ex);
//            }
//            result.append(newLine);
//        }
//        result.append("}");
//
////        return result.toString();
//    }
//    }



package Views;

import Behaviors.HouseholdsManagement;
import Behaviors.PersonManagement;
import Entities.Households;
import Entities.Person;
import java.util.ArrayList;
import java.util.Scanner;
public class Program {
    static HouseholdsManagement householdsManagement = new HouseholdsManagement();
    static PersonManagement personManagement = new PersonManagement();

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        do{
            System.out.println("======HOUSEHOLDS MANAGEMENT======");
            System.out.println("1. ADD HOUSEHOLDS");
            System.out.println("2. UPDATE HOUSEHOLDS");
            System.out.println("3. REMOVE HOUSEHOLDS");
            System.out.println("4. SHOW HOUSEHOLDS INFORMATION");
            System.out.println("=================================");
            try {
                int choiceMainMenu = Integer.parseInt(input.nextLine());
                if (choiceMainMenu == 1){
                    System.out.println("=====ADD HOUSEHOLDS=====");
                    Households households = Menu.getHouseHolds();
                    householdsManagement.addHouseHolds(households);
                }else if(choiceMainMenu == 2){
                    System.out.println("=====UPDATE HOUSEHOLDS=====");
                    Households updateHouseHolds = Menu.getHouseHolds();
                    householdsManagement.updateHouseHolds(updateHouseHolds);
                }else if(choiceMainMenu == 3){
                    System.out.println("=====REMOVE HOUSEHOLDS=====");
                    System.out.println("Enter households identity want to remove");
                    int removeHouseHoldsIdentity = Integer.parseInt(input.nextLine());
                    householdsManagement.removeHouseHolds(removeHouseHoldsIdentity);
                }else if(choiceMainMenu ==4){
                    householdsManagement.showHouseHoldsInfo();
                    }
                }
            catch (NumberFormatException e){}
        }while (true);
    }
}

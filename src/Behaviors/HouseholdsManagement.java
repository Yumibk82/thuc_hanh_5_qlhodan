package Behaviors;

import Entities.Households;

import java.util.ArrayList;

public class HouseholdsManagement {
    ArrayList<Households> householdsArrayList = new ArrayList<>();

    public void addHouseHolds(Households addHouseholds){
        householdsArrayList.add(addHouseholds);
    }
    public void updateHouseHolds(Households updateHouseHolds){
        for (Households eHouseHolds: householdsArrayList) {
            if(eHouseHolds.getHouseHoldsIdentity() ==
                    updateHouseHolds.getHouseHoldsIdentity()){
                eHouseHolds.setHouseHoldsIdentity(updateHouseHolds.getHouseHoldsIdentity());
                eHouseHolds.setMember(updateHouseHolds.getMember());
                eHouseHolds.setAddressNo(updateHouseHolds.getAddressNo());
            }
        }
    }
    public void removeHouseHolds(int houseHoldsIdentity){
        for (Households eHouseHolds: householdsArrayList) {
            if(eHouseHolds.getHouseHoldsIdentity() == houseHoldsIdentity){
                householdsArrayList.remove(houseHoldsIdentity);
            }
        }
    }
    public void showHouseHoldsInfo(){
        for (Households eHouseHolds: householdsArrayList) {
            eHouseHolds.toString();
        }
    }
}

package stalls;

import attractions.Attraction;
import behaviours.ISecurity;
import people.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot, int Rating) {
        super(name, ownerName, parkingSpot, Rating);
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() >= 18) {
            return true;
        }else{
            return false;
        }
    }
    public int getRating(Stall stall) {
        return stall.getRating();
    }
}

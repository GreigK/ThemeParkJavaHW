package stalls;

import attractions.Attraction;
import behaviours.IReviewed;

public class CandyflossStall extends Stall implements IReviewed {

    public CandyflossStall(String name, String ownerName, ParkingSpot parkingSpot, int Rating) {
        super(name, ownerName, parkingSpot, Rating);
    }

    public int getRating(Stall stall) {
        return stall.getRating();
    }
}

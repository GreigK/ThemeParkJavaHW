package stalls;

import attractions.Attraction;

public abstract class Stall {

    private String name;
    private String ownerName;
    private ParkingSpot parkingSpot;

    private int Rating;

    public Stall(String name, String ownerName, ParkingSpot parkingSpot, int Rating) {
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public int getRating() {
        return Rating;
    }
}

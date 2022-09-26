package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster extends Attraction implements ISecurity, ITicketed {

    private double price;
    public RollerCoaster(String name, int rating) {
        super(name, rating);
        this.price = 8.40;
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() > 12 && visitor.getHeight() >145) {
            return true;
        }else{
            return false;
        }
    }

    public int getRating(Attraction attraction) {
        return attraction.getRating();
    }

    public double setPrice(){
        return price;

    }

    public double defaultPrice(){
        return price;
    }

    public double priceFor(Visitor visitor){
        if(visitor.getHeight() > 200){
            return defaultPrice() * 2;
        }else{
            return defaultPrice();
        }
    }


}

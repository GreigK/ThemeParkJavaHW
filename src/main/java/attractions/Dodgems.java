package attractions;

import behaviours.IReviewed;
import behaviours.ITicketed;
import people.Visitor;

import java.util.ArrayList;

public class Dodgems extends Attraction implements IReviewed, ITicketed {

    private double price;

    public Dodgems(String name, int rating) {
        super(name, rating);
        this.price = 4.50;
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
        if(visitor.getAge() <= 12){
            return defaultPrice() /2;
        }else{
            return defaultPrice();
        }
    }
}

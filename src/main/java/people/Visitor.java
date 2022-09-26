package people;

import behaviours.IVisited;

import java.util.ArrayList;

public class Visitor {

    private int age;
    private double height;
    private double money;

    private ArrayList<IVisited> visitAttraction;

    public Visitor(int age, double height, double money) {
        this.age = age;
        this.height = height;
        this.money = money;
        this.visitAttraction = new ArrayList<>();
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getMoney() {
        return money;
    }

    public ArrayList<IVisited> getVisitAttraction(){
        return visitAttraction;
    }

    public void visitAttractions(IVisited attractions){
        this.visitAttraction.add(attractions);
    }
}

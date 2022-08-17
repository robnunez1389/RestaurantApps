package com.company;

public class HealthyBurger extends Burger{

    private boolean spinach, mushroom;


    public HealthyBurger(String name) {
        super(name, "Brown Rye Roll", "Veggie Burger");
    }

    public String addSpinach(){
        if(!spinach){
            this.spinach = true;
            this.addItem(.50);
            return "Updated price: $" + String.format("%.2f", this.getPrice());
        }
        return "Spinach has already been added";
    }

    public String addMushroom(){
        if(!mushroom){
            this.mushroom = true;
            this.addItem(.50);
            return "Updated price: $" + String.format("%.2f", this.getPrice());
        }
        return "Mushroom has already been added";
    }

    @Override
    public void printOrder() {
        System.out.println("The base price of a " + getClass().getSimpleName() + " is $" + getSimpleBasePrice() + ".");
        if(isLettuce()){
            System.out.println("You added lettuce for $.25");
        }
        if(isTomato()){
            System.out.println("You added tomato for $.25");
        }
        if(isOnion()){
            System.out.println("You added onion for $.25");
        }
        if(isPickle()){
            System.out.println("You added pickle for $.25");
        }
        if(spinach){
            System.out.println("You added spinach for $.50");
        }
        if(mushroom){
            System.out.println("You added mushroom for $.50");
        }
        System.out.println(getFinalPrice());
    }
}

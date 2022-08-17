package com.company;

public class DeluxeBurger extends Burger {

    private boolean chips, drink;

    public DeluxeBurger(String name, String breadRollType, String meat, boolean chips, boolean drink) {
        super(name, breadRollType, meat);
        super.setPrice(11.25);
        if(!chips){
            super.setPrice(super.getPrice() - 3.00);
        }
        if(!drink){
            super.setPrice(super.getPrice() - 2.00);
        }
        this.chips = chips;
        this.drink = drink;
    }

    @Override
    public String getBasePrice() {
        return String.format("%.2f", 6.25);
    }

    @Override
    public String addLettuce() {
        return "This item cannot be added to a " + getClass().getSimpleName();
    }

    @Override
    public String addTomato() {
        return "This item cannot be added to a " + getClass().getSimpleName();
    }

    @Override
    public String addOnion() {
        return "This item cannot be added to a " + getClass().getSimpleName();
    }

    @Override
    public String addPickle() {
        return "This item cannot be added to a " + getClass().getSimpleName();
    }

    @Override
    public void printOrder() {
        System.out.println("The base price of a " + getClass().getSimpleName() + " is $" + getBasePrice() + ".");
        if(this.chips){
            System.out.println("Chips included in order for $3.00");
        }
        if(this.drink){
            System.out.println("Drink included in order for $2.00");
        }
        System.out.println(getFinalPrice());
    }
}

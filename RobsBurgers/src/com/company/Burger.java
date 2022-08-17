package com.company;

public class Burger {
    private String name;
    private String breadRollType;
    private String meat;
    private boolean lettuce, tomato, onion, pickle;
    private double price;

    public Burger(String name, String breadRollType, String meat) {
        this.name = name;
        this.price = 5.00;
        this.breadRollType = breadRollType;
        this.meat = meat;

//        this.lettuce = lettuce;
//        this.tomato = tomato;
//        this.onion = onion;
//        this.pickle = pickl
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public String getBasePrice(){
        return "Base price is: $" + String.format("%.2f", 5.0);
    }

    public String getSimpleBasePrice(){
        return String.format("%.2f", 5.0);
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public String getFinalPrice() {
        return "Final price: $" + String.format("%.2f", price);
    }

    private String getSimpleFinalPrice(){
        return String.format("%.2f", price);
    }

    public String getName() {
        return name;
    }

    public String addLettuce() {
        if(!lettuce){
            this.lettuce = true;
            this.price += .25;
            // Using String.format to return a number showing 2 decimal places.
            return "Updated price: $" + String.format("%.2f", price);
        }
        return "Lettuce has already been added";
    }

    public String addTomato() {
        if(!tomato){
            this.tomato = true;
            this.price += .25;
            return "Updated price: $" + String.format("%.2f", price);
        }
        return "Tomato has already been added";
    }

    public String addOnion() {
        if(!onion){
            this.onion = true;
            this.price += .25;
            return "Updated price: $" + String.format("%.2f", price);
        }
        return "Onion has already been added";
    }

    public String addPickle() {
        if(!pickle){
            this.pickle = true;
            this.price += .25;
            return "Updated price: $" + String.format("%.2f", price);
        }
        return "Pickle has already been added";
    }

    public void addItem(double amount) {
        this.price = price + amount;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public boolean isTomato() {
        return tomato;
    }

    public boolean isOnion() {
        return onion;
    }

    public boolean isPickle() {
        return pickle;
    }

    public void printOrder(){
        System.out.println("The base price of a " + getClass().getSimpleName() + " is $" + getSimpleBasePrice() + ".");
        if(lettuce){
            System.out.println("You added lettuce for $.25");
        }
        if(tomato){
            System.out.println("You added tomato for $.25");
        }
        if(onion){
            System.out.println("You added onion for $.25");
        }
        if(pickle){
            System.out.println("You added pickle for $.25");
        }
        System.out.println(getFinalPrice());
    }

}

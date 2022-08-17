package com.company;

public class Main {

    public static void main(String[] args) {
        Burger burger = new Burger("Jim", "Sour Dough", "Angus");
        System.out.println(burger.getFinalPrice());
        System.out.println(burger.addLettuce());
        System.out.println(burger.addOnion());
        System.out.println(burger.addLettuce());
        System.out.println(burger.getFinalPrice());
        System.out.println(burger.getName());
        System.out.println(burger.getBasePrice());
        System.out.println();
        HealthyBurger keto = new HealthyBurger("Vegan Person");
        System.out.println(keto.getFinalPrice());
        System.out.println(keto.addSpinach());
        System.out.println(keto.addSpinach());
        System.out.println(keto.addMushroom());
        System.out.println(keto.getBasePrice());
        System.out.println(keto.getFinalPrice());
        keto.printOrder();
        DeluxeBurger deluxe = new DeluxeBurger("BigRob", "italian", "Steak",true, false);
        System.out.println(deluxe.addLettuce());
        burger.printOrder();
        keto.printOrder();
        deluxe.printOrder();

    }
}

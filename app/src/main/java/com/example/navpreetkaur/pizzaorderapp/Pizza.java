package com.example.navpreetkaur.pizzaorderapp;

/**
 * Created by Navpreet kaur on 05/03/2018.
 */

public class Pizza {

    double pizza_size_prize;
    double meat_prize = 0;
    double cheese_prize = 0;
    double veggie_prize = 0;

    public Pizza() {
    }

    public double getCheese_prize() {
        return cheese_prize;
    }

    public double getMeat_prize() {
        return meat_prize;
    }

    public double getPizza_size_prize() {
        return pizza_size_prize;
    }

    public double getVeggie_prize() {
        return veggie_prize;
    }

    public void setCheese_prize(double cheese_prize) {
        this.cheese_prize = cheese_prize;
    }

    public void setMeat_prize(double meat_prize) {
        this.meat_prize = meat_prize;
    }

    public void setPizza_size_prize(double pizza_size_prize) {
        this.pizza_size_prize = pizza_size_prize;
    }

    public void setVeggie_prize(double veggie_prize) {
        this.veggie_prize = veggie_prize;
    }
}

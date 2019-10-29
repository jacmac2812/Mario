/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

/**
 *
 * @author jonassimonsen
 */
public class Pizza {

    private final int pizzaNumber;
    private final String pizzaName;
    private final double price;
    private final String ingredients;

    public Pizza(int pizzaNumber, String pizzaName, double price, String ingredients) {
        this.pizzaNumber = pizzaNumber;
        this.pizzaName = pizzaName;
        this.price = price;
        this.ingredients = ingredients;
    }

    public int getPizzaNumber() {
        return pizzaNumber;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public double getPrice() {
        return price;
    }

    public String getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return pizzaNumber + " " + pizzaName + ", kr:" + price + " " + ingredients + " \n";
    }
}

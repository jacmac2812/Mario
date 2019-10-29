/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import java.util.ArrayList;

/**
 *
 * @author jonassimonsen
 */
public class Order {

    private ArrayList<Pizza> pizzaList;
    private Pizza pizza;
    private int orderNumber;

    public Order(ArrayList<Pizza> pizzaList, Pizza pizza, int orderNumber) {
        this.pizzaList = pizzaList;
        this.pizza = pizza;
        this.orderNumber = orderNumber;
    }
    
    public Order(int orderNumber) {
        this.orderNumber = orderNumber;
        this.pizzaList = new ArrayList();
    }
    
    public void addPizza(Pizza pizza) {
        pizzaList.add(pizza);
    }

    public ArrayList<Pizza> getPizzaList() {
        return pizzaList;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OrderNumber " + orderNumber + "\n");
        for (Pizza pizza : pizzaList) {
            stringBuilder.append(pizza);
        }
        return stringBuilder.toString();
    }
}

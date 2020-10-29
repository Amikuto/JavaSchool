package com.company.Test2.my;

import java.util.ArrayList;
import java.util.List;

public abstract class Food implements Eatable {
    protected String name;
    protected int price;
    protected int amount;
    private ArrayList<String> ingredients;

    Food(String name, int price, int amount, List<String> ingredients){
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.ingredients = new ArrayList(ingredients);
    }

    Food(String name, int price, int amount){
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Food [" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", ingredients=" + ingredients +
                ']';
    }
}

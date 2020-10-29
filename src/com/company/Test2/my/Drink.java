package com.company.Test2.my;

public class Drink extends Food{
    private double capacity;

    Drink(String name, int price, int amount, String size) {
        super(name, price, amount);
        switch (size) {
            case "large" -> this.capacity = 0.8;
            case "medium" -> this.capacity = 0.5;
            case "small" -> this.capacity = 0.3;
        }
    }

    @Override
    public String toString() {
        return "Drink [" +
                "name='" + super.name + '\'' +
                ", price=" + super.price +
                ", amount=" + super.amount +
                ", capacity=" + capacity +
                ']';
    }
}

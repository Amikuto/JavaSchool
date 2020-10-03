package com.company.CarIerarchy;

public class Truck extends Car{
    String cargo;
    int maxMass;
    int size = 2;

    Truck(){

    }

    Truck(String color, int maxSpeed, String type, int currSpeed, int price, String brand, String cargo, int maxMass){
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.transsmissionType = type;
        this.currSpeed = currSpeed;
        this.price = price;
        this.cargo = cargo;
        this.maxMass = maxMass;
        this.brand = brand;
    }

    public void setMaxMass(int maxMass) {
        this.maxMass = maxMass;
    }

    public int getMaxMass() {
        return maxMass;
    }

    @Override
    public int getSize() { return size; }
}

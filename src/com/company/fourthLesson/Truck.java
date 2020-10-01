package com.company.fourthLesson;

public class Truck extends Car{
    String cargo;
    int maxMass;

    Truck(){

    }

    Truck(String color, int maxSpeed, String type, int currSpeed, int price, String cargo, int maxMass){
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.transsmissionType = type;
        this. currSpeed = currSpeed;
        this.price = price;
        this.cargo = cargo;
        this.maxMass = maxMass;
    }

    public void setMaxMass(int maxMass) {
        this.maxMass = maxMass;
    }

    public int getMaxMass() {
        return maxMass;
    }
}

package com.company.CarIerarchy;

public class SportCar extends Car{

    SportCar(){
    }

    SportCar(String color, int maxSpeed, String type, int currSpeed, int price, String brand) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.transsmissionType = type;
        this.currSpeed = currSpeed;
        this.price = price;
        this.brand = brand;
    }
}

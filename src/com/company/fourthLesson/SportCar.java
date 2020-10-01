package com.company.fourthLesson;

public class SportCar extends Car{
    String brand;

    SportCar(){
    }

    SportCar(String color, int maxSpeed, String type, int currSpeed, int price, String brand) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.transsmissionType = type;
        this. currSpeed = currSpeed;
        this.price = price;
        this.brand = brand;
    }
}

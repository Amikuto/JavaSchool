package com.company.fourthLesson;

public class Car {
    protected String color;
    protected int maxSpeed;
    protected String transsmissionType;
    protected int currSpeed;
    protected int price;
    protected String brand;


    Car(){
    }

    Car(String color, int maxSpeed, String type, int currSpeed, int price, String brand) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.transsmissionType = type;
        this. currSpeed = currSpeed;
        this.price = price;
        this.brand = brand;
    }

    public void setCurrSpeed(int currSpeed) {
        this.currSpeed = currSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public int getCurrSpeed() {
        return currSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setTranssmissionType(String transsmissionType) {
        this.transsmissionType = transsmissionType;
    }

    public String getTranssmissionType() {
        return transsmissionType;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void start(){
        while (this.currSpeed < this.maxSpeed){
            this.currSpeed++;
        }
        System.out.println("Скорость машины = " + this.currSpeed);
    }

    public void stop(){
        if (this.currSpeed != 0){
            this.currSpeed = 0;
        } else {
            throw new ArithmeticException();
        }
        System.out.println("Скорость машины = " + this.currSpeed);
    }

    public void accelerate(int speed){
        this.currSpeed += speed;
        System.out.println("Скорость машины = " + this.currSpeed);
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", type='" + transsmissionType + '\'' +
                ", currSpeed=" + currSpeed +
                ", price=" + price +
                '}';
    }
}

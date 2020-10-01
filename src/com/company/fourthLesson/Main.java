package com.company.fourthLesson;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        Car test1 = new Car("Green", 180, "Auto", 80, 450000, "BMW");
//        test1.start();
//        test1.accelerate(-50);


        SportCar test2 = new SportCar("Black", 250, "Mech", 80, 1500000, "BMW");
//        test2.start();
//        test2.accelerate(-50);
//        test2.setCurrSpeed(100);
//        System.out.println(test2);


        Garage garage = new Garage(10, 0, test2);

        garage.addAuto(test2);
    }
}

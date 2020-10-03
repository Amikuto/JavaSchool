package com.company.CarIerarchy;

public class Main {

    public static void main(String[] args){
        Car test1 = new Car("Green", 220, "Auto", 80, 450000, "BMW");
//        test1.start();
//        test1.accelerate(-50);

        Truck truck = new Truck("Orange", 190, "Mech", 90, 5600000,
                    "VOLVO", "Fish", 1200);


        SportCar test2 = new SportCar("Black", 350, "Mech", 135, 1500000, "BMW");
//        test2.start();
//        test2.accelerate(-50);
//        test2.setCurrSpeed(100);
//        System.out.println(test2);


        Garage garage = new Garage(10, 0);
//        garage.addAuto(test2);
//        System.out.println(test2.getClass().getName());
        garage.addAuto(truck);
        garage.addAuto(test1);
        garage.addAuto(test2);
        garage.addAuto(test2);
        garage.addAuto(truck);
        garage.addAuto(truck);
        garage.addAuto(test2);
//        garage.addAuto(truck);
    }
}

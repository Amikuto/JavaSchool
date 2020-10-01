package com.company.fourthLesson;

import java.util.ArrayList;

public class Garage{
    int maxCap = 10;
    int currAuto;
    ArrayList<String> list ;

    Garage(int maxCap, int currAuto, Object car){
        this.maxCap = maxCap;
        this.currAuto = currAuto;
    }

    public void addAuto(Car car){
        currAuto++;
        this.list.add(car.getBrand());
        
//        System.out.println(this.list.get(0));
        System.out.println(car.getMaxSpeed());
//        list.add(car.get)
//        System.out.println(car);
    }



}

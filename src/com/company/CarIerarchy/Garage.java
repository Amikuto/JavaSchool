package com.company.CarIerarchy;

import java.util.HashMap;
import java.util.Map;

public class Garage{
    int maxCap = 10;
    int currAuto;
    Map<String,Integer> dictionary = new HashMap<String,Integer>();

    Garage(int maxCap, int currAuto){
        this.maxCap = maxCap;
        this.currAuto = currAuto;
    }

    public void addAuto(Car car){
        int sum = 0;
        for (int num : dictionary.values()){ sum = sum + num; }
        if (!(sum + car.getSize() <= this.maxCap)){
            throw new ArithmeticException();
        }

        String[] words = car.getClass().getName().split("\\.");
        if (dictionary.keySet().contains(words[words.length-1])){
            int x = dictionary.get(words[words.length-1]);
            dictionary.put(words[words.length-1], x+car.getSize());
        } else{
            dictionary.put(words[words.length-1], car.getSize());
        }
    }
}

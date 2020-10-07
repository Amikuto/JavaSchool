package com.company.CarIerarchy;

import java.util.HashMap;
import java.util.Map;

public class Garage{
    private int maxCap = 10;
    private int currAuto;
    private Map<String,Integer> dictionary = new HashMap<String,Integer>();

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
            this.currAuto++;
        } else{
            dictionary.put(words[words.length-1], car.getSize());
            this.currAuto++;
        }
        System.out.print(dictionary);
    }

    public void print(){

    }
}

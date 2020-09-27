package com.company.secondLession;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Freqdict {
    private String[] mainText;
    private Map<String, Integer> dictionary = new HashMap<String, Integer>();;

    public Freqdict(String mainText) {
        this.mainText = mainText.toLowerCase().split(" ");
    }

    public void count() {
        int x;
        for (String el : this.mainText){
            if (!dictionary.containsKey(el)){
                dictionary.put(el, 1);
            } else{
                x = dictionary.get(el);
                dictionary.put(el, x+1);
            }
        }
    }
}

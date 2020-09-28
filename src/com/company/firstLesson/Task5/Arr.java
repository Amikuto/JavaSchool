package com.company.firstLesson.Task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Arr {

    private int[] mean;
    private int[] weight;
    List<Integer> list = new ArrayList<Integer>();
    private int sum = 0;


    public Arr(int[] mean, int[] weight) {
        this.mean = mean;
        this.weight = weight;

        for (int i = 0; i < weight.length; i++){
            sum += weight[i];
        }

        for (int i=0; i < mean.length; i++){
            int q = 0;
            while (q!=weight[i]){
                list.add(mean[i]);
                q++;
            }
        }
    }

    public void elemReturn(){
        Random random = new Random();
        int x = random.nextInt(list.size());
        System.out.println(list.get(x));
//        return list.get(x);
    }
}

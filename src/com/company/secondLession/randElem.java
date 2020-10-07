package com.company.secondLession;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class randElem {
    ArrayList arrList = new ArrayList();
    LinkedList linkList = new LinkedList();

    public randElem(){
    }

    public void addMill(){
        Random random = new Random();
        while (arrList.size() != 1000000){
            arrList.add(random.nextInt());
        }
        System.out.println("Done array");
        while (linkList.size() != 1000000){
            linkList.add(random.nextInt());
        }
        System.out.println("Done link");
    }

    public void chooseHun(){
        int i = 0;
        while (i<100000){
            Random random = new Random();
            System.out.println(arrList.get(random.nextInt(1000000)));
            i++;
        }
    }

}

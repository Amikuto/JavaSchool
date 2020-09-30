package com.company.fourthLesson;

import java.util.ArrayList;
import java.util.ListIterator;

public class Iterator {
    int[][] m;
    int c = -1;
    ArrayList<Integer> list = new ArrayList<Integer>();
    ListIterator<Integer> listIter = list.listIterator();



    Iterator(int[][] m){
        this.m = m;
        for (int i=0; i<m.length; i++){
            for (int j=0; j<m[0].length; j++){
                list.add(m[i][j]);
            }
        }
    }

    public void next(){
        if (c < list.size()) {
            System.out.println(list.get(c + 1));
            c++;
        } else {
            throw new ArithmeticException();
        }
    }

    public void previous(){
        c--;
        System.out.println(list.get(c));
    }
}

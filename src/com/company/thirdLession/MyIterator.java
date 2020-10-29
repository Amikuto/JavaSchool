package com.company.thirdLession;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class MyIterator {
    int[][] m;
    int c = -1;
    ArrayList<Integer> list = new ArrayList<Integer>();
    ListIterator<Integer> listIter = list.listIterator();



    MyIterator(int[][] m){
        this.m = m;
        for (int i=0; i<m.length; i++){
            for (int j=0; j<m[0].length; j++){
                list.add(m[i][j]);
            }
        }
    }

    public boolean next(){
        if (c < list.size()) {
            System.out.println(list.get(c + 1));
            c++;
        } else {
            throw new NoSuchElementException();
        }
        return false;
    }

    public void previous(){
        c--;
        System.out.println(list.get(c));
    }
}

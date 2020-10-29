package com.company.thirdLession;

import java.util.Iterator;
import java.util.List;

public class DoubleIterator {
    private Iterator iter1;
    private Iterator iter2;
//    private List list1;
//    private List list2;
    private Iterator curr_cl;

    DoubleIterator(List list1, List list2){
        this.iter1 = (Iterator) list1.iterator();
        curr_cl = this.iter1;
        this.iter2 = (Iterator) list2.iterator();
    }

    public void next(){
        System.out.println(curr_cl.next());
    }

    public void nextIter(){
        if (curr_cl == iter2){
            curr_cl = iter1;
        } else if (curr_cl == iter1){
            curr_cl = iter2;
        }
    }
}

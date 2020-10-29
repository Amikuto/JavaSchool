package com.company.testTraining.first;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        FixedPay test1 = new FixedPay(1, "name1", 2845);
        FixedPay test3 = new FixedPay(3, "name3", 81233);
        FixedPay test4 = new FixedPay(4, "name4", 28454);
        FixedPay test5 = new FixedPay(5, "name5", 243000);

//        test1.typeMonth_payment();
//        test1.setName("Vasya");

        HourPay test2 = new HourPay(2, "name2", 171);
        HourPay test6 = new HourPay(6, "name6", 150);
        HourPay test7 = new HourPay(7, "name7", 100);
//        System.out.println(test2.salary);
//        test2.typeMonth_payment();
//        System.out.println("Оплата у 2: " + test2.getMonth_payment());

        List<Base> list = new ArrayList<>();

        list.add(test1);
        list.add(test2);
        list.add(test3);
        list.add(test4);
        list.add(test5);
        list.add(test6);
        list.add(test7);


        Collections.sort(list);

        System.out.println(list);

        for (int i=0;i<5;i++){
            System.out.println(list.get(i).getName());
        }


        for (int i=list.size()-3;i<list.size();i++){
            System.out.println(list.get(i).getId());
        }
    }
}

package com.company.thirdLession;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        HashMap<Integer, String> map = new HashMap<>();
//
//        map.put(1, "TOM");
//        map.put(2, "123");
//
//        map.replace(2, "jerry");
//        map.remove(2);
//
//        map.get(1);
//        map.getOrDefault(2, "DEFAULT");
//
//        for (Map.Entry<Integer, String> entry : map.entrySet()) {
//            System.out.printf("Ключ: %d, Значение %s\n", entry.getKey(), entry.getValue());
//        }

//        int[][] x = {{1, 2, 3}, {4, 5, 6}};
//        MyIterator test = new MyIterator(x);
//        test.next();
//        test.next();
//        test.next();
//        test.next();
//        test.next();
//        test.next();
//        test.next();
//        test.previous();
//        test.previous();
//        test.previous();

        List<String> list1 = new ArrayList<>();
        list1.add("Привет");
        list1.add("Обучающимся");
        list1.add("На");
        list1.add("JavaRush");

        List<String> list2 = new ArrayList<>();
        list2.add("Ну");
        list2.add("ищо");
        list2.add("нло");
        list2.add("РДЖ");

        DoubleIterator test2 = new DoubleIterator(list1, list2);

        test2.next();
        test2.next();
        test2.next();
        test2.nextIter();
        test2.next();
        test2.next();
        test2.next();
        test2.nextIter();
        test2.next();

    }
}

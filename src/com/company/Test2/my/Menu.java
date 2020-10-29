package com.company.Test2.my;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Menu {

    private static List<Food> menu = new ArrayList();
    private static HashMap<String, Integer> set_menu = new HashMap<>();
    private static List<String> stop_list = new ArrayList();

    public static void addToMenu(Food object){
        menu.add(object);

//        System.out.println(set_menu.keySet());

//        set_menu.put(object.getName(), object.getAmount());
    }

    public static void addToStopList(Food object){
        stop_list.add(object.getName());
    }

    public static void showMenu(){
        System.out.println("________________");
        System.out.println("Текущее меню");
        int c = 1;

        for (Food el:menu){
            if (!stop_list.contains(el.getName())){
                System.out.println(c++ + ") " + el);
            }
        }
        System.out.println("________________");
    }

}

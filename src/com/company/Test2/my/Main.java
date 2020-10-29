package com.company.Test2.my;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Dish fries = new Dish("картофель фри", 300, 5, Arrays.asList("соль", "картошка"));
        Drink small_water = new Drink("вода маленькая", 50, 50, "small");
        Drink medium_cola = new Drink("кола средняя", 65, 10, "medium");
        Dish pizza_margarita = new Dish("пицца маргарита", 500, 2, Arrays.asList("тесто", "помидоры", "сыр"));
        Dish sushi = new Dish("суши филадельфия", 250, 5, Arrays.asList("рис", "рыба"));


        Set happy_firstDay = new Set("именинный", 0.75, Arrays.asList(sushi, pizza_margarita, medium_cola, fries));
        Set kids = new Set("детский", 0.95, Arrays.asList(fries, small_water));

        Menu.addToMenu(fries);
        Menu.addToMenu(pizza_margarita);
        Menu.addToMenu(medium_cola);
        Menu.addToMenu(sushi);
        Menu.addToMenu(small_water);
//        Menu.addToMenu(happy_firstDay);
//        Menu.addToMenu(kids);

        Menu.addToStopList(pizza_margarita);
//        Menu.showMenu();

        Order order1 = new Order(1, 1);
        Order order2 = new Order(2, 1);
//        order2.endOrder();
        order1.addToOrder(fries);
        order1.addToOrder(medium_cola);
////        order1.addToOrder(kids);
//        order1.showOrder();

//        fries.setAmount(19);
        Menu.showMenu();
    }
}

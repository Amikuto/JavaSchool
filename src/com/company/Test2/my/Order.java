package com.company.Test2.my;

import java.util.*;

public class Order {
    private int price;
//    private int product_amount;
    private HashMap<Integer, List<Integer>> tables = new HashMap<>();
    private int order_number;
    private int curr_order;
    private int curr_table;
    private ArrayList<Food> composition = new ArrayList();
    private HashMap<Integer, Food> comp = new HashMap<>();

    Order(int order_number, int t){
        if (!tables.containsKey(t)) {
            tables.put(t, Arrays.asList(order_number));
        } else {

        }

        this.order_number = order_number;
        this.curr_order = order_number;
        this.curr_table = t;
    }

    public void setCurr_order(int curr_order) {
        this.curr_order = curr_order;
    }

    public void addToOrder(Food food){

//        if (food.getClass().getSimpleName().equals("Set")){
//            Set food_s = (Set) food;
////            Food food_n = (Food) food;
//            composition.add(food_s);
//            for (int i=0;i<2;i++){
//                System.out.println(food_s.getComposition().get(i).getAmount());
////                food_n.getAmount();
////                food
//            }
//        } else {
//            Food food_n = (Food) food;
//            composition.add(food_n);
//            food_n.setAmount(food_n.getAmount()-1);
//        }

        if (comp.containsKey(curr_order)) {

        } else {
            comp.put(curr_order, food);
        }

        composition.add(food);
        food.setAmount(food.getAmount()-1);
    }

    public void showOrder(){
        System.out.println("________________");
        System.out.println("Заказ под номером: " + order_number);
        int c = 1;
        for (Food el:composition) {
//            System.out.println(el.getClass().getSimpleName());
            System.out.println(c++ + ") " + el.getName());
            price += el.getPrice();
        }
        System.out.println("Стоимость заказа: " + price + " руб.");
        System.out.println("________________");
    }

    public void endTable(){
        tables.remove(curr_table);
    }
}

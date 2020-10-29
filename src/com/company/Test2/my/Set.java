package com.company.Test2.my;

import java.util.ArrayList;
import java.util.List;

public class Set implements Eatable {

    private String name;
    private int price;
    private List<Food> composition;

    public Set (String name, double ratio, List<Food> composition){
        this.name = name;
        this.composition = new ArrayList(composition);

        for (Food el:this.composition) {
            price += el.getPrice();
        }
        this.price = (int) (price * ratio);
    }

    public String getName() {
        return name;
    }

    public List<Food> getComposition() {
        return composition;
    }

    @Override
    public String toString() {
        return "Set [" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", composition=" + composition +
                ']';
    }
}

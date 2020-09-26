package com.company.thirdLession;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "TOM");
        map.put(2, "123");

        map.replace(2, "jerry");
        map.remove(2);

        map.get(1);
        map.getOrDefault(2, "DEFAULT");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.printf("Ключ: %d, Значение %s\n", entry.getKey(), entry.getValue());
        }

    }
}

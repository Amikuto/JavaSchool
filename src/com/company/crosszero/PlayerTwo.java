package com.company.crosszero;

import java.util.Scanner;

public class PlayerTwo {
    private int positionX;
    private int positionY;
    private String name;
    Scanner scanner = new Scanner(System.in);

    PlayerTwo(String name){
        this.name = name;
    }

    public int[] set() {
        System.out.println("Введите столбец");
        positionX = scanner.nextInt();
        System.out.println("Введите строку");
        positionY = scanner.nextInt();

        return new int[] {positionX, positionY};
    }
}

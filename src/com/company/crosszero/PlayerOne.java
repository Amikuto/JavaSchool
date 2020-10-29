package com.company.crosszero;

import java.util.Scanner;

public class PlayerOne{
    private int positionX;
    private int positionY;
    private String name;
    Scanner scanner = new Scanner(System.in);

    PlayerOne(String name){
        this.name = name;
    }

    public int[] set() {
        System.out.println("Игрок, " + this.name);
        System.out.println("Введите столбец: ");
        positionX = scanner.nextInt();
        System.out.println("Введите строку: ");
        positionY = scanner.nextInt();

        return new int[] {positionX, positionY};
    }

    public void check(){}
}

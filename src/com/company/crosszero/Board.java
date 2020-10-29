package com.company.crosszero;

import java.sql.SQLOutput;

public class Board {
//    private int rows;
//    private int columns;
    final char SIGN_X = 'X';
    final char SIGN_Y = 'Y';
    private int[][] desk;

    Board(){
        this.desk = new int[6][6];
    }

    public int[][] getDesk() {
        return desk;
    }

    public void printDesk() {
        for (int i = 0; i < 3; i++) {
//            System.out.print(i+1 + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(desk[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public void set(int[] pos){
        int x = pos[0];
        int y = pos[1];

        this.desk[y-1][x-1] = 1;
    }
}

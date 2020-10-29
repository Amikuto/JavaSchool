package com.company.crosszero;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        board.printDesk();

        PlayerOne playerOne = new PlayerOne("Marta");
        PlayerOne playerTwo = new PlayerOne("Alex");

//        System.out.println(playerOne.set());
        while (true) {
            board.set(playerOne.set());
            board.printDesk();
            board.set(playerTwo.set());
            board.printDesk();
        }
    }
}

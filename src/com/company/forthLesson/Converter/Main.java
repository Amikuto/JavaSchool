package com.company.forthLesson.Converter;

public class Main {
    public static void main(String[] args) {
        FahrToCell fahrToCell = new FahrToCell(30);
        fahrToCell.calculate();

        KelvToCell kelvToCell = new KelvToCell(280);
        kelvToCell.calculate();
    }
}

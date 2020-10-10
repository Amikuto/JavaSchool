package com.company.forthLesson.Converter;

public class CellToFahr implements calc {
    private double cell;

    CellToFahr(){
    }

    CellToFahr(double cell){
        this.cell = cell;
    }

    public void setCell(int cell) {
        this.cell = cell;
    }

    @Override
    public void calculate() {
        System.out.println(cell*34);
    }
}

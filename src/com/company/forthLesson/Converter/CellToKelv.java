package com.company.forthLesson.Converter;

public class CellToKelv implements calc{
    private double cell;

    CellToKelv(){
    }

    CellToKelv(double cell){
        this.cell = cell;
    }

    public void setCell(int cell) {
        this.cell = cell;
    }

    @Override
    public void calculate() {
        System.out.println(cell + 273);
    }
}

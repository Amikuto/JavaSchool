package com.company.forthLesson.Converter;

public class FahrToCell implements calc{
    private double fahr;

    FahrToCell(){
    }

    FahrToCell(int fahr){
        this.fahr = fahr;
    }

    public void setFahr(double fahr) {
        this.fahr = fahr;
    }

    @Override
    public void calculate() {
        double cell;
        cell = (fahr - 32)/2;
        System.out.println(cell + cell/10);
    }
}

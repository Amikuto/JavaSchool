package com.company.forthLesson.Converter;

public class KelvToCell implements calc{
    private double kelv;

    KelvToCell(){
    }

    KelvToCell(double kelv){
        this.kelv = kelv;
    }

    public void setKelv(double kelv) {
        this.kelv = kelv;
    }


    @Override
    public void calculate() {
        System.out.println(kelv - 273);
    }
}

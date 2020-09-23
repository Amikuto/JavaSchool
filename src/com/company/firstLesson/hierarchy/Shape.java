package com.company.firstLesson.hierarchy;

public class Shape {
    private int x;
    private int y;
    private int z;
    private double volume;

    public Shape(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.volume = 0;
    }

    public Shape(int x, int y, int z, double volume){
        this.x = x;
        this.y = y;
        this.z = z;
        this.volume = volume;
    }

    public double getVolume(){
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}

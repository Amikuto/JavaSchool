package com.company.firstLesson.hierarchy;

public class Ball extends SolidOfRevolution{
    private double radius;

    public Ball(double radius){
        this.radius = 4 / 3 * Math.PI * Math.pow(radius, 3);
    }
}

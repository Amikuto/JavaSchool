package com.company.firstLesson.hierarchy;

public class Box extends Shape{

    public Box() {
    }

    public boolean add(Shape shape) {
        if (this.getVolume() < shape.getVolume()) {
            return false;
        } else {
            double emptyVolume = this.getVolume() - shape.getVolume();
            this.setVolume(emptyVolume);
            return true;
        }
    }
}

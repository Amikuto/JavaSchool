package com.company.firstLesson.Vector;

public class Main {

    public static void main(String[] args){
        Vector test3 = new Vector(1, 2, 3);
        Vector test4 = new Vector();
        test3.lengthVector();
        test3.multiScalar(test4);
        test3.multiVector(test4);
        Vector.myMethod();
    }
}

package com.company.firstLesson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Vector {
    private int x;
    private int y;
    private int z;
//    private ArrayList<Integer> lst;
    private ArrayList<Integer> list = new ArrayList<Integer>();

    public ArrayList getList(){
        return list;
    }

    public Vector() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение x");
        this.x = scanner.nextInt();
        System.out.println("Введите значение y");
        this.y = scanner.nextInt();
        System.out.println("Введите значение z");
        this.z = scanner.nextInt();

        list.add(x);
        list.add(y);
        list.add(z);
        System.out.println("Получившийся вектор: " + list);
    }

    public Vector(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
        list.add(x);
        list.add(y);
        list.add(z);

    }

    public void lengthVector(){
        System.out.println(Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z));
    }

    public void multiScalar(Vector other){
//        out = this.x * other.x + this.y * other.y + this.z * other.z;
        System.out.println(this.x * other.x + this.y * other.y + this.z * other.z);
    }

    public void multiVector(Vector other){
        ArrayList<Integer> out_vector = new ArrayList<Integer>();
        out_vector.add(this.y * other.z - this.z * other.y);
        out_vector.add(this.z * other.x - this.x * other.z);
        out_vector.add(this.x * other.y - this.y * other.x);
        System.out.println(out_vector);
    }

    public void angle(Vector other){
        System.out.println((this.x * other.x + this.y * other.y + this.z * other.z)/(Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z) * Math.sqrt(other.x * other.x + other.y * other.y + other.z * other.z)));
    }

    public void vectorSum(Vector other){
        ArrayList<Integer> out_vector = new ArrayList<Integer>();
        out_vector.add(this.x + other.x);
        out_vector.add(this.y + other.y);
        out_vector.add(this.z + other.z);
        System.out.println(out_vector);
    }

    public void vectorDet(Vector other){
        ArrayList<Integer> out_vector = new ArrayList<Integer>();
        out_vector.add(this.x - other.x);
        out_vector.add(this.y - other.y);
        out_vector.add(this.z - other.z);
        System.out.println(out_vector);
    }

    static void myMethod(){
        final Random random = new Random();
        ArrayList out_list = new ArrayList();

        System.out.println("Введите число N: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        while (out_list.size() < n){
            ArrayList in_list = new ArrayList();
            while (in_list.size() != 3){
                in_list.add(random.nextInt());
            }
            out_list.add(in_list);
        }
        System.out.println(out_list);
    }
}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


//        aMatrix test = new aMatrix();

//        System.out.print("Rows: ");
//        test.rows = scan.nextInt();
//        System.out.print("Columns: ");
//        test.columns = scan.nextInt();
//        test.rows = 2;
//        test.columns = 2;

//        test.setMatrix();
//        test.displayInfo();


        Matrix test2 = new Matrix();
        test2.rows = 2;
        test2.columns = 4;
        test2.setMatrix();
        test2.displayInfo();

//        test2.matSum(test);
//        test2.matDet(test);
//        test2.matMultiMat(test);
        //TODO scan in void or outside?
//        test2.matMulti(scan.nextInt());
//        test2.matPow(scan.nextInt());
        test2.Transposed();

        Vector object = new Vector();

    }
}

package com.company.firstLesson.Matrix;

import java.util.Scanner;

public class TestMatrix {
//    class Matrix {

        int rows;
        int columns;
        int[][] matrix;

        TestMatrix(){

        }

        TestMatrix(int matrixRows, int matrixColumns) {
            rows = matrixRows;
            columns = matrixColumns;
        }

        //TODO understand what set do and do I need this
//    void setColumns(int columns) {
//        System.out.print("Columns: ");
//        this.columns = columns;
//    }

//    void setRows(int rows) {
//        System.out.print("Rows: ");
//        this.rows = rows;
//    }

        void setMatrix() {

//        this.rows = rows;
//        this.columns = columns;
//        this.matrix = matrix;

            matrix = new int[rows][columns];
            Scanner scan = new Scanner(System.in);

            for (int i=0; i<matrix.length; i++) {
                for (int j=0; j<matrix[0].length; j++) {
                    System.out.println("Введите значение матрицы на место " + i + " " + j);
                    matrix[i][j] = scan.nextInt();
                }
            }
        }

        void displayInfo(){
            for (int i = 0; i < this.matrix.length; i++) {
                for (int j = 0; j < this.matrix[0].length; j++) {
                    System.out.print(this.matrix[i][j] + "\t");
                }
                System.out.println();
            }
        }

        void matSum(TestMatrix m2) {

            int[][] m_out = new int[rows][columns];
            for (int i = 0; i < this.rows; i++) {
                for (int k = 0; k < this.columns; k++) {
                    m_out[i][k] = this.matrix[i][k] + m2.matrix[i][k];
                }
            }
            System.out.println(m_out[0][0]);
        }

        void matDet(TestMatrix m2) {

            int[][] m_out = new int[rows][columns];
            for (int i = 0; i < this.rows; i++) {
                for (int k = 0; k < this.columns; k++) {
                    m_out[i][k] = this.matrix[i][k] - m2.matrix[i][k];
                }
            }
            System.out.println(m_out[0][0]);
        }

        void matMultiMat(TestMatrix m2) {

            int[][] m_out = new int[rows][columns];
            Scanner scan = new Scanner(System.in);
            for (int i = 0; i < this.rows; i++) {
                for (int k = 0; k < this.columns; k++) {
                    m_out[i][k] = this.matrix[i][k] * m2.matrix[i][k];
                }
            }
            System.out.println(m_out[0][0]);
        }

        void matMulti(int num) {

            int[][] m_out = new int[rows][columns];
            for (int i = 0; i < this.rows; i++) {
                for (int k = 0; k < this.columns; k++) {
                    m_out[i][k] = this.matrix[i][k] * num;
                }
            }
            System.out.println(m_out[0][0]);
        }

        void matPow(int num) {

            int[][] m_out = new int[rows][columns];
            for (int i = 0; i < this.rows; i++) {
                for (int k = 0; k < this.columns; k++) {
                    m_out[i][k] = (int) Math.pow(this.matrix[i][k], num);
                }
            }
            System.out.println(m_out[0][0]);
        }
        //TODO Add void.trans matrix

        void Transposed() {

            int[][] m_out = new int[columns][rows];
            System.out.println(rows + " " + columns);
            m_out[0][0] = matrix[0][0];
            m_out[1][0] = matrix[0][1];
            m_out[2][0] = matrix[0][2];
            m_out[3][0] = matrix[0][3];

            System.out.println(matrix[0][0]);
            System.out.println(matrix[0][1]);
            System.out.println(matrix[0][2]);
            System.out.println(matrix[0][3]);
//        m_out[0][1] = matrix[0][0];
//        m_out[0][2] = matrix[0][1];
//        m_out[0][3] = matrix[0][2];
//        m_out[0][4] = matrix[0][3];

//        for (int i = 0; i < this.rows; i++) {
//            for (int k = 0; k < this.columns; k++) {
//                m_out[i][k] = this.matrix[k][i];
//            }
//        }
//        System.out.print(m_out[0][0] + "\t");
//        System.out.println(m_out[0][1]);
//        System.out.print(m_out[1][0] + "\t");
//        System.out.println(m_out[1][1]);

        }

}

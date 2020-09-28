package com.company.firstLesson.Matrix;

import java.util.Scanner;

public class matrix {
    private int[][] matrix;
    private int m;
    private int n;

    public int[][] getMatrix(){
        return matrix;
    }

    public matrix(int m, int n){
        Scanner scanner = new Scanner(System.in);
        this.m = m;
        this.n = n;
        this.matrix = new int[m][n];
        for(int i=0; i<m; i++){
            System.out.println("Значение строки " + (i+1));
            for (int j=0; j<n; j++){
                this.matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Матрица готова:");
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[0].length; j++) {
                System.out.print(this.matrix[i][j] + "\t");
            }
            System.out.println();
        }

    }

    public matrix(int[][] matrix){
        for(int i=0; i<matrix.length-1; i++){
            if (matrix[i].length != matrix[i+1].length){
                throw new ArithmeticException();
            }
        }
    this.matrix = matrix;
    }

//    private void display(matrix outMatrix){
//        for (int i = 0; i < outMatrix.length; i++) {
//            for (int j = 0; j < outMatrix[0].length; j++) {
//                System.out.print(outMatrix[i][j] + "\t");
//            }
//            System.out.println();
//        }
//    }

    public matrix(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во столбцов");
        this.n = scanner.nextInt();
        System.out.println("Введите кол-во строк");
        this.m = scanner.nextInt();
        this.matrix = new int[m][n];
        for(int i=0; i<m; i++){
            System.out.println("Значение строки " + (i+1));
            for (int j=0; j<n; j++){
                this.matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Матрица готова:");
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[0].length; j++) {
                System.out.print(this.matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void sumMatrix(matrix other) {
        if (m != other.m && n != other.n) {
            throw new ArithmeticException();
        }
        int[][] newMatrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                newMatrix[i][j] = this.matrix[i][j] + matrix[i][j];
            }
        }

        System.out.println("Сумма матриц");
        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix[0].length; j++) {
                System.out.print(newMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void detMatrix(matrix other) {
        if (m != other.m && n != other.n) {
            throw new ArithmeticException();
        }
        int[][] newMatrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                newMatrix[i][j] = this.matrix[i][j] - matrix[i][j];
            }
        }

        System.out.println("Разница матриц");
        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix[0].length; j++) {
                System.out.print(newMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void multiMatrix(matrix other) {
        if (m != other.n && n != other.m) {
            throw new ArithmeticException();
        }
        int[][] newMatrix = new int[m][n];
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < other.matrix[0].length; j++) {
                for (int y = 0; y < other.matrix.length; y++){
                    newMatrix[i][j] += this.matrix[i][y] * other.matrix[y][j];
                }
            }
        }

        System.out.println("Произведене матриц");
        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix[0].length; j++) {
                System.out.print(newMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void transpon(){
        if (this.n != this.m){
            throw new ArithmeticException();
        }
        int[][] newMatrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                newMatrix[j][i] = this.matrix[i][j];
            }
        }

        System.out.println("Транспонирование матриц");
        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix[0].length; j++) {
                System.out.print(newMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    //TODO Try to do this more beauty
    public void exponent(){

        if (this.n != this.m){
            throw new ArithmeticException();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите степень: ");
        int N = scanner.nextInt();
        int q = 1;
        int[][] outMatrix = new int[m][n];
        int[][] same_matrix = new int[m][n];
        int[][] matrix_buffer = new int[m][n];

        for (int i = 0; i < this.m; i++) {
            for (int k = 0; k < this.n; k++) {
                same_matrix[i][k] = this.matrix[i][k];
            }
        }

        for (int i = 0; i < this.m; i++) {
            for (int k = 0; k < this.n; k++) {
                matrix_buffer[i][k] = this.matrix[i][k];
            }
        }

        while (q != N) {
            for (int i = 0; i < outMatrix.length; i++) {
                for (int j = 0; j < outMatrix[0].length; j++) {
                    outMatrix[i][j] = 0;
                }
            }

            for (int i = 0; i < same_matrix.length; i++) {
                for (int j = 0; j < matrix_buffer[0].length; j++) {
                    for (int y = 0; y < matrix_buffer.length; y++) {
                        outMatrix[i][j] += same_matrix[i][y] * matrix_buffer[y][j];
                    }
                }
            }

            for (int i = 0; i < matrix_buffer.length; i++) {
                for (int j = 0; j < matrix_buffer[0].length; j++) {
                    matrix_buffer[i][j] = outMatrix[i][j];
                }
            }
            q++;
        }

        for (int i = 0; i < outMatrix.length; i++) {
            for (int j = 0; j < outMatrix[0].length; j++) {
                System.out.print(outMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

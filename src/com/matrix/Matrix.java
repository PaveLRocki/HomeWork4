package com.matrix;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matrix {
    private Object [][] matrix = new Object[10][10];
    private Object [] diagonal = new Object[20];


    public Matrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if ((i + j) % 3 == 0)
                    matrix[i][j] = randomDouble();
                else
                    matrix[i][j] = randomString();
            }
        }
    }
    private char randomChar(){
        Random randomSym = new Random();
        char sym = (char) (randomSym.nextInt( 26) + 'A');
        return sym;
    }
    private int randomLenght(){
        Random lenght = new Random();
        return lenght.nextInt(7, 8);
    }
    private String randomString(){
        char[] name = new char[randomLenght()];
        for (int i = 0; i < name.length; i++){
            name[i] = randomChar();
        }
        String value = String.copyValueOf(name);
        return  value;
    }
    private Double randomDouble(){
        Random randomSym = new Random();
        Double num = randomSym.nextDouble();
        return Double.parseDouble(String.format("%1.5f", num).replace(",","."));

    }
    public void printMatrix(){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public void createDiagonal(){
        int k = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    diagonal[k] = matrix[i][j];
                    k++;
                }
                else if (i + j == 9){
                    diagonal[k] = matrix[i][j];
                k++;
                }
            }
            }
    }
    public void printDiagonal(){
        for (int i = 0; i < diagonal.length; i++) {
            System.out.print(diagonal[i] + "," + " ");
        }
        System.out.println();{
            System.out.println();
        }
    }
}


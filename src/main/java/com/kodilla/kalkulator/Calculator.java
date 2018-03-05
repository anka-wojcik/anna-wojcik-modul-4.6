package com.kodilla.kalkulator;

public class Calculator {


    public int addAToB(int a, int b) {
        return a + b;
    }

    public int substractBFromA(int a, int b) {
        return a - b;
    }

    public static void main(String args[]) {
        Calculator calculator = new Calculator();
        int result = calculator.addAToB(5, 8);
        System.out.println("Result from the calculator is: " + result);
    }
}

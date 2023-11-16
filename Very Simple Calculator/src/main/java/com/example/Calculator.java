package com.example;
import java.util.Scanner;
public class Calculator {
    int a, b;
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public double multiply(int a, int b) {
        return a * b;
    }
    public double divide(int a, int b) {
        return a / b;
    }
    public double modulus(int a, int b) {
        return a % b;
    }
    public double exponentiation(int a, int b) {
        return Math.pow(a, b);
    }
    public double squareRoot(int a) {
        return Math.sqrt(a);
    }
    public double factorial(int a) {
        int result = 1;
        for(int i = 1; i <= a; i++) {
            result *= i;
        }
        return result;
    }
    public boolean endDiag() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type 'exit' to exit or enter to continue");
        String choice = scanner.nextLine();
        if(choice.equals("exit")){
            return false;
        } else {
            return true;
        }
        
    }{

    }
    
}

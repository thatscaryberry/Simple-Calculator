package com.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);

        System.out.println("What program do you want to run?");
        System.out.println("Options:");
        System.out.println("1. Calculator");

       
        String choice = scanner.nextLine();
        boolean invalid = true;

    while(invalid){
        switch (choice) {
            case "Calculator":
                Calculator calc = new Calculator();
                System.out.print(String.format("\033[H\033[2J"));
                System.out.println("Calculator features: Addition, Subtraction, Multiplication, Division, Modulus, Exponentiation, Square Root, and Factorial");
                System.out.println("Enter operation:");
                String operation = s2.nextLine();
                switch(operation){
                    case "Addition":
                        System.out.println("Enter first number:");
                        int a = scanner.nextInt();
                        System.out.println("Enter second number:");
                        int b = scanner.nextInt();
                        System.out.println(calc.add(a, b));
                        if(calc.endDiag()){
                            choice = "Calculator";
                        } else {
                            invalid = false;
                        }
                        break;
                    case "Subtraction":
                        System.out.println("Enter first number:");
                        a = scanner.nextInt();
                        System.out.println("Enter second number:");
                        b = scanner.nextInt();
                        System.out.println(calc.subtract(a, b));
                        if(calc.endDiag()){
                            choice = "Calculator";
                        } else {
                            invalid = false;
                        }
                        break;
                    case "Multiplication":
                        System.out.println("Enter first number:");
                        a = scanner.nextInt();
                        System.out.println("Enter second number:");
                        b = scanner.nextInt();
                        System.out.println(calc.multiply(a, b));
                        if(calc.endDiag()){
                            choice = "Calculator";
                        } else {
                            invalid = false;
                        }
                        break;
                    case "Division":
                        System.out.println("Enter first number:");
                        a = scanner.nextInt();
                        System.out.println("Enter second number:");
                        b = scanner.nextInt();
                        System.out.println(calc.divide(a, b));
                        if(calc.endDiag()){
                            choice = "Calculator";
                        } else {
                            invalid = false;
                        }
                        break;
                    case "Modulus":
                        System.out.println("Enter first number:");
                        a = scanner.nextInt();
                        System.out.println("Enter second number:");
                        b = scanner.nextInt();
                        System.out.println(calc.modulus(a, b));
                        if(calc.endDiag()){
                            choice = "Calculator";
                        } else {
                            invalid = false;
                        }
                        break;
                    case "Exponentiation":
                        System.out.println("Enter first number:");
                        a = scanner.nextInt();
                        System.out.println("Enter second number:");
                        b = scanner.nextInt();
                        System.out.println(calc.exponentiation(a, b));
                        if(calc.endDiag()){
                            choice = "Calculator";
                        } else {
                            invalid = false;
                        }
                        break;
                    case "Square Root":
                        System.out.println("Enter number:");
                        a = scanner.nextInt();
                        System.out.println(calc.squareRoot(a));
                        if(calc.endDiag()){
                            choice = "Calculator";
                        } else {
                            invalid = false;
                        }
                        break;
                    case "Factorial":
                        System.out.println("Enter number:");
                        a = scanner.nextInt();
                        System.out.println(calc.factorial(a));
                        if(calc.endDiag()){
                            choice = "Calculator";
                        } else {
                            invalid = false;
                        }
                        break; 
                        
                    default:
                        System.out.println("Invalid choice");
                        if(calc.endDiag()){
                            choice = "Calculator";
                        } else {
                            invalid = false;
                        }
                        break; 
                }
                
                break;
            case "exit":
                invalid = false;
                break;
            default:
                System.out.println("Invalid choice\n");
                System.out.println("What program do you want to run?");
                System.out.println("Options:");
                System.out.println("1. Calculator");
                choice = scanner.nextLine();
                break;
        }

    }}}

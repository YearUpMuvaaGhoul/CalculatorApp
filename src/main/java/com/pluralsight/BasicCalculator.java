package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Prompt the user to choose
        System.out.println("Possible calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");
        System.out.print("Please select an option: ");

        //char assigns varable to selected equation

        char operation = scanner.next().charAt(0);

        double result;

        // Perform the selected numbers and math (Case sensitive using switch)
        switch (operation) {
            case 'A':
            case 'a':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case 'S':
            case 's':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case 'M':
            case 'm':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case 'D':
            case 'd':

                // check if dividing by zero
                    if (num2 == 0){
                        System.out.println("error: Cannot divide by 0");
                        return;
                    }

                    //if not dividing by zero, continue code.
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);



        }
    }
}
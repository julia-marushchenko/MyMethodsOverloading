// Java program to demonstrate method overloading

package com.methods;

// Main class
public class Main {

    // Method get to sum two integers
    public int add(int number, int number1){
        int sum = number + number1;
        return sum;
    }

    // Method get to sum three integers
    public int add(int number, int number1, int number2){
        int sum = number + number1 + number2;
        return sum;
    }

    // Method get to sum two doubles
    public double add(double number, double number1){
        double sum = number + number1;
        return sum;
    }

    // Main method to run java program
    public static void main(String[] args) {

        // Creating Main instance
        Main m = new Main();

        // Adding two integers
        int sum = m.add(14, 17);
        // Printing to console the result
        System.out.println(sum);

        // Adding three integers
        int sum1 = m.add(14, 17, 15);
        // Printing to console the result
        System.out.println(sum1);

        // Adding two doubles
        double sum2 = m.add(14.7, 17.4);
        // Printing to console the result
        System.out.println(sum2);
    }
}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number = 0;
        String numberString;
        Scanner scanner = new Scanner(System.in);
        double result = 0;

        System.out.println("Please select a number from the menu: \n");
        System.out.println("1. Calculate the area of a Circle.");
        System.out.println("2. Calculate the area of a Square.");
        System.out.println("3. Calculate the area of a Triangle.");
        System.out.println("4. Calculate the area of a Rectangle.\n");


            System.out.println("\nEnter the number of your selection: ");
            number = scanner.nextInt();


            switch (number) {
                case 1:
                    System.out.println("You selected to calculate the area of a circle.");
                    String radius = getInput("Enter the radius of the circle: ");
                    result = circle(radius);
                    break;
                case 2:
                    System.out.println("You selected to calculate the area of a square.");
                    String length1 = getInput("Enter the length of one side of the square: ");
                    result = square(length1);
                    break;
                case 3:
                    System.out.println("You selected to calculate the area of a triangle.");
                    String base1 = getInput("Enter the base of the triangle: ");
                    String height1 = getInput("Enter the height of the triangle: ");
                    result = triangle(base1, height1);
                    break;
                case 4:
                    System.out.println("You selected to calculate the area of a rectangle.");
                    String width1 = getInput("Enter the width of the rectangle: ");
                    String height2 = getInput("Enter the height of the rectangle: ");
                    result = rectangle(width1, height2);
                    break;
                default:
                    System.out.println("Please enter a number between 1 and 4.");
                    return;
            }
            System.out.println("The result is:  " + result);
        }

    public static double circle( String radius ) {
        double pi = 3.14;
        double r1 = Double.parseDouble(radius);
        return pi * (r1 *r1);
    }

    public static double square( String length1 ){
        double l1 = Double.parseDouble(length1);
        return  l1 * l1;
    }

    public static double triangle( String base1, String height1 ){
            double b1 = Double.parseDouble(base1);
            double h1 = Double.parseDouble(height1);
            return .5 * b1* h1;
    }

    public static double rectangle( String width1, String height2){
                double w1 = Double.parseDouble(width1);
                double h1 = Double.parseDouble(height2);
                return w1 * h1;
    }

    public static String getInput(String number){
        System.out.print(number);
        Scanner sc = new Scanner (System.in);
        return sc.nextLine();
    }
}

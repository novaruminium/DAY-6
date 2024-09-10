package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Select the number for the question: ");
        System.out.println("1. Java Array Program For Array Rotation.");
        System.out.println("2. Write a Java Program to Check if Array Contain Duplicates.");
        System.out.println("3. Java Array Program to Remove Duplicate Elements From an Array.");
        System.out.println("4. Java Array Program to sort array in increasing & decreasing order.");
        System.out.println("5. Java Array Program to Remove All Occurrences of an Element in an Array.");
        System.out.println("6. Java Program to Reverse a String Without Using Built-in Methods.");
        System.out.println("7. Java String Program to Find all Duplicates on Array.");
        System.out.println("8. Java Program to get the number of days you have to wait after the i-th day to get a warmer temperature.");
        System.out.print("Enter choice: ");
        int a = scan.nextInt();

        switch (a)
        {
            case 1:
//              Java Array Program For Array Rotation.
                System.out.println("How many digit do you want to input?");
                int digit = scan.nextInt();

                System.out.println("Input the target: ");
                int target = scan.nextInt();

                ArrayList<Integer> reversedNumber = RotateDigits.rotateDigits(digit, target);
                System.out.println("Here is your reversed number: " + reversedNumber);

                break;


            case 2:
//              Write a Java Program to Check if Array Contain Duplicates.

                break;


            case 3:
//              Java Array Program to Remove Duplicate Elements From an Array.

                break;


            case 4:
//              Java Array Program to sort array in increasing & decreasing order.

                break;


            case 5:
//              Java Array Program to Remove All Occurrences of an Element in an Array.

                break;


            case 6:
//              Java Program to Reverse a String Without Using Built-in Methods.

                break;


            case 7:
//              Java String Program to Find all Duplicates on Array.

                break;


            case 8:
//              Java Program to get the number of days you have to wait after the i-th day to get a warmer temperature.

                break;


            default:
                System.out.println("Invalid choice");
                break;
        }
        scan.close();
    }
}
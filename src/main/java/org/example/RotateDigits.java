package org.example;

import java.util.Scanner;
import java.util.ArrayList;

public class RotateDigits {
    public static ArrayList<Integer> rotateDigits(int digit, int target){
        Scanner scan = new Scanner(System.in);

        //create a new ArrayList to store the answer.
        ArrayList<Integer> answer = new ArrayList<Integer>();

        System.out.println("Input the number:");

        //creating loop to read the input number.
        for (int i = 0 ; i < digit ; i++){
            int n = scan.nextInt();
            answer.add(n);
        }

        //creating loop to rotate the words around.
        for (int i = 0 ; i < target ; i++){
            int firstElement = answer.remove(0);
            answer.add(firstElement);
        }
        return answer;
    }
}

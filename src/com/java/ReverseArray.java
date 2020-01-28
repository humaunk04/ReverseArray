package com.java;

import java.util.Scanner;

public class ReverseArray {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        // Create scanner object for taking input form console.
        System.out.println(" Enter the number of element");
        // Capturing the number of elements in to num
        int num = input.nextInt();
        // Create an array with size num
        int a[] = new int [num];
        // Read the elements in the array
        System.out.println( " Enter the element in to the array");
        for(int i = 0; i < num; i++){
            a [i] = input.nextInt();
        }
        // 1 2 3 4 5 6
        System.out.println(" Printing the reverse element in the array");
        for (int i = a.length - 1; i >= 0; i--){
            System.out.println(a [i]);
        }
    }
}

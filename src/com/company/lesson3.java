package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class lesson3 {

    public static void main(String[] args) {

        Scanner input1 = new Scanner(System.in);
        System.out.println("Input the length of the array");
        System.out.print("(Integer between 1 and 100): ");
        int[] my_length = new int [input1.nextInt()];

        Random rn = new Random();
        int a = -50;
        int b = 50;
        int diff = b-a;

        for (int i = 0; i < my_length.length; i++) {
            my_length[i] = a + rn.nextInt(b - a + 1);

            System.out.println(my_length[i] + "  ");
        }

        int total = Arrays.stream(my_length).sum();
        double avg = total / my_length.length;
        System.out.println("The average of all values is " + avg);

        Arrays.sort(my_length);
        System.out.println("The minimum value is " + my_length[0]);
        System.out.println("The maximum value is " + my_length[my_length.length-1]);

        }
}

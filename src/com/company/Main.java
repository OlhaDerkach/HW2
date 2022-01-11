package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input1 = new Scanner(System.in);
    System.out.print("Input your grade on a 12-point scale: ");
    double grade = input1.nextDouble();
    String analog = "Your grade on a 5-point scale is ";

    if (grade >=1 && grade <=3) System.out.println(analog + "2");
    else if (grade >3 && grade <=6) System.out.println(analog + "3");
    else if (grade >6 && grade <=9) System.out.println(analog + "4");
    else if (grade >9 && grade <=12) System.out.println(analog + "5");
    else System.out.println("Please enter the correct grade");
    }
}

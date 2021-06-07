/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 jiahao zhu
 */

import java.util.Scanner;

public class roomCal {
    public static void main(String[] args) {
        final double formula = 0.09290304;
        System.out.println("What is the length of the room in feet?");
        Scanner scan = new Scanner(System.in);
        double length = scan.nextDouble();
        System.out.println("What is the width of the room in feet?");
        double width = scan.nextDouble();

        double area = length * width;
        double marea = area * formula;
        System.out.println("You entered dimensions of " + length +"feet by " + width + "feet");
        System.out.println("The area is \n" + area + "square feet\n" + marea + " square meters" );
    }
}

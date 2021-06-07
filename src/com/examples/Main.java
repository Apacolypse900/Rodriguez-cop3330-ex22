package com.examples;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jesus Rodriguez
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        int first;
        int second;
        int third;

        System.out.print("Enter the first number: ");
            first = myObj.nextInt();

        System.out.print("Enter the second number: ");
            second = myObj.nextInt();

        System.out.print("Enter the third number: ");
            third = myObj.nextInt();

        if (first > second){
            if (first > third)
                System.out.println("The largest number is: " + first);
            else
                System.out.println("The largest number is: " + third);
        }
        else if (second > third)
            System.out.println("The largest number is: " + second);
        else
            System.out.println("The largest number is: " + third);
    }
}

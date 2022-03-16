package com.basic;

import java.util.Scanner;

public class CodingPractise3 {
    public static void main(String[] args) {
        int number;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        number=sc.nextInt();

        if(number % 2==0){
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }
    }


}

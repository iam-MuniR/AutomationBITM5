package com.basic;

import java.util.Scanner;

public class CodingPractise4 {
    public static void main(String[] args) {
        int number;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        number=sc.nextInt();

        if(number >9){
            System.out.println("Good");
        }
        else {
            System.out.println("Bad");
        }

    }
}

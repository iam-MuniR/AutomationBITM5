package com.basic;

import java.util.Scanner;

public class CodingPractise2 {
    public static void main(String[] args) {
        int number1;
        int number2;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        number1=sc.nextInt();
        System.out.println("Enter second number: ");
        number2=sc.nextInt();

        int sum=number1+number2;
        int sub=number1-number2;
        int multiply=number1*number2;
        int div=number1/number2;

        System.out.println("Sum is: "+sum); //concatenation
        System.out.println("Sub is:" +sub);
        System.out.println("Multiply is: "+multiply);
        System.out.println("Division is: " +div);
    }
}

package com.basic;

import static com.basic.CodingPractise1OOP.sub;
import static com.basic.CodingPractise1OOP.sum;

public class CodingPractise3OOP {
    public static void main(String[] args) {
        //oop1
    sum(30,20);
    sub();

    //oop2
        CodingPractise2OOP.multiply();
        CodingPractise2OOP.division();

    }
    public static void multiply(int a, int b){
        int multy= a*b;
        System.out.println(multy);
    }
}

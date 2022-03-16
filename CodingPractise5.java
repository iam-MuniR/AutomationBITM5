package com.basic;

import java.util.Scanner;

public class CodingPractise5 {
    public static void main(String[] args) {
        int upperLimit=20;

        for (int i=1; i<=upperLimit; i++){
            if(i %2==0){
                System.out.println(i);
            }
        }

        System.out.println("...........................");
        for (int i=1; i<=upperLimit; i++){
            if(i %2 !=0 ){
                System.out.println(i);
            }
        }

    }
}

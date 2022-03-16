package com.basic;

import java.util.Random;

public class CodingPractise8 {
    public static void main(String[] args) {

        int count;

        Random rnum= new Random();
        for(count=1;count<=4;count++){
            System.out.println(rnum.nextInt());
        }
    }
}

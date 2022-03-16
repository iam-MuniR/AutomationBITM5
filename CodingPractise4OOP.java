package com.basic;

public class CodingPractise4OOP extends CodingPractise3OOP {

    public static void main(String[] args) {
      //  sum(20,10);

        //object
        // ClassName objectName = new ClassName();
        CodingPractise4OOP myObj=new CodingPractise4OOP();
        myObj.sum(1,5);
        myObj.sub(10,5);

        //multiply(10,5);

    }
    public static void sum(int a,int b){
   //      int a=10;
   //     int b=5;
        int sum=a+b;
        System.out.println("Sum is: "+sum);

    }
    public static void sub(int a, int b){
//        int sub=a-b;
//        System.out.println("Sub is: "+sub);
        multiply(10,3);

    }

}

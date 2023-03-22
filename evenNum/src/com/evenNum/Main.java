package com.evenNum;

import java.util.Scanner;

public class Main {
    public static void evenNum(int n){

       for(int i=1; i<=10; i++){
           int sum = n * i;
           System.out.println(sum);

       }


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter yours number");
        int num= sc.nextInt();
        evenNum(num);



    }
}

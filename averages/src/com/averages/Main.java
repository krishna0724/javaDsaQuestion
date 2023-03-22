package com.averages;

import java.util.Scanner;

public class Main {
    public static int average(int a, int b, int c){
        int sum= (a+b+c)/3;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your numbers");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        System.out.println(average(a, b, c));

    }
}

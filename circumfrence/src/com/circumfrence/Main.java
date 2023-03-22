package com.circumfrence;
import java.util.Scanner;

public class Main {
    public static double circumference(int n){
        double pi =3.14;
        double circumference=(2*pi*n);
        return circumference;
    }

    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter your radius : ");
        int n= sc.nextInt();
        System.out.println(circumference(n));

    }
}
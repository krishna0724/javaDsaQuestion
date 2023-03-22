package com.factorials;

import java.util.*;

public class Main {
    public static void calFactorials(int n){
        //for negative
        if(n<0){
            System.out.println("invalid numbers");
            return;
        }
        //loop
        int factorials=1;
        for(int i = n; i>=1; i--) {
            factorials = factorials * i;
        }
            System.out.println(factorials);


    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        System.out.println("factorials is :");
        calFactorials(n);

    }
}

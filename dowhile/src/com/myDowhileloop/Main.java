package com.myDowhileloop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number=0;
	    do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your number: ");
            number=sc.nextInt();
            System.out.println("your number is "+number);

        }while(number>=0);
        System.out.println("the end");
    }
}

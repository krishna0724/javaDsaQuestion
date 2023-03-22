package com.Ascending;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int size=sc.nextInt();
        int numbers[]=new int [size];
        for(int i=0; i<size; i++){
            numbers[i]=sc.nextInt();
        }
           boolean isAscending= true;

        for(int i=0; i<size; i++){
            if(numbers[i] > numbers[i+1]){
                isAscending =false;
            }

        }
        if(isAscending) {
            System.out.println("sorted");
        }
        else {
            System.out.println("not sorted");
        }
    }
}

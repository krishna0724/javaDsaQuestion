package com.BinaryToDecimal;

import java.util.Scanner;

public class Main {
    public static int BinaryToDecimal( String n){
        String num=n;
        int dc_val=0;
        int base=1;
        int len= num.length();
        for(int i=len-1;i>=0; i--){
            if(num.charAt(i)=='1'){
                dc_val += base;
                base *=2;
            }
        }
        return dc_val;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        String input=sc.next();

        System.out.println(BinaryToDecimal(input));
    }
}

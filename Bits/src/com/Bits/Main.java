package com.Bits;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int operation=sc.nextInt();
	    int n=5;
        int pos=1;
        int bitMask=1<<pos;
//        if((bitMask & n)==0){
//            System.out.println("zreo");
//        }
//        else{
//            System.out.println(" not zreo");
       // }
        if(operation==0) {
            int notBit = ~bitMask;
            int newNumber = notBit & n;
            System.out.println(newNumber);
        }
        else{
            int newNum=bitMask|n;
            System.out.println(newNum);
        }
    }
}

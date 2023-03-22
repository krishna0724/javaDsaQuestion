package com.checkAsort;

public class Main {
    public static void moves(String str, int idx, int count, String nstr){
        // sorting array
//        if(idx==arr.length-1){
//            return true;
//        }
//
//        if(arr[idx]>=arr[idx +1]){
//          return false;
//        }
//            return checkArsort(arr,idx+1);
        // moves x to end

        if(idx==str.length()-1){
            for(int i=0; i<count; i++){
                nstr +='x';
            }
            System.out.println(nstr);
            return ;
        }
            char currChar=str.charAt(idx);
            if(currChar=='x'){
                count++;
                moves(str,idx+1,count,nstr);
            }
            else{
                nstr +=currChar;
                moves(str,idx+1,count,nstr);
            }


    }
    public static void main(String[] args) {
//        int arr[]={1,2,3,5,9,2};
//        System.out.println(checkArsort(arr,0));
        String str="axbcxxd";
        moves(str,0,0,"");

    }
}

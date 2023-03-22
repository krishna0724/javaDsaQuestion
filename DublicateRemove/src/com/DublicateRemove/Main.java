package com.DublicateRemove;

public class Main {
    public static boolean map[]= new boolean[26];
    public static void removeDublicates(String str, int idx, String newString){
                if(idx==str.length()){
                    System.out.println(newString);
                    return;
                }

        char curChar=str.charAt(idx);
        if(map[curChar-'a']){
            removeDublicates(str,idx+1,newString);
        }
        else{
            newString +=curChar;
            map[curChar-'a']=true;
            removeDublicates(str,idx+1,newString);
        }

    }

    public static void main(String[] args) {
        String str="uashcihsdgcisadichiasdhcasdfasdkahsdhasa";
        removeDublicates(str,0,"");
    }
}

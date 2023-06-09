package com.bubleSort;

public class Main {
    public static void printArray( int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
	   int arr[]={12,6,8,9,7,10};
        //time complexity=0(n^2)
       //bubble sort
//       for(int i=0; i<arr.length-1; i++){
//            for(int j=0; j<arr.length-i-1; j++){
//                if(arr[j]<arr[j+1]) {
//                    //swap
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//       }
        //selectin sort
//        for(int i=0; i<arr.length;i++){
//            int smallest=i;
//            for(int j=i+1; j<arr.length; j++){
//                if(arr[smallest]>arr[j]){
//                    smallest=j;
//                }
//            }
//            //swap
//            int temp=arr[smallest];
//            arr[smallest]=arr[i];
//            arr[i]=temp;
//        }
        // insertion sort

        for(int i=1; i<arr.length; i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;

            }
            //placement
            arr[j+1]=current;
        }
       printArray(arr);
    }
}

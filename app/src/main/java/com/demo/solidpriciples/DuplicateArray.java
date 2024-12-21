package com.demo.solidpriciples;

public class DuplicateArray {
    public static void main(String[]args){
        int[] array = {3,4,5,6,5,4,3,2};
        int count = 0;

        for (int i=0; i<array.length;i++){
           for (int j=i+1;j<array.length;j++){
               if (array[i] == array[j]){
                   System.out.println(array[j]);
                   count ++;
                   break;
               }
           }
        }
         System.out.println("Duplicate Array "+count);
    }
}

package org.learning.algorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] numbersArray = {10,9,8,7,6,4,3,2,1};
        sort(numbersArray);
    }

    private static void sort(int[] numbersArray) {
        for(int i = 0; i< numbersArray.length-1; i++){
            int minIndex = i ;
           for(int j = i+1; j<= numbersArray.length-1; j++){
                if(numbersArray[minIndex]> numbersArray[j]){
                     minIndex=j;
                }
            }
            int temp = numbersArray[i];
            numbersArray[i]= numbersArray[minIndex];
            numbersArray[minIndex]=temp;
        }
    }
}

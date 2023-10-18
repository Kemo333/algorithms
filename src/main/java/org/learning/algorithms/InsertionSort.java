package org.learning.algorithms;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] numbersArray = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        sort(numbersArray);
        System.out.println(Arrays.toString(numbersArray));
    }

    private static void sort(int[] numbersArray) {
        for (int i = 1; i < numbersArray.length; i++) {
            int valueToInsert = numbersArray[i];
            int holePosition = i-1 ;
            while (holePosition >= 0 && valueToInsert < numbersArray[holePosition] ) {
                numbersArray[holePosition+1] = numbersArray[holePosition];
               holePosition = holePosition-1;
            }
            numbersArray[holePosition+1]=valueToInsert;
        }
    }
}



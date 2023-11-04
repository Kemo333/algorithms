package org.learning.algorithms.arrayOperations;

import java.util.Arrays;

public class Equilibrium {
    /*
    Given a sequence arr[] of size n, Write a function int equilibrium(int[] arr, int n)
     that returns an equilibrium index (if any) or -1 if no equilibrium index exists.
      The equilibrium index of an array is an index such that
      the sum of elements at lower indexes is equal to the sum of elements at higher indexes.

     */
    public static void main(String[] args){

        int[] arr={ -7, 1, 5, 2, -4, 3, 0 };
        int index = findEquilibriumIndex(arr);
        System.out.println(index);
    }

    private static int findEquilibriumIndex(int[] arr) {
        int sum =0;
        int[] leftSumArray = new int[arr.length];
        int[] rightSumArray = new int[arr.length];;
        for(int i =0 ;i<arr.length;i++){
            sum = sum+arr[i];
        }
        for(int i =0 ;i<arr.length;i++){
            if (i != 0) {
                leftSumArray[i] = leftSumArray[i - 1] + arr[i];
            }
            else {
                leftSumArray[i] = arr[i];
            }
        }

        for(int i = arr.length-1 ;i>0;i--){
            if (i <= arr.length - 2) {
                rightSumArray[i] = rightSumArray[i + 1] + arr[i];
            }
            else {
                rightSumArray[i] = arr[i];
            }
        }
        System.out.println(Arrays.toString(leftSumArray)+"-"+Arrays.toString(rightSumArray));
        for(int i =0 ;i<arr.length;i++){

          if(leftSumArray[i]==rightSumArray[i]){
              return i ;
          }

        }
     return -1;

    }

}

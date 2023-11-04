package org.learning.algorithms.arrayOperations;

import java.util.Arrays;

public class SortArrayInWaveForm {


    public static void main(String[] args) {
        int arr[] = {3,2,5,2,7,9,27,2,34,3};
        sortArrayInWaveForm(arr);
    }

    private static void sortArrayInWaveForm(int[] arr) {
        for(int i =1;i<arr.length;i=i+2){
            if(i>0 && arr[i-1]>arr[i]){
                swap(arr,i-1,i);
            }
            if(i<arr.length-1 && arr[i]<arr[i+1]){
                swap(arr,i,i+1);
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int arr[],int x, int y) {
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=arr[temp];

    }
}

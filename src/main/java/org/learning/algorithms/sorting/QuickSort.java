package org.learning.algorithms.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {

    public static void main(String[] args) {
        //int[] a = new int[]{4 , 3 , 7  ,2 , 1 , 5,  6};
//      int[] a = new int[]{10  ,5,  12,  7,  7,  7,  7,  7,  1,  13};
      int[] a = new int[]{1 , 2  ,3 , 4 , 2,  6 , 1 , 4,  6,  6};
      // int[] a = new int[]{6,  5 , 4 , 3 , 2,  1};
        quickSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    public static void quickSort(int a[], int l, int r) {
        if (l < r) {
            int i = l;
            int j = r;
            int mid = l + (r - l) / 2;
            int pivot = a[mid];
            while (i <= j) {
                while (a[i] < pivot) {
                    i = i + 1;
                }
                while (a[j] > pivot) {
                    j = j - 1;
                }
                if (i <= j) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    i = i + 1;
                    j = j - 1;
                }
            }

            if (l < j) {
                quickSort(a, l, j);
            }
            if (i < r) {
                quickSort(a, i, r);
            }


        }
    }

//    public static void quickSort1(int a[]) {
//       if(a.length==0){
//           return;
//       }
//
//        int pivot = a[0];
//       List<Integer> left = new ArrayList<>();
//        List<Integer> right = new ArrayList<>();
//
//       for(int i =0 ; i<a.length;i++){
//           if(a[i]<=pivot){
//               left.add(a[i]);
//           }else{
//               right.add(a[i]);
//           }
//
//       }
//       quickSort1(left.toArray());
//    }

}


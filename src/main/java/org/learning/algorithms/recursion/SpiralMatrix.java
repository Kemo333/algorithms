package org.learning.algorithms.recursion;

public class SpiralMatrix {
    public static void main(String[] args){
        int[][] matrix = { { 3, 2, 1, 7 ,9},
                { 9, 11, 5, 4 ,8},
                { 6, 0, 13, 17 ,0},
                { 7, 21, 14, 15 ,9} };
        int[][] matrix1 = { { 3},
                { 9},
                { 6},
                { 7} };
        int[][] matrix2 = { { 3,4,5,6}};
        printElements(matrix2,0,0,0,3);
    }

    private static void printElements(int[][] matrix,int rowStart,int rowEnd,int columnStart,int columnEnd) {
        if(rowStart>rowEnd || columnStart>columnEnd){
            return;
        }
        for(int i = columnStart;i<=columnEnd;i++){
            System.out.println(matrix[rowStart][i]);
        }
        for(int i =rowStart+1;i<=rowEnd;i++){
            System.out.println(matrix[i][columnEnd]);
        }
        if(rowStart!=rowEnd) {
            for (int i = columnEnd - 1; i >= columnStart; i--) {
                System.out.println(matrix[rowEnd][i]);

            }
        }
        if(columnEnd!=columnStart) {
            for (int i = rowEnd - 1; i > rowStart; i--) {
                System.out.println(matrix[i][columnStart]);
            }
        }
        printElements(matrix,rowStart+1,rowEnd-1,columnStart+1,columnEnd-1);
    }
}

package org.learning.algorithms.recursion;

public class TowerOfHanoi {

    public static void main(String[] args){
 int n=4;
 towerOfHanoi(n,'A','C','B');
    }
    static void towerOfHanoi(int n ,char from_rod,char to_rod, char aux_rod){
        if(n==0){
            return;
        }
        if(n>0) {
            towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
            System.out.println("Move disk " + n + " from rod "
                    + from_rod + " to rod "
                    + to_rod);
            towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
        }
    }

}

package org.example;

public class Main {
    public static void main(String[] args) {
        int[][] test = {{1,2,3},{2,4,6},{3,6,9}};
        System.out.println(multiplicationTable(3));
    }
    public static int [][] multiplicationTable(int n){
        int [][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = (i+1) + j + j*i;
            }
        }
        return result;
    }
}
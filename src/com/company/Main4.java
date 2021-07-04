package com.company;

public class Main4 {
    public static void main(String[] args) {
        int N = 3;
        int mas[][] = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (j%2==0&&i%2==0){
                    mas[i][j] =1;
                }
                System.out.printf("%-2d", mas[i][j]);
            }
            System.out.println();
        }
    }
}

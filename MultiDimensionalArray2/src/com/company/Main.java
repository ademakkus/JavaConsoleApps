package com.company;

public class Main {

    public static void main(String[] args) {




        /*int[][] dizi={

                {3,5,2353},
                {3,100,4},
                {1,2,3,4,5}

        };*/
        for (int row =0; row <=10;row++) {
            for (int col = 1; col < row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}

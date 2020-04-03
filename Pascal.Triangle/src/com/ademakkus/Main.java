package com.ademakkus;
import java.util.Scanner;

import static java.lang.System.*;


public class Main {

    public static void main(String[] args) {

        int rowNum;
        Scanner scanner=new Scanner(in);
        out.print("Enter number of rows : ");
        rowNum=scanner.nextInt();
        int i=1;
        while (i<rowNum+1) {

            int j=0;
            while (j<rowNum-1){
                out.print(" ");
                j++;
            }
            int k=0;
            while (k<2*i-1){
                out.print("*");
                k++;
            }

            out.println();
            i++;
        }

	// write your code here
    }
}

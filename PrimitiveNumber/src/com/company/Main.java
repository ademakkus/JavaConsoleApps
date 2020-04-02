package com.company;
import java.util.Scanner;

import  static  java.lang.System.out;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner=new Scanner(System.in);
        boolean isPrimitive=true;
        out.print("Enter a number :");
        int number=scanner.nextInt();
        for (int i = 2; i <number ; i++) {

            if (number%i == 0) {
                isPrimitive=false;
               break;
            }

        }
        if (isPrimitive) {
            out.println("Number "+number+ " is Primitive");
        }
        else {
            out.println("Number "+number+ " is NOT Primitive");
        }
    }
}

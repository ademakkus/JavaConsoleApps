package com.ademakkus;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for (int i = 0; i < 109; i++) {
            System.out.print("\u001B[0"+i+"m");
            System.out.print(i+" value ");
           System.out.print("\u001B[0m");
        }
    }
}

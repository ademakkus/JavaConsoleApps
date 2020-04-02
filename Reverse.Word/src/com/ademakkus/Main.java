package com.ademakkus;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String word;
        System.out.print("**** Enter a word please? : ");
        word=scanner.next();
        ReverseMethod_1(word);
        ReverseMethod_2(word);
        ReverseChar(word);
        //System.out.println("word = " + word);

    }

    private static void ReverseMethod_1(String word) {
        System.out.println(ANSI_YELLOW);
        System.out.println("Reverse Method 1  " );
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed=reversed+word.charAt(i);
        }
        System.out.println("Your reversed = " + reversed);
        System.out.println(ANSI_RESET);
    }

    private static void ReverseChar(String word) {
        System.out.println("Reverse Method 1  " );

        for (int i = word.length()-1; i >=0 ; i--) {
            System.out.println("Your reversed = " + word.charAt(i));
        }


    }

    private static void ReverseMethod_2(String word) {

        System.out.println(ANSI_RED);
        System.out.println("Reverse Method 3 Your ");
StringBuilder stringBuilder=new StringBuilder(word);

            System.out.println("Your reversed = " + stringBuilder.reverse().toString());

        System.out.println(ANSI_RESET);

    }
}

package com.company;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        System.out.print("Type your birth year :" );
        int birthYear=scanner.nextInt();
        Calendar calendar=Calendar.getInstance();

        int years=calendar.get(Calendar.YEAR)-birthYear;
        System.out.println( "Your "+years+" years old.");

    }
}

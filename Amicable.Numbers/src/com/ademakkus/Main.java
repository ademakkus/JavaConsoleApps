package com.ademakkus;
import java.util.Scanner;

import static  java.lang.System.out;
public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int firstNumber,secondNumber;
        int total1=0;

        int total2=0;
        //read the first number
        out.print("Enter the first number: ");
        firstNumber=scanner.nextInt();

        //read the second number
        out.print("Enter the second number: ");
        secondNumber=scanner.nextInt();
        for (int i = 1; i <firstNumber ; i++) {
            if (firstNumber%i==0)
                total1+=i;
        }

        for (int i = 1; i <secondNumber ; i++) {
            if (secondNumber%i==0)
                total2+=i;
        }
        if (firstNumber==total2 && secondNumber==total1)
            out.println(firstNumber+" and "+secondNumber+" are amicable (friendly) number");
        else
            out.println(firstNumber+" and "+secondNumber+" are NOT amicable (friendly) number");

    }
}

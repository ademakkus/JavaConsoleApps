package com.ademakkus;
import java.util.Scanner;

import static java.lang.System.out;


public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number;
        int total=0;
        out.print(("Enter a number : "));
        number=scanner.nextInt();
        for (int i=1;i<number;i++){
            if (number%i==0)
                total+=i;
        }
        if(total==number)
            out.println(number+" is perfect number ");
        else
            out.println(number+" is NOT perfect number ");

    }
}

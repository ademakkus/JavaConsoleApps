package com.ademakkus;
import java.util.Scanner;
import  static  java.lang.System.out;
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] lottery=new int[6];
        int[] player=new int[6];
        Scanner scanner=new Scanner(System.in);
int index=0;
        while(true){

            out.print("Enter six numbers between 1-54: ");
            int number=scanner.nextInt();
            if(number>=1 && number<=54){
                player[index]=number;
                index++;
            }
            else{
                out.print("Your number is NOT between 1-54:");
            }
            if(index==6)break;;
        }
        int l=0;
        for (int number:player) {
            out.print(number);
            if(l==5)break;
            out.print(" - ");

            l++;
        }
        out.println();
        for (int i = 0; i <6 ; i++) {
            lottery[i]=(int)(Math.random()*54);

        }
l=0;
        for (int number:lottery) { //foreach
            out.print(number);
            if(l==5)break;
            out.print(" - ");
            l++;
        }
        out.println();
        //
        int[] intersect=new int[6];
        int count=0;
        for (int i = 0; i < lottery.length; i++) {
            for (int j = 0; j < player.length; j++) {
                if (lottery[i]==player[j]){
                    count++;
                    intersect[i]=player[i];
                }
            }
        }
        out.println();
        out.println("Intersect counts : "+count);
//        for (int value:intersect) {
//            out.print(value+" ");
//        }
        out.println();
        switch (count){
            case 1: case 2:out.println("You win amorti ");break;
            case 3:out.println("You win 10 $ ");break;
            case 4:out.println("You win 100 $ ");break;
            case 5:out.println("You win 1 000 $ ");break;
            case 6:out.println("You win 10 000 $ ");break;
        }
    }
}

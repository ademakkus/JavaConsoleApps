package com.ademakkus;

import java.io.*;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {

        int a = 60; /*/60=0011 1100*/
        int b = 13;/*13=0000 1101*/
        int c = 0;/*c=0000 0000*/

        out.println("***** Write numbers in binary ***********");

        out.println("a binary format : "+ Integer.toBinaryString(a));
        out.println("b binary format : "+ Integer.toBinaryString(b));
        out.println("c binary format : "+ Integer.toBinaryString(c));


        out.println("");
        c = a & b;  /* 0011 1100 &
                   0000 1101= 0000 1100*/
        out.println("a&b = " + c);

        c = a | b; /* 0011 1100 |
                  0000 1101= 0011 1101*/

        out.println("a|b = " + c);

        c = a ^ b; /* 0011 1100 ^
                  0000 1101= 11000 0010*/
//for a
        out.println("a^b = " + c);
        c = ~a; /*-61=1100 0011 */
        out.println("~a = "+c);

        c=a<<2;
        out.println("a<<2 ="+c);

        c=a>>2;
        out.println("a>>2 ="+c);

        c=a>>>2;
        out.println("a>>>2 ="+c);
       //for b
        c=b<<2;
        out.println("b<<2 ="+c);

        c=b>>2;
        out.println("b>>2 ="+c);

        c=b>>>2;
        out.println("b>>>2 ="+c);


    }
}

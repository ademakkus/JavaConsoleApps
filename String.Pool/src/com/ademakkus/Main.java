package com.ademakkus;
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
	String s1="Hello";
	String s2="Hello";
	String s3="Merhaba";
	String s4=new String("Merhaba"); //create new string object
	String s5=new String("Hello"); //create new string object
out.println("s1==s2 : "+(s1==s2));
out.println("s2==s3 : "+(s2==s3));
out.println("s3==s4 : "+(s3==s4));
out.println("s2==s5 : "+(s2==s5));
    }
}

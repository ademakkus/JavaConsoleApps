package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        System.out.print( "Enter the length : ");
        double length=scanner.nextDouble();
        System.out.print( "Enter the breadth : ");
        double breadth=scanner.nextDouble();
        calculateArea(length,breadth);
        calculatePerimeter(length,breadth);

    }
    public  static  void calculateArea(double length,double breadth){
        System.out.println("Rectangle area : "+length*breadth);

    }public  static  void calculatePerimeter(double length,double breadth){
        System.out.println("Rectangle perimeter : "+ 2*(length+breadth));
    }

}

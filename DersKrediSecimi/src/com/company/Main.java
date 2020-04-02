package com.company;
import static java.lang.System.out;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        String ders1,ders2,ders3;
        int kredi1,kredi2,kredi3;
        double not1,not2,not3;
        double ortalama=0.0;

        out.print("Birinci dersin adını, kredisini ve notunu giriniz: ");
        ders1=scanner.next();
        kredi1=scanner.nextInt();
        not1=scanner.nextDouble();

        out.print("İkinci dersin adını, kredisini ve notunu giriniz: ");
        ders2=scanner.next();
        kredi2=scanner.nextInt();
        not2=scanner.nextDouble();

        out.print("Üçüncü dersin adını, kredisini ve notunu giriniz: ");
        ders3=scanner.next();
        kredi3=scanner.nextInt();
        not3=scanner.nextDouble();
        ortalama=((not1*kredi1)+(not2*kredi2)+(not3*kredi3))/(kredi1+kredi2+kredi3);

        out.println("Ders 1 Adı: "+ders1+" ,Kredisi :"+kredi1+" ,Notu  :"+not1);
        out.println("Ders 2 Adı: "+ders2+" ,Kredisi :"+kredi2+" ,Notu  :"+not2);
        out.println("Ders 3 Adı: "+ders2+" ,Kredisi :"+kredi3+" ,Notu  :"+not3);
        out.println("Derslerin ortalaması : "+ortalama);

    }
}

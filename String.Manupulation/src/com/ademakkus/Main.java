package com.ademakkus;
import static  java.lang.System.out;

public class Main {

    public static void main(String[] args) {
int speed=50;
String departureCİty="Çorum";
String arrivalCity="Ankara";
String fullText=String.format("The average speed of the vehicle is %d km. The vehicle will depart from %s and go to %s.",speed,departureCİty,arrivalCity);
out.println(fullText);

///
        String s="String are immutable";
        char ninthCharacter=s.charAt(8);
        out.println("Ninth character of string is :"+ninthCharacter);

        String str1="String are immutable";
        String str3="String are immutable";
        String str2="String ARE immutable";
        out.println(str1.compareTo(str2));
        out.println(str1.compareToIgnoreCase(str2));
        out.println(str1.equals(str3));
        out.println(str1.equalsIgnoreCase(str2));
        out.println();
        out.println(str1==str2);
        out.println(str1==str3);
String strNew=new String("This is really not immutable !!");
        boolean retVal=strNew.endsWith("immutable !!");
out.println("Returned Value end with \"immutable !!\" : "+retVal);
            out.println("Start with \"This  \":"+strNew.startsWith("This"));
String first=new String("Welcome to Java programming.");
String second=new String("Tutorials");
out.println("Found Index of Tutorials : "+first.indexOf("Tutorials"));
out.println("Found Index of Java : "+first.indexOf("Java"));
   //
   String replaceString=new String("Welcome to Java programming.");
   out.println("Normal string : "+replaceString);
   String target="Welcome";
   String replacement="Merhaba";
   replaceString=replaceString.replace(target,replacement);
   out.println("New replacement  string : "+ replaceString);
int beginIndex=0;
int endIndex=15;
String subString=replaceString.substring(beginIndex,endIndex);
out.println("Substring : "+subString);

    }
}

package com.ademakkus;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {

        Long personId = Long.valueOf(100);
        int personAsId = personId.intValue();
        byte personAsByte = personId.byteValue();
        short personAsShort = personId.shortValue();
        double personAsDouble = personId.doubleValue();
        float personAsFloat = personId.floatValue();
        String personAsTex = personId.toString();

        out.println(personId);
        out.println(personAsId);
        out.println(personAsByte);
        out.println(personAsShort);
        out.println(personAsDouble);
        out.println(personAsFloat);
        out.println(personAsTex);
////
        out.println("****compareTo method****");
        out.println(personId.compareTo(50L));
        out.println(personId.compareTo(100L));
        out.println(personId.compareTo(150L));

        out.println("****equals method****");
        out.println(personId.equals(50L));
        out.println(personId.equals(100L));
        out.println(personId.equals(150L));

        out.println("-------- convert string to numeric using valueof ");
        long number1=Long.valueOf("1000");
        int number2=Integer.valueOf("345");
        short number3=Short.valueOf("331");
        out.println(number1);
        out.println(number2);
        out.println(number3);
        //

        out.println("-------- convert string to numeric using parseX ");
        long number4=  Long.parseLong("100");
        int number5=Integer.parseInt("5");
        short number6=Short.parseShort("1");
        out.println(number4);
        out.println(number5);
        out.println(number6);

    }
}
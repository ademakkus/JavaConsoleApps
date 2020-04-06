package com.ademakkus;

public class Main {

    public static void main(String[] args) {
	int[] list={1,2,3,4,5,6,7,8,9};
Reverse reverseClass=new Reverse();
int[] reversedList=reverseClass.reverse(list);
int counter=0;
        for (var item:reversedList) {
            System.out.print(item);
            if (counter==reversedList.length-1)
                break;;
            System.out.print("- ");
            counter++;

        }

    }


}

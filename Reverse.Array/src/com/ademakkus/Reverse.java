package com.ademakkus;

public  class Reverse {

    public static int[] reverse(int[] list){
        int[] result=new int[list.length];
        for (int i = 0,j=list.length-1; i <list.length ; i++,j--) {

            result[j]=list[i];
        }
        return  result;
    }
    public Reverse(){

    }
}
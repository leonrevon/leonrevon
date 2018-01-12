package com.leonteng;

public class Main {

    public static void main(String[] args) {
        // int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;// -2.14b to +2.14b (value of integer computer stores)
        int myTotal = (myMinValue/2);
        System.out.println("My Total = " + myTotal);

        //byte has a width of 8
        byte myByteValue = 10;  //-128 to 127
        byte myNewByteValue = (byte) (myByteValue/2); //CASTING (byte)
        System.out.println("My Byte Total = " + myNewByteValue);

        //short has a width of 16
        short myShortValue = -32_768; //-32768 - 32768
        short myNewShortValue = (short) (myShortValue/2);

        //long has a width of 64
        long myLongValue = 100L;

        byte byteNumber = 10;
        short shortNumber = 20;
        int intNumber = 50;
        long myLongTotal = 50_000L + 10L*(byteNumber + shortNumber + intNumber);
        System.out.println(myLongTotal);

    }
}

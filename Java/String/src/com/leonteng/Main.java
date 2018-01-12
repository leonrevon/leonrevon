package com.leonteng;

public class Main {

    public static void main(String[] args) {

        //String, which means a sequence of character.

        String myString = "This is a string";
        System.out.println("myString is equal to = "+myString);

        myString = myString + ", and this is more";
        System.out.println("myString is equal to = "+myString);

        myString = myString + "\u00A9";
        System.out.println("myString is equal to = "+myString);

        String numberString = "250.55";
        numberString = numberString + "40";
        System.out.println("The output is :" + numberString); // String register only text, even numbers.


        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt; //Java converts myInt into a string. (works with double/long/short/byte)
        System.out.println(lastString);
    }
}

package com.leonteng;

public class Main {

    public static void main(String[] args) {

        //Can use unicode as well! unicode-table.com
        char myChar = '\u00A9'; //only one letter either Upper or lower case (Even Special character)
        System.out.println("Unicode output was: " + myChar);

        boolean myBoolean = false;
        boolean isMale = true;


        //EXERCISE
        // 1. Find the code for the registered symbol on same line as the copyright symbol.
        // 2. Create a variable of type char and assign it the unicode value for that symbol.
        // 3. Display in on screen

        char secondChar = '\u00AE';
        System.out.println("Unicode output is : " +secondChar);

    }
}

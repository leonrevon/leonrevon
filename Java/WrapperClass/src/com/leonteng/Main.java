package com.leonteng;

class FinalizeDemo{
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object Finalized..");
    }
}
        }

public class Main {

    public static void main(String[] args) {

        int i = 5; //Primitive

        Integer objI = new Integer(i); // Boxed (Constructing an Object)

        int j = objI.intValue(); // Unboxing (Extract value from an object)

        Integer objK = i; //Autoboxing it is the same as Integer objK = new Integer(i)

        int l = objK; //Auto Unboxing

        FinalizeDemo fdRef = new FinalizeDemo();
        fdRef = null;
        System.gc();

    }
}

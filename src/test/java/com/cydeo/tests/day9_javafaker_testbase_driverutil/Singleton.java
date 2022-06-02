package com.cydeo.tests.day9_javafaker_testbase_driverutil;

public class Singleton {

    // #1 create private constructor

    private Singleton(){}


    //#3 create private static String
    //prevent access and provide a getter method
    private static String word;
    public static String getWord(){
        if(word == null) {
            System.out.println("First time call. word object is nukk, " + "Assigning calie to it now!");
            word = "something";
        } else {
            System.out.println("Word already has value");
        }
        return word;
    }
}

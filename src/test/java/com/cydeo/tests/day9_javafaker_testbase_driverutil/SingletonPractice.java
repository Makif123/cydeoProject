package com.cydeo.tests.day9_javafaker_testbase_driverutil;

import org.testng.annotations.Test;

public class SingletonPractice {
    @Test
    public void singleton_understand_test1(){

        String str = Singleton.getWord();
        System.out.println("str = " + str);

        String str1 = Singleton.getWord();
        System.out.println("str1 = " + str1);

        String str2 = Singleton.getWord();
        System.out.println("str2 = " + str2);



    }
}

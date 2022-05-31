package com.cydeo.utilities;

public class BrowserUtilities {
    public static void sleep(int time) {
        time *= 1000;

        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {

        }

    }
}

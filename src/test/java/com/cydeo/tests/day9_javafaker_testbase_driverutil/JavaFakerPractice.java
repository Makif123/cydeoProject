package com.cydeo.tests.day9_javafaker_testbase_driverutil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

import java.util.Locale;

public class JavaFakerPractice {

    @Test
    public void test1() {
        // Creting Faker object to reach methods
        Faker faker = new Faker(new Locale("fr"));
        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        System.out.println(faker.name().lastName());
        System.out.println(faker.name().fullName());

        System.out.println("faker.numerify(\"###-###-####\") = " + faker.numerify("###-###-####"));


        System.out.println(faker.numerify("312-###-####"));

 //kettterify() method will return random letters where we pass ?
        System.out.println(faker.letterify("???-?????"));

        System.out.println("faker.bothify(\"##?##-??##-????####\") = " + faker.bothify("##?##-??##-????####"));


        System.out.println("faker.finance().creditCard() = " + faker.finance().creditCard().replaceAll("-",""));


        System.out.println("faker.chuckNorris() = " + faker.chuckNorris().fact());


    }
}

package com.serenitydojo.dataTypes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class WhenWorkingWithFloatingPointNumbers {


    @Test
    public void convertingCelciusToFarenheit() {
        // Todo: Exercise 1 - Converting a number from celcius to farenheit
        float celcius = 38;
        float farenheit = (celcius * 2.2F)+ 32;

        assertThat(farenheit, equalTo(100));

    }

    @Test
    public void convertingKilogramsToPounds() {
        // Todo: Exercise 2 - Convert kilograms to pounds
        float kiloGrams = 100F;
        float pound = kiloGrams * 2.205F;

        assertThat(pound, equalTo(220.5F));

    }



    @Test
    public void addingNumbersTogether() {
        int initialYear = 1985;
        int targetYear = 0;

        // Todo: create a new int variable called timeJump and assign it a value
        //  Next, add this variable to initialYear and assign the result to targetYear, so that targetYear is equal to 2015

        int timeJump = 30;
        targetYear = initialYear + timeJump;

        assertThat(targetYear, equalTo(2015));
    }


}

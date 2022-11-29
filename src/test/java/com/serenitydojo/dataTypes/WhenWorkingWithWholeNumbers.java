package com.serenitydojo.dataTypes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class WhenWorkingWithWholeNumbers {

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

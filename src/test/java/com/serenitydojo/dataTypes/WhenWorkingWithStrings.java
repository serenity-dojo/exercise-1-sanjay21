package com.serenitydojo.dataTypes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class WhenWorkingWithStrings {

    String fullName = " Sanjay Singh";

    @Test
    //TODO: Exercise 1 - Converting to lower case
    public void convertingToLowerCase(){

        String lowerCaseString = fullName.toLowerCase();
        assertThat(lowerCaseString, equalTo(" sanjay singh") );
    }

    @Test
    //TODO: Exercise 2 - Converting to upper case
    public void convertingToUpperCase(){

        String upperCaseString = fullName.toUpperCase();
        assertThat(upperCaseString, equalTo(" SANJAY SINGH") );
    }

    @Test
    //TODO: Exercise 3 - Trim extra space
    public void trimmingExtraSpace(){

        String trimString = fullName.trim();
        assertThat(trimString, equalTo("Sanjay Singh") );
    }

    @Test
    //TODO: Exercise 4 - Finding the length of a string
    public void findingStringLength(){

        int stringLength= fullName.length();
        assertThat(stringLength, equalTo(13) );
    }

    @Test
    //TODO: Exercise 5 - Replacing text in a string
    public void replacingTextInString(){

        String replaceNewString= fullName.replace("n","N");
        assertThat(replaceNewString, equalTo(" SaNjay SiNgh") );
    }

}

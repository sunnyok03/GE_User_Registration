package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Implemented to check valid inputs
 */
public class UserRegistration {

    /*
    @desc: validate name as first name starts with Cap and has minimum 3 characters
    @params: firstName as String
    @return: true if valid else false
     */
    public boolean validateFirstName(String firstName){
        String nameRegex = "^[A-Z][a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(nameRegex);
        Matcher matcher = pattern.matcher(firstName);

        return matcher.matches();
    }

        /*
    @desc: validate name as first name starts with Cap and has minimum 3 characters
    @params: firstName as String
    @return: true if valid else false
     */
    public boolean validateLastName(String lastName){
        return validateFirstName(lastName);
    }
}

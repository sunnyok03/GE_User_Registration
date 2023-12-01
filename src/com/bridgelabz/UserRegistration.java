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
    @desc: validate name as last name starts with Cap and has minimum 3 characters
    @params: firstName as String
    @return: true if valid else false
     */
    public boolean validateLastName(String lastName){
        return validateFirstName(lastName);
    }

    /*
    @desc: validate email.
            E.g:- abc.xyz@bl.co.in - Email has 3 mandatory parts (abc, bl & co)
            and 2 optional (xyz & in) with
            precise @ and . positions
    @params: email as String
    @return: true if valid else false
     */
    public boolean validateEmail(String email){
        String nameRegex = "[a-zA-Z0-9]+([._%+-]+[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(\\\\.[a-zA-Z]{2,}){1,2}$";
        Pattern pattern = Pattern.compile(nameRegex);
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }
}

package com.bridgelabz;

public class Main {
    public static void main(String[] args) {
        //As a User need to enter a valid email
        UserRegistration UC9 = new UserRegistration();
        String[] emails = {"abc@yahoo.com",  //true
                "abc-100@yahoo.com", // true
                "abc.100@yahoo.com", //true
                "abc111@abc.com", //true
                "abc-100@abc.net", //true
                "abc.100@abc.com.au",  //true
                "abc@1.com", // true
                "abc+100@gmail.com", // true
                "abc", // false
                "abc@.com.my", //false
                "abc123@gmail.a", //false
                "abc123@.com", //false
                "abc123@.com.com", //false
                ".abc@abc.com", //false
                "abc()*@gmail.com",//false
                "abc@%*.com",//false
                "abc..2002@gmail.com",//false
                "abc.@gmail.com",//false
                "abc@abc@gmail.com",//false
                "abc@gmail.com.1a",//false
                "abc@gmail.com.aa.au"};//false
        for(String email : emails){
            System.out.println(email + " " + UC9.validateEmail(email));
        }
    }
}
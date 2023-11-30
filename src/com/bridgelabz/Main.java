package com.bridgelabz;

public class Main {
    public static void main(String[] args) {
        //As a User need to enter a valid First Name
        UserRegistration UC1 = new UserRegistration();
        System.out.println(UC1.validateFirstName("Rahul")); // true
        System.out.println(UC1.validateFirstName("rahul")); // false

        //As a User need to enter a valid First Name
        UserRegistration UC2 = new UserRegistration();
        System.out.println(UC2.validateFirstName("Kumar")); // true
        System.out.println(UC2.validateFirstName("kumar")); // false
    }
}
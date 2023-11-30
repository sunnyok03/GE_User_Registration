package com.bridgelabz;

public class Main {
    public static void main(String[] args) {
        //As a User need to enter a valid First Name
        UserRegistration user = new UserRegistration();
        System.out.println(user.validateFirstName("Rahul")); // true
        System.out.println(user.validateFirstName("rahul")); // false
    }
}
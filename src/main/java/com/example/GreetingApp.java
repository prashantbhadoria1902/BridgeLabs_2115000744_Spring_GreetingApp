package com.example;

public class GreetingApp {

    public static String getGreeting(String firstName, String lastName) {
        if (firstName != null && !firstName.isEmpty() && lastName != null && !lastName.isEmpty()) {
            return "Hello, " + firstName + " " + lastName + "!";
        } else if (firstName != null && !firstName.isEmpty()) {
            return "Hello, " + firstName + "!";
        } else if (lastName != null && !lastName.isEmpty()) {
            return "Hello, " + lastName + "!";
        } else {
            return "Hello, World!";
        }
    }

    public static void main(String[] args) {
        System.out.println(getGreeting("John", "Doe")); // Output: Hello, John Doe!
        System.out.println(getGreeting("John", "")); // Output: Hello, John!
        System.out.println(getGreeting("", "Doe")); // Output: Hello, Doe!
        System.out.println(getGreeting("", "")); // Output: Hello, World!
    }
}

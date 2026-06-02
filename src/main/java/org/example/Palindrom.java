package org.example;

public class Palindrom {
        public void palidrom() {
            String name = "madam"; // Example input

            // Use StringBuilder to reverse the string
            StringBuilder sb = new StringBuilder(name);
            String reverseString = sb.reverse().toString();

            // Check if the original string is equal to the reversed string
            if (name.equals(reverseString)) {
                System.out.println(name + " is a palindrome.");
            } else {
                System.out.println(name + " is not a palindrome.");
            }
        }


}

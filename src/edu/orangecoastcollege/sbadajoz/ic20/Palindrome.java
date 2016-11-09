package edu.orangecoastcollege.sbadajoz.ic20;
/*
Badajoz, Seve
CS A170
November 9, 2016

IC20
*/


import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String check){
        for(int i = 0; i < check.length(); i++) {
            if(check.charAt(i) !=check.charAt(check.length() - i - 1)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String userInput;
        boolean active = true;
        
        while(active) {
            System.out.print("Please enter word or phrase to see if it's a palindrome (type quit to end the program): ");
            userInput = input.nextLine();
            if(isPalindrome(userInput.toLowerCase().trim().replaceAll(" ", ""))) System.out.println(userInput + " is a palindrome!");
            else System.out.println(userInput + " is not a palindrome");
            active = !userInput.toLowerCase().equals("quit");
        }
        System.out.println("Thank You, goodbye");
    }
}

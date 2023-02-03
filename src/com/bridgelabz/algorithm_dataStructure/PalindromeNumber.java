package com.bridgelabz.algorithm_dataStructure;

import java.util.*;

public class PalindromeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value in string .");
        String str = scanner.next();
        String reverseStr = " ";

        int strLength = str.length();
        for (int i=(strLength - 1); i>=0; i++){
            reverseStr = reverseStr + str.charAt(i);
        }
        if (str.toLowerCase().equals(reverseStr.toLowerCase())){
            System.out.println(str+" is palindrome string. ");
        }
        else {
            System.out.println(str+" is not a palindrome string. ");
        }
    }
}


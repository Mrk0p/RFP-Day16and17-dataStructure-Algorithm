package com.bridgelabz.algorithm_dataStructure;

import java.util.Scanner;
import java.util.Arrays;

public class AnagramDetection {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first Strings :");
        String str1 = scanner.nextLine();
        System.out.println("Enter second Strings :");
        String str2 = scanner.nextLine();

        if (str1.length() == str2.length()){

            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            boolean result = Arrays.equals(charArray1,charArray2);

            if (result){
                System.out.println(str1+" and "+str2+" are anagram. ");
            }
            else {
                System.out.println(str1+" and "+str2+" are not anagram. ");
            }
        }
    }
}


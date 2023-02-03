package com.bridgelabz.algorithm_dataStructure;

import java.util.Arrays;

public class TwoString {

    public static void main(String[] args) {

        String[] str1 = {"sam","raju","babu"};
        String[] str2 = {"sam","raju","babu"};

        if (Arrays.equals(str1,str2)) {
            System.out.println("Both arrays are equal");
        }
        else{
            System.out.println("Both arrays are not equal");
        }
    }
}


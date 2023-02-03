package com.bridgelabz.algorithm_dataStructure;

public class PrimeNumber {

    public static void main(String[] args) {

        int num = 0;
        String  primeNumber = "";

        for (int i=1; i<1000; i++){
            int counter = 0;
            for (num = i; num>=1; num--){
                if (i % num == 0){
                    counter = counter + 1;
                }
            }
            if (counter == 2){
                primeNumber = primeNumber + i +" ";
            }
        }
        System.out.println("Prime number from 1 to 1000 are :-");
        System.out.println(primeNumber);
    }
}


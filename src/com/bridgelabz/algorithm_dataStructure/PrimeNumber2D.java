package com.bridgelabz.algorithm_dataStructure;

public class PrimeNumber2D {

    int[][] primeNumArray = new int[10][100];

    public void primeNum() {
        for (int i = 2; i < 1000; i++) {
            int count = 0;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
                if (count == 2) {
                    break;
                }
            }
            if (count == 1) {
                int index1 = i / 100;
                int index2 = i % 100 - 1;
                primeNumArray[index1][index2] = i;
            }
        }
    }
    public void display(){
        System.out.println("Row 1");
        int rowNo = 1;
        for (int[] list : primeNumArray) {
            rowNo++;
            for (int prime : list) {
                if (prime == 0) {
                    continue;
                }
                System.out.print(prime + " ");
            }
            System.out.println();
            if (rowNo == 11) {
                return;
            }
            System.out.println("Row " + rowNo);

        }
    }

    public static void main(String[] args){

        PrimeNumber2D primeNum = new PrimeNumber2D();
        primeNum.primeNum();
        primeNum.display();

    }
}

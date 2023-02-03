package com.bridgelabz.algorithm_dataStructure;

import java.util.Scanner;

public class BubbleSort {

    public int[] bubbleSort(int[] arr){

        int temp;
        boolean swapped = false;
        int size = arr.length;
        for (int i=0; i<size; i++){
            swapped = false;
            for (int j=1; j<size; j++){
                if (arr[j-1] > arr[j]){
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
        }
        return arr;
    }
    public void print(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]+"\t");
        }
    }

    public static void main(String[] args) {

        BubbleSort sort = new BubbleSort();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of array");
        for (int i=0; i<size; i++){
            arr[i] = scanner.nextInt();
        }
        arr = sort.bubbleSort(arr);
        sort.print(arr);
        scanner.close();
    }
}


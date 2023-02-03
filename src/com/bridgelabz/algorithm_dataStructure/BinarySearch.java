package com.bridgelabz.algorithm_dataStructure;

public class BinarySearch {
    public void binary(int arr[], int a){
        int s = 0;
        int e = arr.length -1;
        int mid = (s + e)/2;
        while (s <= e){
            mid = (s + e)/2;
            if (a == arr[mid]){
                System.out.println("The value is place in " + mid);
                break;
            }
            else if (a < arr[mid]) {
                e = mid - 1;
            }
            else {
                s = mid + 1;
            }
        }

    }

    public static void main(String[] args) {
        BinarySearch search = new BinarySearch();
        int[] arr = {10,20,30,40,50,60,70,80};
        search.binary(arr,40);
    }
}



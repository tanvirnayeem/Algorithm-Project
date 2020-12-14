/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm;

/**
 *
 * @author nayeem
 */
import java.util.*;
class QuickSort {
    private int[] arr;
    QuickSort(int[] arr){
        this.arr = arr;
    }
    //selects last element as pivot, pi using which array is partitioned.
    int partition(int intArray[], int low, int high) {
        int pi = intArray[high];
        int i = (low-1); // smaller element index
        for (int j=low; j<high; j++) {
            // check if current element is less than or equal to pi
            if (intArray[j] <= pi) {
                i++;
                // swap intArray[i] and intArray[j]
                int temp = intArray[i];
                intArray[i] = intArray[j];
                intArray[j] = temp;
            }
        }

        // swap intArray[i+1] and intArray[high] (or pi)
        int temp = intArray[i+1];
        intArray[i+1] = intArray[high];
        intArray[high] = temp;

        return i+1;
    }


    //routine to sort the array partitions recursively
    void quickSort(int intArray[], int low, int high) {
        if (low < high) {
            //partition the array around pi=>partitioning index and return pi
            int pi = partition(intArray, low, high);

            // sort each partition recursively
            quickSort(intArray, low, pi-1);
            quickSort(intArray, pi+1, high);
        }
    }

    void result() {
        int n = this.arr.length;
        this.quickSort(this.arr, 0, n-1);
        System.out.println("\nSorted Array: " + Arrays.toString(this.arr));
    }
}

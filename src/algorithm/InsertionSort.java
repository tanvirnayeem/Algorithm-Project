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
public class InsertionSort {
    int[] arr;
    InsertionSort(int[] arr){
        this.arr = arr;
    }
    public void insertionSort(){
        int n = this.arr.length;
        for (int j = 1; j < n; j++) {
            int key = this.arr[j];
            int i = j-1;
            while ( (i > -1) && ( this.arr [i] > key ) ) {
                this.arr [i+1] = this.arr [i];
                i--;
            }
            this.arr[i+1] = key;
        }
    }

    public void printResult(){
        for(int i : this.arr){
            System.out.print(" "+i);
        }
        System.out.println("\n");
    }

    public void result(){
        this.insertionSort();
        this.printResult();
    }
}

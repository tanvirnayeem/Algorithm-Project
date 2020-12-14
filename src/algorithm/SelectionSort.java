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
public class SelectionSort {
    private int[] arr;

    SelectionSort(int[] arr){
        this.arr = arr;
    }

    public void selectionSort(){
        int[] arr = this.arr;
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

    public void result(){
        this.selectionSort();
        System.out.println("After Selection Sort\n");
        for(int i:this.arr){
            System.out.print(i+" ");
        }
        System.out.print("\n");
    }
}

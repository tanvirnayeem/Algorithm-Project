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
import java.util.Arrays;

public class CountingSort {

    private int[] arr;

    CountingSort(int[] arr){
        this.arr = arr;
    }

    public static void sort(int[] arr) {
        int arrayLength = arr.length;
        if (arrayLength == 0)
            return;
        /** find maximum and minimum values **/
        int max = arr[0], min = arr[0];
        for (int i = 1; i < arrayLength; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }
        int range = max - min + 1;

        int[] count = new int[range];
        /** initialize the occurrence of each element in the count array **/
        for (int i = 0; i < arrayLength; i++)
            count[arr[i] - min]++;
        /** calculate sum of indexes **/
        for (int i = 1; i < range; i++)
            count[i] += count[i - 1];
        /** modify original array according to the sum count **/
        int j = 0;
        for (int i = 0; i < range; i++)
            while (j < count[i])
                arr[j++] = i + min;
    }

    public void result() {


        sort(this.arr);

        System.out.println("Elements after applying countingsort:  " + Arrays.toString(this.arr));

    }

}

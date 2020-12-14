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
public class ShellSort
{
    private int[] arr;
    ShellSort(int[] arr){
        this.arr = arr;
    }
    static void shellsort(int[] arr, int num)
    {
        int i, j, k, tmp;
        for (i = num / 2; i> 0; i = i / 2)
        {
            for (j = i; j<num; j++)
            {
                for(k = j - i; k>= 0; k = k - i)
                {
                    if (arr[k+i] >= arr[k])
                        break;
                    else
                    {
                        tmp = arr[k];
                        arr[k] = arr[k+i];
                        arr[k+i] = tmp;
                    }
                }
            }
        }
    }
    public void result()
    {
        int num = this.arr.length;
        int k;
        shellsort(this.arr, num);
        System.out.print("\n Sorted array is: \n");
        for (k = 0; k<num; k++)
            System.out.print(" "+arr[k]);
    }
}  

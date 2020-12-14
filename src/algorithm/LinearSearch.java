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
import java.util.Scanner;

public class LinearSearch {
    int[] arr;
    LinearSearch(int[] arr){
        this.arr = arr;
    }
    public static int linearSearch(int[] arr, int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public void result(){
        System.out.println("Enter the number you want to search\n");
        int key = new Scanner(System.in).nextInt();
        int result = linearSearch(arr, key);
        if(result == -1){
            System.out.println(key+" is absent");
        }else {
            System.out.println(key+" is found at index: "+result);
        }
    }
}

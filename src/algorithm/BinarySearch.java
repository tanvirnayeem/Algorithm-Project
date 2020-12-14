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

public class BinarySearch {
    int[] arr;
    BinarySearch(int[] arr){
        this.arr = arr;
    }
    public static void binarySearch(int arr[], int first, int last, int key){
        int mid = (first + last)/2;
        while( first <= last ){
            if ( arr[mid] < key ){
                first = mid + 1;
            }else if ( arr[mid] == key ){
                System.out.println("Element is found at index: " + mid);
                break;
            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        if ( first > last ){
            System.out.println("Element is not found!");
        }
    }
    public void result(){
        System.out.println("Enter the number you want to search\n");
        int key = new Scanner(System.in).nextInt();
        binarySearch(this.arr, 0, this.arr.length-1, key);
    }
}

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
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BucketSort {

    private int[] arr;

    BucketSort(int[] arr){
        this.arr = arr;
    }
    public void result() {

        System.out.println("Original array- " + Arrays.toString(this.arr));
        bucketSort(this.arr, this.arr.length);
        System.out.println("Sorted array after bucket sort- " + Arrays.toString(this.arr));
    }

    private static void bucketSort(int[] intArr, int noOfBuckets){
        // Create bucket array
        List<Integer>[] buckets = new List[noOfBuckets];
        // Associate a list with each index
        // in the bucket array
        for(int i = 0; i < noOfBuckets; i++){
            buckets[i] = new LinkedList<>();
        }
        // Assign numbers from array to the proper bucket
        // by using hashing function
        for(int num : intArr){
            //System.out.println("hash- " + hash(num));
            buckets[hash(num)].add(num);
        }
        // sort buckets
        for(List<Integer> bucket : buckets){
            Collections.sort(bucket);
        }
        int i = 0;
        // Merge buckets to get sorted array
        for(List<Integer> bucket : buckets){
            for(int num : bucket){
                intArr[i++] = num;
            }
        }
    }

    // A very simple hash function
    private static int hash(int num){
        return num/10;
    }
}

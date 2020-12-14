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

public class Input {
    int num, i, j;
    Scanner input = new Scanner(System.in);

    public int[] sortInput() {
        System.out.println("Enter the number of integers:");
        num = input.nextInt();

        int arr[] = new int[num];

        System.out.println("Enter " + num + " integers: ");

        for (i = 0; i < num; i++) {
            arr[i] = input.nextInt();
        }

        return arr;
    }
}

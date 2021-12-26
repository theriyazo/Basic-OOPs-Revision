package Basics;

import java.util.Scanner;

public class MaxInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of the array");
        int n = in.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements of the array");
        for (int i = 0; i <arr.length ; i++) {
            arr[i] =  in.nextInt();
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
        Max obj = new Max();
        int start;
        int end;
        System.out.println("Enter the start and end index to find the maximum number in the array");
        start = in.nextInt();
        end = in.nextInt();
        System.out.println("Maximum number in the Array is :"+obj.MaxOf(arr));
        System.out.println("Maximum number in the Array is :"+obj.MaxBetween(arr, start, end));


    }
}
class Max{


    public int MaxOf(int[] array){
        int Maximum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]>Maximum){
                Maximum = array[i];
            }
        }
        return Maximum;
    }
    public int MaxBetween(int[] array, int start,int end){
        int Maximum = array[start];
        for (int i = start-1; i < end; i++) {
            if (array[i]>Maximum){
                Maximum = array[i];
            }
        }

        return Maximum;
    }

}

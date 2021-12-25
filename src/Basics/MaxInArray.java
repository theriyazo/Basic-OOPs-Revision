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
        System.out.println("Maximum number in the Array is :"+obj.Max(arr));


    }
}
class Max{


    public int Max(int[] array){
        int Max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]>Max){
                Max = array[i];
            }
        }
        return Max;
    }

}

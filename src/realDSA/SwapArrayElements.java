package realDSA;

import java.util.Arrays;
import java.util.Scanner;

public class SwapArrayElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number of Elements to store in an Array");
        int n = in.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter "+n+" elements");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        reverse(arr);

        System.out.println("End of Main!!");

    }

    static void reverse(int[] array){
        int end = array.length-1;

        for (int start = 0; start < end; start++) {

            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            end--;


        }
            System.out.println(Arrays.toString(array));
    }
}

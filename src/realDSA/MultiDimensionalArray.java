package realDSA;

import java.sql.Array;
import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {

        int[][] array2D = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9, 10}
        };

        print(array2D);
        System.out.println();
        printClean(array2D);

    }

    static void print(int[][] arrPrint){
        for (int i = 0; i < arrPrint.length; i++) {
            for (int j = 0; j < arrPrint[i].length; j++) {
                System.out.print(arrPrint[i][j] + " ");
            }
            System.out.println();

        }
    }

    static void printClean(int[][] arrPrint){
        for (int i = 0; i < arrPrint.length; i++) {
            System.out.println(Arrays.toString(arrPrint[i]));

        }
    }
}

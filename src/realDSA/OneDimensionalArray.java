package realDSA;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayList {
    public static void main(String[] args) {
        int[] nums = {12, 13, 14, 15 };
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));


    }
    static void change(int[] arr){
        arr[0] = 99;
    }
}

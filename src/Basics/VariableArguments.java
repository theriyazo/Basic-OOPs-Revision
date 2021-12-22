package Basics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VariableArguments {
    public static void main(String[] args) {
        VarArgs(4, 5, 5, 7, 8);
        multiples(4, 5, 5,"riyaz","ahamad","Number");

    }
    static void VarArgs(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void multiples(int a, int b, int c, String ...v){
        System.out.println(Arrays.toString(v));
    }

}

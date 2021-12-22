package Basics;

import java.util.Scanner;
import java.util.function.Function;

public class SumMethod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter How many times you want to repeat");
        int repetition = in.nextInt();

        for (int i=0; i<repetition; i++){
           sum();
        }
    }
    static void sum(){
        Scanner in = new Scanner(System.in);

        int num1, num2;
        System.out.println("Enter Your First Number");
        num1 = in.nextInt();
        System.out.println("Enter Your Second Number");
        num2 = in.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum of "+num1+" & "+num2+" is : "+sum);
    }

}

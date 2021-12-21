package dsa;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter N value");
        int N = in.nextInt();

        int a = 0;
        int b = 1;
        int c;
        for (int i=0; i<=N; i++){
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;



        }
    }
}

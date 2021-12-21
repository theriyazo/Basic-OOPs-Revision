package dsa;

import java.util.Scanner;

public class Occurrence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter A number");
        int num = in.nextInt();
        System.out.println("Enter a number to check for Reoccurrence");
        int occrr = in.nextInt();
        int count = 0;

        while (num>0){

            int rem = num%10;
            num = num/10;

            if(rem == occrr){
                count++;
            }

        }
        System.out.println(count);

    }
}

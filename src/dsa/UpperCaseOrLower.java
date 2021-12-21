package dsa;

import java.util.Scanner;

public class UpperCaseOrLower {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Character to Check Lower Case or Upper Case");

        char ch = in.next().trim().charAt(0);
        WhichCase Charecter = new WhichCase();
        Charecter.isUpper(ch);


    }
}
class WhichCase{
//    char ch;

    void isUpper(char ch){
        if(ch >= 'a' && ch <='z'){
            System.out.println(ch+" : is Lower Case");
        }
        else{
            System.out.println(ch+" : is Upper Case");
        }

    }
}
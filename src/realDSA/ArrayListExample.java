package realDSA;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);

        //Syntax
        //ArrayList<data_type>  list_name = new ArrayList<>(initial_capacity);

        ArrayList<Integer> IntList = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
                IntList.add(in.nextInt());
        }

        for (int i = 0; i < 6; i++) {
            System.out.print(IntList.get(i) + " ");
        }
    }
}

package realDSA;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);

        //Syntax
        //ArrayList<data_type>  list_name = new ArrayList<>(initial_capacity);

        System.out.println("Enter 6 elements");
//      Add elements to list
        ArrayList<Integer> IntList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
                IntList.add(in.nextInt());
        }

//      Get element at any index
        for (int i = 0; i < 3; i++) {
            System.out.print(IntList.get(i) + " ");
        }

//      replace element from the list
        IntList.set(0, 99); //replaces 0th index value to 99

//      Print elements after replace is done
        System.out.println(IntList);

//      Finding an element from the list
        System.out.println(IntList.contains(99)); // printing the result

//      Remove an element from the array
        IntList.remove(0);
        System.out.println(IntList.contains(99)); // printing the result


//      2D ArrayList

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Initialization
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>()); //Making 2D
        }

        //Adding Element
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }

        // Print 2D ArrayList
        System.out.println(list);

    }
}

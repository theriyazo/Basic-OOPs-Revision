package Basics;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Employee Id");
        int empID = in.nextInt();

        switch (empID){
            case 1 -> System.out.println("Employee 1");
            case 2 -> System.out.println("Employee 2");
            case 3 -> System.out.println("Employee 3");
            case 4 -> System.out.println("Employee 4");
            case 5 -> {
                System.out.println("Please enter department name");
                String deprt = in.next();
                switch (deprt){
                    case "IT" -> System.out.println("IT Department.");
                    case "Management" -> System.out.println("Management Department.");
                    case "Banking" -> System.out.println("Banking Department.");
                    default -> System.out.println("enter a valid department");
                }
            }
            default -> System.out.println("Please enter a valid employee id, "+empID);
        }

    }
}

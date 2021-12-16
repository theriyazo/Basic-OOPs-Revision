package encapsulation;

import java.util.Scanner;

public class EncapsulationLesson {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Laptop l1 = new Laptop();

        System.out.println("Enter the price with your Private Key");

        int priceInput = in.nextInt();

        in.nextLine();

        String passKey = in.nextLine();

        l1.setPrice(priceInput,passKey);
        System.out.println(l1.getPrice());

    }

}
class Laptop{
    public int getPrice() {
        return price;
    }
    int ram;
    private int price;

    public void setPrice(int price, String key){
        String pswd = "riyaz123";
        if (pswd.equals(key)){
            this.price=price;
        }else{
            System.out.println("Worng private key");
        }


    }
}
